/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanji
 */
public class UploadServletTest {
    
    public UploadServletTest() {
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
     * Test of doGet method, of class UploadServlet.
     */
    @Test
    public void testDoGet() {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UploadServlet instance = new UploadServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class UploadServlet.
     */
    @Test
    public void testDoPost() {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        UploadServlet instance = new UploadServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
