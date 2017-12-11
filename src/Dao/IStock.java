/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Metier.Client;
import Metier.Fournisseur;
import Metier.Produit;
import java.util.List;

/**
 *
 * @author Ali
 */
public interface IStock {
      
    //produis
        public void ajouterProduit(Produit p);
	public List <Produit> getAllProduits();
	public Produit getProduitC(int code);
        public Produit getProduitlib(String lib);
	public void removeProduit(int id);
	public void updateProduit(Produit p);
	
   //Clients 
        
         public void ajouterClient(Client c);
	public List <Client> getAllClients();
	public Client getClientC(int code);
        public List <Client> getClientN(String nom);
        public Client getClientMF(String mf);
	public void removeClient(int id);
	public void updateClient(Client c);
        
   // Fournisseur  
        
        public void ajouterFournisseur(Fournisseur f);
	public List <Fournisseur> getAllFournisseurs();
	public Fournisseur getFournisseurC(int code);
        public List <Fournisseur> getFournisseursN(String nom);
        public void removeFournisseur(int id);
	public void updateFournisseur(Fournisseur f);
        
        
     //  
        
}
