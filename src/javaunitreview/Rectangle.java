/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunitreview;

/**
 *
 * @author vira
 */
public class Rectangle {
    double width;
    double height;
    double per;
    double circum;
    
    public void Rectangle(double r_width,double r_height){
        this.height=r_height;
        this.width=r_width;
        
    }
    
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeigt(double heigt) {
        this.height = heigt;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double Perimeter(double width,double height){
        return width * height;
    } 
    
   
    public double Circumferance(double width,double height){
        circum = 2*(width+height);
        return circum;
    }
    
}
