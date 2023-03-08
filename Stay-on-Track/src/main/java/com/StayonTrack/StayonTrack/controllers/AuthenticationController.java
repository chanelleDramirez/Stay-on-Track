package com.StayonTrack.StayonTrack.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthenticationController {
    @GetMapping("/login")
    public String showLoginForm(){
        return "login";

    }


    }



//    @GetMapping("/login") // Passing Data to Views //
//    public String showLoginForm(@PathVariable String login, Model model){
//        model.addAttribute("login", login);
//        return "login";
//
//    }
//, <span th:text="${login}">Log In</span> // Passing Data to Views on html//



//    @PostMapping("/login") // Getting Data from Views//
//    public String loginInformation(@RequestParam(name = "welcome")String welcome, Model model) {
//        model.addAttribute("welcome", "Welcome to Stay on Track" + welcome + "!" );
//        return "login";
//    }