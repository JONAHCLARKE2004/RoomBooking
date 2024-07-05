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

public class Room1Test {

    public Room1Test() {
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
    public void testGetRoomID() {
        System.out.println("getRoomID");
        Room1 instance = new Room1("123", 101, 1, 50);
        String expResult = "123";
        String result = instance.getRoomID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        Room1 instance = new Room1("123", 101, 1, 50);
        int expResult = 101;
        int result = instance.getRoomNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetFloor() {
        System.out.println("getFloor");
        Room1 instance = new Room1("123", 101, 1, 50);
        int expResult = 1;
        int result = instance.getFloor();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Room1 instance = new Room1("123", 101, 1, 50);
        int expResult = 50;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        Room1 instance = new Room1("123", 101, 1, 50);
        String roomID = "456";
        instance.setRoomID(roomID);
        assertEquals(roomID, instance.getRoomID());
    }

    @Test
    public void testSetRoomNumber() {
        System.out.println("setRoomNumber");
        Room1 instance = new Room1("123", 101, 1, 50);
        int roomNumber = 102;
        instance.setRoomNumber(roomNumber);
        assertEquals(roomNumber, instance.getRoomNumber());
    }

    @Test
    public void testSetFloor() {
        System.out.println("setFloor");
        Room1 instance = new Room1("123", 101, 1, 50);
        int floor = 2;
        instance.setFloor(floor);
        assertEquals(floor, instance.getFloor());
    }

    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        Room1 instance = new Room1("123", 101, 1, 50);
        int capacity = 60;
        instance.setCapacity(capacity);
        assertEquals(capacity, instance.getCapacity());
    }
}

  
//public void testGetRoomDetailsString() {
//    System.out.println("getRoomDetailsString");
//    Room1 instance = new Room1("123", 101, 1, 50);
//    String expResult = "Room ID: 123\nRoom Number: 101\nFloor: 1\nCapacity: 50";
//    String result = instance.getRoomDetailsString();
//    assertEquals(expResult, result);
//}


