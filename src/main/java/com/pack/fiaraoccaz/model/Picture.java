package com.pack.fiaraoccaz.model;

import jakarta.persistence.*;

@Entity
@Table(name = "picture")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpicture")
    int idpicture;
    @Column(name = "picture")
    String picture;
    @Column(name = "idvoiture")
    int idvoiture;
    String base64;

    public int getIdpicture() {
        return idpicture;
    }
    public void setIdpicture(int idpicture) {
        this.idpicture = idpicture;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public int getIdvoiture() {
        return idvoiture;
    }
    public void setIdvoiture(int idvoiture) {
        this.idvoiture = idvoiture;
    }
    public String getBase64() {
        return base64;
    }
    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
