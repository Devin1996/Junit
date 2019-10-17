/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunitreview;

/**
 *
 * @author Devin Chandula
 */

/*The Person class has a constructor and a getDisplayName() method.
We want to test that getDisplayName() returns the name formatted as we expect. 
*/

public class Person {
    
    private final String name;
    
    public Person(String name){
        this.name=name;
    }
    
    public String getDisplayName(){
        return name;
    }
}
