package com.master.gestionCabinet.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.master.gestionCabinet.model.RendezVous;
import com.master.gestionCabinet.repositories.RendezVousRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class RendezVousService {
    @Autowired
    private RendezVousRepository rendezVousRepository;

    public List<RendezVous> getAllRendezVous() {
        return rendezVousRepository.findAll();
    }

    public Optional<RendezVous> getRendezVousById(Long id) {
        return rendezVousRepository.findById(id);
    }

    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    public void deleteRendezVous(Long id) {
        rendezVousRepository.deleteById(id);
    }
    
    
    public List<RendezVous> getRendezVousByDate(LocalDate date) {
        return rendezVousRepository.findByJour(date);
    }
}

