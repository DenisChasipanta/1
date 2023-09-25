package com.denis.evaluacion.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaPrincipal {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/registros")
    public String registros(){
        return "registos";
    }

}
