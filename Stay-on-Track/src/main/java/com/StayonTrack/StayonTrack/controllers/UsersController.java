package com.StayonTrack.StayonTrack.controllers;


import com.StayonTrack.StayonTrack.Repository.UserRepository;
import com.StayonTrack.StayonTrack.models.Task;
import com.StayonTrack.StayonTrack.models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class UsersController {
    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;

    private UsersController Dao;
    
    

    public UsersController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@ModelAttribute User user) {
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);
        return "redirect:/login";
    }

    @GetMapping("/profile")
    public String showProfile() {
        return "profile";
    }

    @GetMapping("/create")
    public String createTask() {
        return "create";
    }

    @RequestMapping("/create/task")
    public String createTask(Model model) {
        model.addAttribute("task", new Task());
        return "create";
    }

    @RequestMapping(value = "/save/task", method = RequestMethod.POST)
    public String save(@ModelAttribute("task") Task task) {
        Dao.save(task);
        return "redirect:/profile";
    }

    @RequestMapping("/read/task")
    public String readtask(Model model) {
        List<Task> list = Dao.getTask();
        model.addAttribute("list", list);
        return "read";
    }

    private List<Task> getTask() {
        return null; 
    }

    @RequestMapping(value = "/update/{id}")
    public String updateTask(@PathVariable int id, Model model) {
        Task task = Dao.getTaskById(id);
        model.addAttribute("task", task);
        return "update";
    }

    private Task getTaskById(int id) {
        return null;
    }

    @RequestMapping(value = "/saveUpdate/task", method = RequestMethod.POST)
    public String saveUpdate(@ModelAttribute("task") Task task) {
        Dao.update(task);
        return "redirect:/profile";
    }

    private void update(Task task) {
    }


    @RequestMapping(value = "/delete/{id}/task", method = RequestMethod.GET)
    public String delete(@PathVariable int id) {
        Dao.delete(id);
        return "redirect:/profile";
    }


}




//@PostMapping("/create")
//public String create(@ModelAttribute Task task) {
//       // User user = userDao.getById(1L);
//    task = new Task();
//        userDao.save(task);
//        return"profile";
//}

//@GetMapping("/update")
//    public String updateTask(){
//        return "update";
//}


