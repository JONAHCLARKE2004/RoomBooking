
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {
    private String bookingID;
    private String roomID;
    private Date date;
    private String time;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    
    // Constructor
    public Booking(String bookingID, String roomID, Date date, String time, String contactPerson, String contactEmail) {
        this.bookingID = bookingID;
        this.roomID = roomID;
        this.date = date;
        this.time = time;
        this.contactPerson = contactPerson;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
    }
    
    // Getters and setters
    public String getBookingID() {
        return bookingID;
    }
    
    public String getRoomID() {
        return roomID;
    }
    
    public Date getDate() {
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
    
    public String getContactPhone() {
        return contactPhone;
    }
    
    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }
    
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }
    
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    
    
//    public String getBookingDetailsString() {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
//        String formattedDate = dateFormat.format(date);
//
//        String bookingDetails = "Booking ID: " + bookingID + "\n"
//                + "Room ID: " + roomID + "\n"
//                + "Date: " + formattedDate + "\n"
//                + "Time: " + time + "\n"
//                + "Contact Person: " + contactPerson + "\n"
//                + "Contact Email: " + contactEmail + "\n"
//                + "Contact Phone: " + contactPhone;
//
//        return bookingDetails;
//    }
    
}
