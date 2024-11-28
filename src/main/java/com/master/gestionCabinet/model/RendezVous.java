package com.master.gestionCabinet.model;

 

import javax.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medecin_id", nullable = false)
    private Medecin medecin;

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    private LocalDate jour;  // Attribut pour la date du rendez-vous
    private LocalTime heure; // Attribut pour l'heure du rendez-vous

    // Constructeur par défaut
    public RendezVous() {
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getJour() {
        return jour;
    }

    public void setJour(LocalDate jour) {
        this.jour = jour;
    }

    public LocalTime getHeure() {
        return heure;
    }

    public void setHeure(LocalTime heure) {
        this.heure = heure;
    }

    @Override
    public String toString() {
        return "RendezVous{" +
                "id=" + id +
                ", medecin=" + medecin +
                ", patient=" + patient +
                ", jour=" + jour +
                ", heure=" + heure +
                '}';
    }
}
