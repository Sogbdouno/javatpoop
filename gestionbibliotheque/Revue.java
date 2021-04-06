/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 * Enregistre les infrmations sur une Revue
 */
public class Revue extends Document {
    private int mois;
    private int annee;
    
    public Revue(){
        super();
    }
    
    public Revue(int mois,int annee,int numEnregistrement,String titre){
       super(numEnregistrement,titre);
       this.mois = mois;
       this.annee = annee;
    }

    /**
     * @return the mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @param mois the mois to set
     */
    public void setMois(int mois) {
        this.mois = mois;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Revue{" + "mois=" + mois + ", annee=" + annee + '}';
    }
    
    
}
