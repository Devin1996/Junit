/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaunitreview;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vira
 */
public class RectangleTest {
    
    public RectangleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }





    @Test
    public void testPerimeter() {
        System.out.println("Perimeter");
        double width = 3.0;
        double height = 6.0;
        Rectangle instance = new Rectangle();
        double expResult = 18.0;
        double result = instance.Perimeter(width, height);
        assertEquals(expResult, result, 0.2);
    }


    @Test
    public void testCircumferance() {
        System.out.println("Circumferance");
        double width = 5.0;
        double height = 6.0;
        Rectangle instance = new Rectangle();
        double expResult = 22.0;
        double result = instance.Circumferance(width, height);
        assertEquals(expResult, result, 0.0);
    }
    
}
