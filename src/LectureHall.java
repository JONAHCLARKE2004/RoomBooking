public class LectureHall extends Room1 {
    private String microphoneType;
    private boolean tieredSeating;

    // Constructor
    public LectureHall(String roomID, boolean tieredSeating) {
        super(roomID, 101, 1, 50);
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
