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
 * @author Devin Chandula
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
    public void testSum() {
        System.out.println("sum");
        int num1 = 10;
        int num2 = 20;
        Calculator instance = new Calculator();
        int expResult = 30;
        int result = instance.sum(num1, num2);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of dsum method, of class Calculator.
     */
    @Test
    public void testDsum() {
        System.out.println("dsum");
        double no1 = 2.0;
        double no2 = 4.0;
        Calculator instance = new Calculator();
        double expResult = 6.0;
        double result = instance.dsum(no1, no2);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
