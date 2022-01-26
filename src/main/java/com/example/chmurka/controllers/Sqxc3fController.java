package com.example.chmurka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sqxc3fController {
    @GetMapping("/sqxc3f")
    public String saySqxc3f() {
        return "templates/sqxc3f.html";
    }
}
