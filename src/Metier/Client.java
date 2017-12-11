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
public class Client {
 
    private int codec;
  private String nom;
  private String matriculefiscale;
  private String adresselivraison;
  private int numtel;
  private String modepaiement;

    public Client() {
    }

    public Client(int codec, String nom, String matriculefiscale, String adresselivraison, int numtel, String modepaiement) {
        this.codec = codec;
        this.nom = nom;
        this.matriculefiscale = matriculefiscale;
        this.adresselivraison = adresselivraison;
        this.numtel = numtel;
        this.modepaiement = modepaiement;
    }

    public int getCodec() {
        return codec;
    }

    public String getNom() {
        return nom;
    }

    public String getMatriculefiscale() {
        return matriculefiscale;
    }

    public String getAdresselivraison() {
        return adresselivraison;
    }

    public int getNumtel() {
        return numtel;
    }

    public String getModepaiement() {
        return modepaiement;
    }

    public void setCodec(int codec) {
        this.codec = codec;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatriculefiscale(String matriculefiscale) {
        this.matriculefiscale = matriculefiscale;
    }

    public void setAdresselivraison(String adresselivraison) {
        this.adresselivraison = adresselivraison;
    }

    public void setNumtel(int numtel) {
        this.numtel = numtel;
    }

    public void setModepaiement(String modepaiement) {
        this.modepaiement = modepaiement;
    }
  
  
  
    
}
