public class Room1 {
    private String roomID;
    private int roomNumber;
    private int floor;
    private int capacity;

    // Constructor
    public Room1(String roomID, int roomNumber, int floor, int capacity) {
        this.roomID = roomID;
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.capacity = capacity;
    }

    // Getters and setters
    public String getRoomID() {
        return roomID;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

//    public String getRoomDetailsString() {
//        String roomDetails = "Room ID: " + roomID + "\n"
//                + "Room Number: " + roomNumber + "\n"
//                + "Floor: " + floor + "\n"
//                + "Capacity: " + capacity;
//        return roomDetails;
//    }
}
