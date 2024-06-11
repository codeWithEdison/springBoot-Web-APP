package com.codewithedison.SpringWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public  String home(){
        return "HEY WELCOME TO OUR SITE";
    }

    @RequestMapping("/about")
    public  String about(){
        return  "warm welcome to about us we have some thing special for u";
    }
}
