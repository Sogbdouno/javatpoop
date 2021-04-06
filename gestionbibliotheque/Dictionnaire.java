/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 * permet d'enregistrer les informations sur un dictionnaire
 */
public class Dictionnaire extends Document {
    private String langue;
    
    public Dictionnaire(){
        super();
    }
    
    public Dictionnaire(String langue, int numEnregistrement,String titre){
        super(numEnregistrement,titre);
        this.langue = langue;
    }

    /**
     * @return the langue
     */
    public String getLangue() {
        return langue;
    }

    /**
     * @param langue the langue to set
     */
    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" + "langue=" + langue + '}';
    }
    
    
}
