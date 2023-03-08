package com.StayonTrack.StayonTrack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

    @GetMapping("/about-us")
    public String aboutUsPage(){
        return "about-us";
    }

}

