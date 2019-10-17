/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunitreview;

//    Write a method to calculate the sum and multiplication of a given array of numbers.

/**
 *
 * @author Devin Chandula
 */

public class Array {
    
    public String getSumMul(int[] arr){
        int sum=0;
        int pro=1;
        
        for(int i=0; i<arr.length;i++){
                sum = sum + arr[i];
                pro= pro * arr[i];
                
        }
        
        return sum+" "+pro;
    
}
    
    public String getDoubleSumMul(double[] arr){
    double dsum=0.0;
    double dpro=1.0;
    
    for(int i=0;i<arr.length;i++)
    {
        dsum=dsum+arr[i];
        dpro=dpro*arr[i];
    }
    
    return dsum+" "+dpro;
    }
}
