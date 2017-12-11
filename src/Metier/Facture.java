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
public class Facture {
    
    private int numf;
    private Date datefacture;
    private double totalht;
    private double tauxtva;
    private double totaltva;
    private double ttc;     
    private Bonlivraison idlivraison;
    private Venteparticulier idventep;
    private double prixfacture;
    private double prix;

    public Facture() {
    }

    public Facture(int numf, Date datefacture, double totalht, double tauxtva, double totaltva, double ttc, Bonlivraison idlivraison, Venteparticulier idventep, double prixfacture, double prix) {
        this.numf = numf;
        this.datefacture = datefacture;
        this.totalht = totalht;
        this.tauxtva = tauxtva;
        this.totaltva = totaltva;
        this.ttc = ttc;
        this.idlivraison = idlivraison;
        this.idventep = idventep;
        this.prixfacture = prixfacture;
        this.prix = prix;
    }

    public int getNumf() {
        return numf;
    }

    public Date getDatefacture() {
        return datefacture;
    }

    public double getTotalht() {
        return totalht;
    }

    public double getTauxtva() {
        return tauxtva;
    }

    public double getTotaltva() {
        return totaltva;
    }

    public double getTtc() {
        return ttc;
    }

    public Bonlivraison getIdlivraison() {
        return idlivraison;
    }

    public Venteparticulier getIdventep() {
        return idventep;
    }

    public double getPrixfacture() {
        return prixfacture;
    }

    public double getPrix() {
        return prix;
    }

    public void setNumf(int numf) {
        this.numf = numf;
    }

    public void setDatefacture(Date datefacture) {
        this.datefacture = datefacture;
    }

    public void setTotalht(double totalht) {
        this.totalht = totalht;
    }

    public void setTauxtva(double tauxtva) {
        this.tauxtva = tauxtva;
    }

    public void setTotaltva(double totaltva) {
        this.totaltva = totaltva;
    }

    public void setTtc(double ttc) {
        this.ttc = ttc;
    }

    public void setIdlivraison(Bonlivraison idlivraison) {
        this.idlivraison = idlivraison;
    }

    public void setIdventep(Venteparticulier idventep) {
        this.idventep = idventep;
    }

    public void setPrixfacture(double prixfacture) {
        this.prixfacture = prixfacture;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    

    
    
}
