import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class AppLib {
    
    public static class Room {
        private String roomId;
        private int floor;
        private int capacity;
        private double price;

        // Constructor
        public Room(String roomId, int floor, int capacity) {
            this.roomId = roomId;
            this.floor = floor;
            this.capacity = capacity;
            this.price = price;
        }

        // Getters and Setters
        public String getRoomId() {
            return roomId;
        }

        public int getFloor() {
            return floor;
        }

        public int getCapacity() {
            return capacity;
        }

        public double getPrice() {
            return price;
        }

    }

    // List to store rooms
    public static List<Room> roomList = new ArrayList<>();

    // Method to add a room
    public static String addRoom(String roomId, int floor, int capacity) {
        Room newRoom = new Room(roomId, floor, capacity);
        roomList.add(newRoom);
        return roomId;
    }

    // Method to check if a room exists
    public static boolean roomExists(String roomId) {
        for (Room room : roomList) {
            if (room.getRoomId().equals(roomId)) {
                return true;
            }
        }
        return false;
    }

    // Method to get room details
    public static Room getRoomDetails(String roomId) {
        for (Room room : roomList) {
            if (room.getRoomId().equals(roomId)) {
                return room;
            }
        }
        return null;
    }


public static class LabRoom extends Room {
    private int numOfPCs;
    private String operatingSystem;

    // Constructor
    public LabRoom(String roomId, int floor, int capacity, int numOfPCs, String operatingSystem) {
        super(roomId, floor, capacity);
        this.numOfPCs = numOfPCs;
        this.operatingSystem = operatingSystem;
    }

    // Getters and setters
    public int getNumOfPCs() {
        return numOfPCs;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setNumOfPCs(int numOfPCs) {
        this.numOfPCs = numOfPCs;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}


public static class LectureHall extends Room {
    private String microphoneType;
    private boolean tieredSeating;

    // Constructor
    public LectureHall(String roomId, int floor, int capacity, String microphoneType, boolean tieredSeating) {
        super(roomId, floor, capacity);
        this.microphoneType = microphoneType;
        this.tieredSeating = tieredSeating;
    }

    // Getters and setters
    public String getMicrophoneType() {
        return microphoneType;
    }

    public boolean hasTieredSeating() {
        return tieredSeating;
    }

    public void setMicrophoneType(String microphoneType) {
        this.microphoneType = microphoneType;
    }

    public void setTieredSeating(boolean tieredSeating) {
        this.tieredSeating = tieredSeating;
    }
}

    
    
public static class Booking {
        private String bookingID;
        private String roomID;
        private String date;
        private String time;
        private String contactPerson;
        private String contactEmail;
        private String phoneNumber;

        public Booking(String bookingID, String roomID, String date, String time, String contactPerson, String contactEmail, String phoneNumber) {
            this.bookingID = bookingID;
            this.roomID = roomID;
            this.date = date;
            this.time = time;
            this.contactPerson = contactPerson;
            this.contactEmail = contactEmail;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters
        public String getBookingID() {
            return bookingID;
        }

        public String getRoomID() {
            return roomID;
        }

        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
        public String getContactPerson() {
            return contactPerson;
        }

        public String getContactEmail() {
            return contactEmail;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        String getBookingDetailsString() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    static final List<Booking> bookings = new ArrayList<>();

    public static void addBooking(String bookingID, String roomID, String date, String time, String contactPerson, String contactEmail, String phoneNumber) {
        Booking newBooking = new Booking(bookingID, roomID, date, time, contactPerson, contactEmail, phoneNumber);
        bookings.add(newBooking);
    }

    public static boolean bookingExists(String bookingID) {
        for (Booking booking : bookings) {
            if (booking.getBookingID().equals(bookingID)) {
                return true;
            }
        }
        return false;
    }
    public static Booking getBookingDetails(String bookingID) {
        for (Booking booking : bookings) {
            if (booking.getBookingID().equals(bookingID)) {
                return booking;
            }
        }
        return null; // If booking not found
    }
}
