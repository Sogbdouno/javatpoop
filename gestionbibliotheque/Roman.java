/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 * 
 * permet d'enregistrer les informations sur un Roman
 */
public class Roman extends Livre {
    private String prixLitteraire;
    
    public Roman(){
        super();
    }

    public Roman(String prixLitteraire, String auteur, int nbrPages, int numEnregistrement, String titre) {
        super(auteur, nbrPages, numEnregistrement, titre);
        this.prixLitteraire = prixLitteraire;
    }

    /**
     * @return the prixLitteraire
     */
    public String getPrixLitteraire() {
        return prixLitteraire;
    }

    /**
     * @param prixLitteraire the prixLitteraire to set
     */
    public void setPrixLitteraire(String prixLitteraire) {
        this.prixLitteraire = prixLitteraire;
    }

    @Override
    public String toString() {
        return "Roman{" + "prixLitteraire=" + prixLitteraire + '}';
    }

    

    
    
    
}
