package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
@RequestMapping("/index")
    public String index(Model model){
     String message="Hello,Thymeleaf!";
     model.addAttribute("message",message);
        return "index";
    }


}
