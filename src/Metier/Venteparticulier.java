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
public class Venteparticulier {
    
    private int idvp;
    private int quantitevp;
    private double prixtothtvp;
    private Stock idstock;

    public Venteparticulier() {
    }

    public Venteparticulier(int idvp, int quantitevp, double prixtothtvp, Stock idstock) {
        this.idvp = idvp;
        this.quantitevp = quantitevp;
        this.prixtothtvp = prixtothtvp;
        this.idstock = idstock;
    }

    public int getIdvp() {
        return idvp;
    }

    public int getQuantitevp() {
        return quantitevp;
    }

    public double getPrixtothtvp() {
        return prixtothtvp;
    }

    public Stock getIdstock() {
        return idstock;
    }

    public void setIdvp(int idvp) {
        this.idvp = idvp;
    }

    public void setQuantitevp(int quantitevp) {
        this.quantitevp = quantitevp;
    }

    public void setPrixtothtvp(double prixtothtvp) {
        this.prixtothtvp = prixtothtvp;
    }

    public void setIdstock(Stock idstock) {
        this.idstock = idstock;
    }
    
    
    
}
