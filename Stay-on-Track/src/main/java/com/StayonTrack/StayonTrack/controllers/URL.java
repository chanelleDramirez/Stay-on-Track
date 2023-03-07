package com.StayonTrack.StayonTrack.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class URL {

    @GetMapping("/home")
    @ResponseBody
    public String homePage(){
        return "Stay on Track";
    }
}
