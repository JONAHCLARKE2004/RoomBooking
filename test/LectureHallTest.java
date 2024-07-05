/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamie
 */
public class LectureHallTest {
    
    public LectureHallTest() {
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
     * Test of getMicrophoneType method, of class LectureHall.
     */
    @Test
    public void testGetMicrophoneType() {
        System.out.println("getMicrophoneType");
        LectureHall instance = new LectureHall("101", false); // Initialize instance
        String expResult = null; // Change this to your expected value
        String result = instance.getMicrophoneType();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasTieredSeating method, of class LectureHall.
     */
    @Test
    public void testHasTieredSeating() {
        System.out.println("hasTieredSeating");
        LectureHall instance = new LectureHall("101", false); // Initialize instance
        boolean expResult = false; // Change this to your expected value
        boolean result = instance.hasTieredSeating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMicrophoneType method, of class LectureHall.
     */
    @Test
    public void testSetMicrophoneType() {
        System.out.println("setMicrophoneType");
        String microphoneType = "Type A"; // Change this to your test value
        LectureHall instance = new LectureHall("101", false); // Initialize instance
        instance.setMicrophoneType(microphoneType);
        assertEquals(microphoneType, instance.getMicrophoneType()); // Check if the value is set correctly
    }

    /**
     * Test of setTieredSeating method, of class LectureHall.
     */
    @Test
    public void testSetTieredSeating() {
        System.out.println("setTieredSeating");
        boolean tieredSeating = true; // Change this to your test value
        LectureHall instance = new LectureHall("101", false); // Initialize instance
        instance.setTieredSeating(tieredSeating);
        assertEquals(tieredSeating, instance.hasTieredSeating()); // Check if the value is set correctly
    }
    
}
