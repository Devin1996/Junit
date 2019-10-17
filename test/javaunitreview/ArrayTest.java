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
public class ArrayTest {
    
    public ArrayTest() {
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

    /**
     * Test of getSumMul method, of class Array.
     */
    @Test
    public void testGetSumMul() {
        System.out.println("get Summation and Multiplication of a array");
        int[] arr = {1,2,4};
        Array instance = new Array();
        String expResult = "7 8";
        String result = instance.getSumMul(arr);
        assertEquals(expResult, result);
    
    }

    /**
     * Test of getDoubleSumMul method, of class Array.
     */
    @Test
    public void testGetDoubleSumMul() {
        System.out.println("getDoubleSumMul");
        double[] arr = {1.234,2.345};
        Array instance = new Array();
        String expResult = "3.579";
        String result = instance.getDoubleSumMul(arr);
        assertEquals(expResult, result);

    }
    
    
}
