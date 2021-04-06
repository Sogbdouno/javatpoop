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
public class Point {
    private double x;
    private double y;
    
    public Point(){
        
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getAbcisse() {
        return x;
    }

    public double getOrdonnee() {
        return y;
    }

    public void setAbcisse(double x) {
        this.x = x;
    }

    public void setOrdonnee(double y) {
        this.y = y;
    }
    
    public void afficher(){
        System.out.println(this.toString());
//        System.out.println("y"+getOrdonnee());
        
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
