package com.jamiussiam.SpringDispatchJava.beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerB {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Hello World from Controller B!");

        return "index";
    }
}
