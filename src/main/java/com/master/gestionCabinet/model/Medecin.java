package com.master.gestionCabinet.model;

 

import javax.persistence.Entity;

@Entity
public class Medecin extends User {

    private String specialite;

    // Constructeurs, getters et setters
    public Medecin() {}

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}