package com.example.chmurka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CenikController {
    @GetMapping("/cenik")
    public String sayCenik() {
        return "templates/cenik.html";
    }
}
