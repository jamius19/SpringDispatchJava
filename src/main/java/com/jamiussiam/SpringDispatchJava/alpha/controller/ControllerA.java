package com.jamiussiam.SpringDispatchJava.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerA {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Hello World from Controller A!");

        return "index";
    }
}
