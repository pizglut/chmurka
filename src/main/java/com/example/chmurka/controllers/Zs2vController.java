package com.example.chmurka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Zs2vController {
    @GetMapping("/zs2v")
    public String sayZs2v() {
        return "templates/zs2v.html";
    }
}
