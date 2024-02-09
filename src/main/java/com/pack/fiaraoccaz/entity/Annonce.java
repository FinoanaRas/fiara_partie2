package com.pack.fiaraoccaz.entity;
 
import jakarta.persistence.*;


@Entity
@Table(name = "annonce")
public class Annonce{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idannonce")
    private Long idannonce;


   @ManyToOne
   @JoinColumn(name = "idvoiture")
    private Voiture voiture;
    

    @Column(name = "description")
    private String description;

    @Column(name = "etat")
    private int etat;


    // Constructeur par défaut
    public Annonce() {
    }


    //Constructeur avec parametres
    public Annonce(Long idannonce, Voiture voiture, String description,int etat){
        this.idannonce = idannonce;
        this.voiture = voiture;
        this.description = description;
        this.etat = etat; 

    }

    //getters et setters
    public Long getIdAnnonce(){
        return idannonce;
    }
    public void setIdAnnonce(Long id){
        this.idannonce = idannonce;
    }


    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public int getEtat(){
        return etat;
    }
    public void setEtat(int etat){
        this.etat = etat;
    }

    

}