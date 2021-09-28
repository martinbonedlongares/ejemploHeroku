/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejemploHeroku.controllers;

import com.example.ejemploHeroku.entities.Persona;
import com.example.ejemploHeroku.repositories.PersonaRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class SaludarController {
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola mundo";
    }
    
    
    @Autowired
    private PersonaRepository repo;
    @GetMapping("/add")
    public List<Persona> add(){
        Persona p=new Persona();
        p.setNombre(UUID.randomUUID().toString());
        return repo.findAll();
    }
}
