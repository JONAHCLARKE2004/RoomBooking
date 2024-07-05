
public class LabRoom extends Room1 {
    private int numOfPCs;
    private String operatingSystem;
    
    // Constructor
    public LabRoom(String roomID, int roomNumber, int floor, int capacity, String operatingSystem) {
        super(roomID, roomNumber, floor, capacity);
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
