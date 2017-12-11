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
public class Gain {
    
    private int idgain;
    private Date date;
    private double montantgain;
    private Charge idcharge;
    private Facture idfacture;

    public Gain() {
    }

    public Gain(int idgain, Date date, double montantgain, Charge idcharge, Facture idfacture) {
        this.idgain = idgain;
        this.date = date;
        this.montantgain = montantgain;
        this.idcharge = idcharge;
        this.idfacture = idfacture;
    }

    public int getIdgain() {
        return idgain;
    }

    public Date getDate() {
        return date;
    }

    public double getMontantgain() {
        return montantgain;
    }

    public Charge getIdcharge() {
        return idcharge;
    }

    public Facture getIdfacture() {
        return idfacture;
    }

    public void setIdgain(int idgain) {
        this.idgain = idgain;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMontantgain(double montantgain) {
        this.montantgain = montantgain;
    }

    public void setIdcharge(Charge idcharge) {
        this.idcharge = idcharge;
    }

    public void setIdfacture(Facture idfacture) {
        this.idfacture = idfacture;
    }
    
    
    
    
}
