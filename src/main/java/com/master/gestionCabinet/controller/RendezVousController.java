package com.master.gestionCabinet.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.master.gestionCabinet.model.RendezVous;
import com.master.gestionCabinet.service.RendezVousService;

@RestController
@RequestMapping("/api/rendezvous")
public class RendezVousController {

    @Autowired
    private RendezVousService rendezVousService;

    // Récupérer tous les rendez-vous
    @GetMapping
    public ResponseEntity<List<RendezVous>> getAllRendezVous() {
        List<RendezVous> rendezVousList = rendezVousService.getAllRendezVous();
        return ResponseEntity.ok(rendezVousList);
    }

    // Récupérer un rendez-vous par ID
    @GetMapping("/{id}")
    public ResponseEntity<RendezVous> getRendezVousById(@PathVariable Long id) {
        Optional<RendezVous> rendezVous = rendezVousService.getRendezVousById(id);
        if (rendezVous.isPresent()) {
            return ResponseEntity.ok(rendezVous.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Rendez-vous not found");
        }
    }

    // Créer un nouveau rendez-vous
    @PostMapping
    public ResponseEntity<RendezVous> createRendezVous(@RequestBody RendezVous rendezVous) {
        RendezVous savedRendezVous = rendezVousService.saveRendezVous(rendezVous);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRendezVous);
    }

    // Supprimer un rendez-vous par ID
    // Supprimer un rendez-vous par ID
    @DeleteMapping("/{id}")
    public void deleteRendezVous(@PathVariable Long id) {
        rendezVousService.deleteRendezVous(id);
    }

    // Récupérer les rendez-vous par date
    @GetMapping("/date")
    public ResponseEntity<List<RendezVous>> getRendezVousByDate(@RequestParam LocalDate date) {
        List<RendezVous> rendezVousList = rendezVousService.getRendezVousByDate(date);
        if (rendezVousList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(rendezVousList);
    }
}
