package com.taller.vh.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthControlador {
    @GetMapping("/login")
    String login(){
        return "/login";
    }
}