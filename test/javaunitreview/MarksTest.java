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
public class MarksTest {
    
    public MarksTest() {
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
     * Test of getMarks method, of class Marks.
     */
    @Test
    public void testGetMarks() {
        System.out.println("getMarks");
        int[] marks = {10,20,30};
        Marks instance = new Marks();
        int[] expResult ={20,40,60} ;
        int[] result = instance.getMarks(marks);
        assertArrayEquals(expResult, result);

    }
    
}
