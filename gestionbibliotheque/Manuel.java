/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 * Enregistre les oinformations d'un manuel
 */
public class Manuel extends Livre {
    private int niveau;
    
    public Manuel(){
        super();
    }

    public Manuel(int niveau, String auteur, int nbrPages, int numEnregistrement, String titre) {
        super(auteur, nbrPages, numEnregistrement, titre);
        this.niveau = niveau;
    }

    /**
     * @return the niveau
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     * @param niveau the niveau to set
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Manuel{" + "niveau=" + niveau + '}';
    }
    
    
    
    
    
    
}
