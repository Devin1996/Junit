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
public class BasicTest {
    
    public BasicTest() {
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
     * Test of addNumber method, of class Basic.
     */
    @Test
    public void testAddNumber() {
        int a=6;
        int b=8;
        Basic test = new Basic();
        int result = test.addNumber(a, b);
        int expecteresult = 14;
        assertEquals(expecteresult, result);
    }

    /**
     * Test of addString method, of class Basic.
     */
    @Test
    public void testAddString() {
        System.out.println("addString");
        String c = "new";
        String d = "era";
        Basic instance = new Basic();
        String expResult = "newera";
        String result = instance.addString(c, d);
        assertEquals(expResult, result);
    }
    
}
