package com.ecommerce.microcommercefront.web.model;

public class Produit {

    private int id;

    private String nom;

    private int prix;

    //information que nous ne souhaitons pas exposer
    //private int prixAchat;

    //constructeur par défaut
    public Produit() {
    }

    //constructeur pour nos tests
    public Produit(int id, String nom, int prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}
