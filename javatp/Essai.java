/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.javatp;

/**
 *
 * @author boubadiop
 */
public class Essai {
    
    public Essai(){
        
    }

    public void afficher(){
        
        System.out.println("C'est votre derniere chance les gars!");
    }
    
    public static void main (String[]args){
       
        Essai e = new Essai();
        e.afficher();
        System.out.println(e);
    }
}
