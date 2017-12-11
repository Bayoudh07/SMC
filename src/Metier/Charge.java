/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import java.util.Date;

/**
 *
 * @author Ali
 */
public class Charge {
    private int idcharge;
    private String description;
    private Date date;
    private double montant;
    private double timbre;
    private Facture idfacture;

    public Charge() {
    }

    public Charge(int idcharge, String description, Date date, double montant, double timbre, Facture idfacture) {
        this.idcharge = idcharge;
        this.description = description;
        this.date = date;
        this.montant = montant;
        this.timbre = timbre;
        this.idfacture = idfacture;
    }

    public int getIdcharge() {
        return idcharge;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }

    public double getTimbre() {
        return timbre;
    }

    public Facture getIdfacture() {
        return idfacture;
    }

    public void setIdcharge(int idcharge) {
        this.idcharge = idcharge;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setTimbre(double timbre) {
        this.timbre = timbre;
    }

    public void setIdfacture(Facture idfacture) {
        this.idfacture = idfacture;
    }

  
    
    
    
}
