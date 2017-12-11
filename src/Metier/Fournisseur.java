/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

/**
 *
 * @author Ali
 */
public class Fournisseur {
    
    private int codef;
    private String nom;
    private String raisonsocial;
    private String adresse;
    private int numtel;
    private String numfax;

    public Fournisseur() {
    }

    public Fournisseur(int codef, String nom, String raisonsocial, String adresse, int numtel, String numfax) {
        this.codef = codef;
        this.nom = nom;
        this.raisonsocial = raisonsocial;
        this.adresse = adresse;
        this.numtel = numtel;
        this.numfax = numfax;
    }

    public int getCodef() {
        return codef;
    }

    public String getNom() {
        return nom;
    }

    public String getRaisonsocial() {
        return raisonsocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumtel() {
        return numtel;
    }

    public String getNumfax() {
        return numfax;
    }

    public void setCodef(int codef) {
        this.codef = codef;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRaisonsocial(String raisonsocial) {
        this.raisonsocial = raisonsocial;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public void setNumfax(String numfax) {
        this.numfax = numfax;
    }
    
    
    
}
