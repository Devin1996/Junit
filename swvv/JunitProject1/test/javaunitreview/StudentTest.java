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
public class StudentTest {
    
    public StudentTest() {
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

    /*
    @Test
    public void testGetFormattedName() {
        System.out.println("getFormattedName");
        Student instance = null;
        String expResult = "";
        String result = instance.getFormattedName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetFname() {
        System.out.println("getFname");
        Student instance = null;
        String expResult = "";
        String result = instance.getFname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testSetFname() {
        System.out.println("setFname");
        String fname = "";
        Student instance = null;
        instance.setFname(fname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    @Test
    public void testGetLname() {
        System.out.println("getLname");
        Student instance = null;
        String expResult = "";
        String result = instance.getLname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testSetLname() {
        System.out.println("setLname");
        String lname = "";
        Student instance = null;
        instance.setLname(lname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testGetIndexNo() {
        System.out.println("getIndexNo");
        Student instance = null;
        String expResult = "";
        String result = instance.getIndexNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetIndexNo() {
        System.out.println("setIndexNo");
        String indexNo = "";
        Student instance = null;
        instance.setIndexNo(indexNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
     */
    
    
    @Test
    public void testGetFormattedText() {
        System.out.println("getFormattedName");
		Student instance = new Student("John","Smith","452875672");
		String expResult = "Smith, John";
		String result = instance.getFormattedName();
		assertEquals(expResult, result);
    }

    
    @Test
    public void testGetDigitCount() {
                System.out.println("getFormattedCount");
		Student instance = new Student("John","Smith","452875672");
		
                int expResult = 9;
		int result = instance.getDigitCount();
		assertEquals(expResult, result);
    }

       @Test
    public void testNames()
    {
        System.out.println("testNames");     
        Student instance = new Student("Devin","Chandula","3034");
        assertNotSame(instance.getFname(),instance.getLname());
        //assertSame(instance.getFname(),instance.getLname());
    }
    
}
