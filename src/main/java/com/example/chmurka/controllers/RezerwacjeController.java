package com.example.chmurka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RezerwacjeController {

    @GetMapping("/rezerwacje")
    public String sayRezerwacje() {
        return "templates/rezerwacje.html";
    }
}
