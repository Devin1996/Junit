/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaunitreview.ArrayTest;
import javaunitreview.CalculatorTest;
import javaunitreview.PersonTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Devin Chandula
 */

/*In Junit, test suite allows us to aggregate all test cases from multiple classes in one place and run it together.

To run the suite test, you need to annotate a class using below-mentioned annotations:
1. @Runwith(Suite.class)

2.@SuiteClasses(test1.class,test2.class……) 
		OR
@Suite.SuiteClasses ({test1.class, test2.class……})

*/

@RunWith(Suite.class)
@Suite.SuiteClasses({ArrayTest.class,CalculatorTest.class,PersonTest.class})
public class NewTestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
