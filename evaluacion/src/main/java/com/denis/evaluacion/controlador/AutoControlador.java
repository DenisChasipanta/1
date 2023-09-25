package com.denis.evaluacion.controlador;

import com.denis.evaluacion.entidad.Auto;
import com.denis.evaluacion.repositorio.AutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AutoControlador {
    @Autowired
    AutoRepositorio autoRepositorio;
    @GetMapping("/registro")
    public String registro(Model model){
        model.addAttribute("registro", new Auto());
        return "registro";
    }
    @GetMapping("/autos")
    public String auto(Model model){
        List<Auto> auto= autoRepositorio.findAll();
        model.addAttribute("auto",auto);
                return "auto";
    }
    @PostMapping("/registro")
    public String crear(Auto auto){
        autoRepositorio.save(auto);
        return "redirect://auto";
    }
}
