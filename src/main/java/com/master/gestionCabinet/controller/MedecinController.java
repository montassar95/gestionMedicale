package com.master.gestionCabinet.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.master.gestionCabinet.model.Medecin;
import com.master.gestionCabinet.service.MedecinService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medecins")
public class MedecinController {
    @Autowired
    private MedecinService medecinService;

    @GetMapping
    public List<Medecin> getAllMedecins() {
        return medecinService.getAllMedecins();
    }

    @GetMapping("/{id}")
    public Optional<Medecin> getMedecinById(@PathVariable Long id) {
        return medecinService.getMedecinById(id);
    }

    @PostMapping
    public Medecin createMedecin(@RequestBody Medecin medecin) {
        return medecinService.saveMedecin(medecin);
    }

    @DeleteMapping("/{id}")
    public void deleteMedecin(@PathVariable Long id) {
        medecinService.deleteMedecin(id);
    }
}

