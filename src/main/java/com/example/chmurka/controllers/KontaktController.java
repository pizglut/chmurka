package com.example.chmurka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KontaktController {
    @GetMapping("/kontakt")
    public String sayKontakt() {
        return "templates/kontakt.html";
    }
}
