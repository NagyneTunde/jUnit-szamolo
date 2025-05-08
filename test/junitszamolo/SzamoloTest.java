/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitszamolo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nagyg
 */
public class SzamoloTest {
    
    private Szamolo szamolo;
    
    public SzamoloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        szamolo = new Szamolo();
    }
    
    @After
    public void tearDown() {
        szamolo = null;
    }

    /**
     * Test of plussz method, of class Szamolo.
     */
    @Test
    public void testPlussz() {
        assertEquals(10, szamolo.plussz(3, 7));
        assertEquals(3, szamolo.plussz(-2, 5));
        assertEquals(-7, szamolo.plussz(-4, -3));
        assertEquals(0, szamolo.plussz(0, 0));
    }

    /**
     * Test of minusz method, of class Szamolo.
     */
    @Test
    public void testMinusz() {
        System.out.println("minusz");
        int egyik = 0;
        int masik = 0;
        Szamolo instance = new Szamolo();
        int expResult = 0;
        int result = instance.minusz(egyik, masik);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oszt method, of class Szamolo.
     */
    @Test
    public void testOszt() throws Exception {
 
        assertEquals(5, szamolo.oszt(15, 3));
        assertEquals(-5, szamolo.oszt(10, -2));
        assertEquals(1, szamolo.oszt(5, 3));
        try {
            assertEquals(0, szamolo.oszt(15, 0));
            fail("0-val osztásra exceptiont kéne dobjon");
        } catch (Exception e) {
            assertEquals("0-val nem oszthatunk", e.getMessage());
        }
    }

    /**
     * Test of szamol method, of class Szamolo.
     */
    @Test
    public void testSzamol() throws Exception {
        System.out.println("szamol");
        int egyik = 0;
        int masik = 0;
        String muvelet = "";
        Szamolo instance = new Szamolo();
        int expResult = 0;
        int result = instance.szamol(egyik, masik, muvelet);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
