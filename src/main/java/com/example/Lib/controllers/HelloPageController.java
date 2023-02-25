package com.example.Lib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPageController {

    @GetMapping("/")
    public String helloPage(){
        return "redirect";
    }
}
