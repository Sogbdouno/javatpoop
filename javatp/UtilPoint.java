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
public class UtilPoint {
    private Point point;
    public double distance(Point point1, Point point2){
        
        double d = Math.sqrt(Math.pow(point1.getAbcisse()-point2.getAbcisse(),2.0)
        + Math.pow(point1.getOrdonnee()-point2.getOrdonnee() ,2.0));
        
        return d;
    }
    
    public double prodScal(Point t, Point k){
        
        return 0.0;
    }
    
    public double somme(Point p, Point k){
        double x = (p.getAbcisse()+k.getAbcisse());
        double y = (p.getOrdonnee()+k.getOrdonnee());
        
        double s = x+y;
        return s;
    }

      

   
}
