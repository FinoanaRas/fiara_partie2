package com.pack.fiaraoccaz.entity;
import java.text.CollationElementIterator;
import jakarta.persistence.*;

@Entity
@Table(name = "marque")
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmarque")
    private Long idmarque;

    @Column(name= "nom", nullable = false)
    private String nom;

    //constructeur par defaut
    public Marque(){

    }
    //Constructeur avec parametres
    public Marque(String nom){
        this.nom = nom;
    }

    // Getters and setters

    public Long getIdMarque(){
        return idmarque;
    }
    public void setIdMarque(Long idmarque){
        this.idmarque = idmarque;

    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public Marque(Long value) {
        this.idmarque = value;
    }

    public void setId(String id){
        Long l = Long.valueOf(id);
        this.setIdMarque(l);
    }

    public Marque(String id , String eneString){
        this.setNom(eneString);
        this.setId(id);
    }

}

