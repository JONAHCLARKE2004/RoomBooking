/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookingTest {
    
    private Booking instance;
    
    public BookingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Date date = new Date();
        instance = new Booking("123", "Room101", date, "10:00", "John Doe", "john.doe@example.com");
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testGetBookingID() {
        System.out.println("getBookingID");
        String expResult = "123";
        String result = instance.getBookingID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRoomID() {
        System.out.println("getRoomID");
        String expResult = "Room101";
        String result = instance.getRoomID();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date expResult = new Date();
        Date result = instance.getDate();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTime() {
        System.out.println("getTime");
        String expResult = "10:00";
        String result = instance.getTime();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactPerson() {
        System.out.println("getContactPerson");
        String expResult = "John Doe";
        String result = instance.getContactPerson();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactEmail() {
        System.out.println("getContactEmail");
        String expResult = "john.doe@example.com";
        String result = instance.getContactEmail();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetContactPhone() {
        System.out.println("getContactPhone");
        String expResult = null; // The original code didn't set contact phone, so it's expected to be null
        String result = instance.getContactPhone();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetBookingID() {
        System.out.println("setBookingID");
        String bookingID = "456";
        instance.setBookingID(bookingID);
        assertEquals(bookingID, instance.getBookingID());
    }

    @Test
    public void testSetRoomID() {
        System.out.println("setRoomID");
        String roomID = "Room202";
        instance.setRoomID(roomID);
        assertEquals(roomID, instance.getRoomID());
    }

    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = new Date();
        instance.setDate(date);
        assertEquals(date, instance.getDate());
    }

    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "15:30";
        instance.setTime(time);
        assertEquals(time, instance.getTime());
    }

    @Test
    public void testSetContactPerson() {
        System.out.println("setContactPerson");
        String contactPerson = "Jane Smith";
        instance.setContactPerson(contactPerson);
        assertEquals(contactPerson, instance.getContactPerson());
    }

    @Test
    public void testSetContactEmail() {
        System.out.println("setContactEmail");
        String contactEmail = "jane.smith@example.com";
        instance.setContactEmail(contactEmail);
        assertEquals(contactEmail, instance.getContactEmail());
    }

    @Test
    public void testSetContactPhone() {
        System.out.println("setContactPhone");
        String contactPhone = "+987654321";
        instance.setContactPhone(contactPhone);
        assertEquals(contactPhone, instance.getContactPhone());
    }

//    @Test
//    public void testGetBookingDetailsString() {
//        System.out.println("getBookingDetailsString");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
//        String formattedDate = dateFormat.format(instance.getDate());
//
//        String expResult = "Booking ID: 123\n"
//                + "Room ID: Room101\n"
//                + "Date: " + formattedDate + "\n"
//                + "Time: 10:00\n"
//                + "Contact Person: John Doe\n"
//                + "Contact Email: john.doe@example.com\n"
//                + "Contact Phone: null";
//
//        String result = instance.getBookingDetailsString();
//        assertEquals(expResult, result);
//    }
}

