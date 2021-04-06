/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 * Perment d'enregistrer les informations sur un document
 */
public class Document {
    protected int numEnregistement;
    private String titre;
    
    public Document(){
        
    }
    
    public Document(int numEnregistrement, String titre){
        this.numEnregistement = numEnregistrement;
        this.titre = titre;
    }

    /**
     * @return the numEnregistement
     */
    public int getNumEnregistement() {
        return numEnregistement;
    }

    /**
     * @param numEnregistement the numEnregistement to set
     */
    public void setNumEnregistement(int numEnregistement) {
        this.numEnregistement = numEnregistement;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document{" + "numEnregistement=" + numEnregistement + ", titre=" + titre + '}';
    }
    
    
    
    
    
    
}
