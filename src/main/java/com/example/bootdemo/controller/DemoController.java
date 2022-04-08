package com.example.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("home")
    public String demo(){
        return "Hello Demo";
    }

    @GetMapping("home2")
    public String welcome(Model model){
        model.addAttribute("message", "welcome to the demo");
        return "welcome";
    }

}
