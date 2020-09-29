/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Category;
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
public class CategoryDAOTest {
    
    public CategoryDAOTest() {
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
     * Test of getListCategory method, of class CategoryDAO.
     */
    @Test
    public void testGetListCategory() throws Exception {
        System.out.println("getListCategory");
        CategoryDAO instance = new CategoryDAO();
        ArrayList<Category> expResult = null;
        ArrayList<Category> result = instance.getListCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class CategoryDAO.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        CategoryDAO.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class CategoryDAO.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Category c = null;
        CategoryDAO instance = new CategoryDAO();
        boolean expResult = false;
        boolean result = instance.insert(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CategoryDAO.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Category c = null;
        CategoryDAO instance = new CategoryDAO();
        boolean expResult = false;
        boolean result = instance.update(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CategoryDAO.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        long category_id = 0L;
        CategoryDAO instance = new CategoryDAO();
        boolean expResult = false;
        boolean result = instance.delete(category_id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
