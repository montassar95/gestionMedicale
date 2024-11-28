package com.master.gestionCabinet.model;

 
 

import javax.persistence.Entity;

@Entity
public class Patient extends User {

    private String prenom;

    // Constructeurs, getters et setters
    public Patient() {}

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
