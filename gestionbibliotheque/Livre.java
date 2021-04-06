/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 * Enregistre les informations sur un livre
 */
public class Livre extends Document {
    private String auteur;
    private int nbrPages;
    
    public Livre(){
        super();
    }

    public Livre(String auteur, int nbrPages, int numEnregistrement, String titre) {
        super(numEnregistrement, titre);
        this.auteur = auteur;
        this.nbrPages = nbrPages;
    }

    /**
     * @return the auteur
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the nbrPages
     */
    public int getNbrPages() {
        return nbrPages;
    }

    /**
     * @param nbrPages the nbrPages to set
     */
    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString() {
        return "Livre{" + "auteur=" + auteur + ", nbrPages=" + nbrPages + '}';
    }
    
    
    
    
    
}
