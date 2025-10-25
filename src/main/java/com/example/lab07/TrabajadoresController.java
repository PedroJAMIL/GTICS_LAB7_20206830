package com.example.lab07;

import com.example.lab07.Entitys.Trabajadores;
import com.example.lab07.Entitys.TrabajadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TrabajadoresController {
    @Autowired
    private TrabajadoresRepository trabajadoresRepository;

    @GetMapping("/trabajadores")
    public String listarTrabajadores(Model model) {
        List<Trabajadores> lista = trabajadoresRepository.findAll();
        model.addAttribute("trabajadores", lista);
        return "Trabajadores";
    }
}
