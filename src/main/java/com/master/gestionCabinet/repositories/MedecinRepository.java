package com.master.gestionCabinet.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.gestionCabinet.model.Medecin;
import com.master.gestionCabinet.model.RendezVous;


@Repository
public interface MedecinRepository extends JpaRepository<Medecin, Long> {
     
}
