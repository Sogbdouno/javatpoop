/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.gestionbibliotheque;

/**
 *
 * @author boubadiop
 */
public class TestDocumentBibliotheque {
    public static void main(String[]args){
        Bibliotheque biblio = new Bibliotheque(5);
            Document d = new Document();
            d.setNumEnregistement(2);
            d.setTitre("Cuisine");
            biblio.ajouter(d);
            
            Document d1 = new Document(3,"JAVA");
            biblio.ajouter(d1);
            
            Document d3 = new Document(5,"MANGAS");
            biblio.ajouter(d3);
            
            biblio.afficheDocument();
            
            Livre l = new Livre();
            l.setAuteur("Mariama Ba");
            l.setNbrPages(378);
            l.setNumEnregistement(6);
            l.setTitre("une si longue lettre");
            
            biblio.ajouter(l);
            biblio.afficherAuteurs();
            
            
    }
}
