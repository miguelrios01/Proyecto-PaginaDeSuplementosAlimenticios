package com.proyecto.proyectods4.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyectods4.Models.Acercade;
import com.proyecto.proyectods4.Models.Colaboradores;
import com.proyecto.proyectods4.Models.Infoextra;
import com.proyecto.proyectods4.Services.AboutDb;

@RestController
public class AboutController {
    
    @GetMapping("/acerca_de/all")
    public List<Acercade> ObtenerTodoAcercade(){ 
        return new AboutDb().ObtenerAcercade();
    }

    @GetMapping("/colaboradores/all")
    public List<Colaboradores> ObtenerTodoColaboradores(){ 
        return new AboutDb().ObtenerColaboradores();
    }

    @GetMapping("/info_extra/all")
    public List<Infoextra> ObtenerTodaInfoextra(){ 
        return new AboutDb().ObtenerInfoextra();
    }
}
