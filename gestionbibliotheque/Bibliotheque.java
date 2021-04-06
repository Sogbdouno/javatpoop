/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;


/**
 *
 * @author boubadiop
 * Enregistre les informations sur une bibliotheque
 */
public class Bibliotheque {
    private int capacite;
    private int nb=0;
    private Document [] listDocs;
    
    public Bibliotheque(int capacite){
        this.capacite = capacite;
        listDocs = new Document[5];
        nb=0;
    }
    
    public void afficheDocument(){
       for(Document D:listDocs){
           System.out.println(D);
       }
    }
    public Document document(int i){
        
        return(listDocs[i]);
    }
    
    public boolean ajouter(Document doc){
        if(nb<listDocs.length){
            this.listDocs[nb++] = doc;
        }
        return true;
    }
    
    public boolean supprimer(Document doc){
       for(int i=0;i<listDocs.length;i++){
           if(listDocs[i].numEnregistement==(doc.numEnregistement)){
              listDocs[i]=listDocs[i+1]; 
           }
           nb--;
       }
       return true;
    }
    
    public void afficherAuteurs(){
        for(int i=0;i<listDocs.length;i++){
            if(listDocs[i] instanceof Livre){
                System.out.println((Livre)listDocs[i]);
            }
        }
    }
    
    
    
    
}
