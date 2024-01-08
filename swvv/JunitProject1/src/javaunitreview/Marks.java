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
public class Marks {
    
    public int[] getMarks(int[] marks){
        
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]*2;
        }
        
        return marks;
                
    }
    
}
