/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.groupesupinfo.exotableaux;



import java.util.Scanner;


/**
 *
 * @author boubadiop
 */
public class CarreImpaire {
    public static void main(String [] args){
       int n;
       int [][] tab;
       System.out.print("Combien de valeurs");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       tab = new int[n][2];
       for(int i=0; i<n; i++){
           tab[i][0] = 2*i+1;
           tab[i][1] = tab[i][0]*tab[i][0];
       }
       
       for(int i=0; i<n; i++){
           System.out.println(tab[i][0] + "a pour carre"+tab[i][1]);
       }
       
       
    }
}
