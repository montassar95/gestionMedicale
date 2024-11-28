package com.master.gestionCabinet.repositories;

 
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.gestionCabinet.model.RendezVous;


@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
	
	 List<RendezVous> findByJour(LocalDate jour);
     
}
