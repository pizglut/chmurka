package com.example.chmurka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfertaController {

    @GetMapping("/oferta")
    public String sayOferta() {
        return "templates/oferta.html";
    }
}
