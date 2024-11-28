package com.master.gestionCabinet.repositories;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.master.gestionCabinet.model.Patient;
import com.master.gestionCabinet.model.RendezVous;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
     
}
