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
public class Stock {
    
    private int idstock;
    private int quantitestock;
    private Produit idproduit;
    private Client idclient;

    public Stock() {
    }

    public Stock(int idstock, int quantitestock, Produit idproduit, Client idclient) {
        this.idstock = idstock;
        this.quantitestock = quantitestock;
        this.idproduit = idproduit;
        this.idclient = idclient;
    }

    public int getIdstock() {
        return idstock;
    }

    public int getQuantitestock() {
        return quantitestock;
    }

    public Produit getIdproduit() {
        return idproduit;
    }

    public Client getIdclient() {
        return idclient;
    }

    public void setIdstock(int idstock) {
        this.idstock = idstock;
    }

    public void setQuantitestock(int quantitestock) {
        this.quantitestock = quantitestock;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    public void setIdclient(Client idclient) {
        this.idclient = idclient;
    }

  
    
    
    
    
    
    
    
}
