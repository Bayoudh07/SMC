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
public class Bonlivraison {
      private int numbl;
    private Date date;
    private double prixtotal;
    private double total;
    private int quantite;
    private Client idclient;
    private Stock idstock;

    public Bonlivraison() {
    }

    public Bonlivraison(int numbl, Date date, double prixtotal, double total, int quantite, Client idclient, Stock idstock) {
        this.numbl = numbl;
        this.date = date;
        this.prixtotal = prixtotal;
        this.total = total;
        this.quantite = quantite;
        this.idclient = idclient;
        this.idstock = idstock;
    }

    public int getNumbl() {
        return numbl;
    }

    public Date getDate() {
        return date;
    }

    public double getPrixtotal() {
        return prixtotal;
    }

    public double getTotal() {
        return total;
    }

    public int getQuantite() {
        return quantite;
    }

    public Client getIdclient() {
        return idclient;
    }

    public Stock getIdstock() {
        return idstock;
    }

    public void setNumbl(int numbl) {
        this.numbl = numbl;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPrixtotal(double prixtotal) {
        this.prixtotal = prixtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setIdclient(Client idclient) {
        this.idclient = idclient;
    }

    public void setIdstock(Stock idstock) {
        this.idstock = idstock;
    }
    
    
    
}
