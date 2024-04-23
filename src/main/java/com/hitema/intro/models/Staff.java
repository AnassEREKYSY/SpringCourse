package com.hitema.intro.models;

import jakarta.persistence.*;

@Entity
    @Table(name="staff")
public class Staff {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="staff_id")
    private Long id;

    @Column(name="first_name")
    private String prenom;

    @Column(name="last_name")
    private String nom;

    @Column(name="picture")
    private byte[] picture;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
