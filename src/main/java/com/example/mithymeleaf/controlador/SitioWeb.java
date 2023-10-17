package com.example.mithymeleaf.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class SitioWeb {

    @GetMapping("")
    public String paginaPrincipal(){
        return "index";
    }

    @GetMapping("/tablaAlumnos")
    public String tablaAlumnos(){
        return "tabla";
    }
}
