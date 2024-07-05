
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;

public class AddBooking extends javax.swing.JFrame {
    private final ArrayList<String> bookedDates;

    public AddBooking() {
        initComponents();
        bookedDates = new ArrayList<>();
    bookedDates.add("16-04-24 09:00 - 11:00");
    bookedDates.add("30-04-24 13:00 - 15:00");
    bookedDates.add("04-05-24 11:00 - 13:00");
    bookedDates.add("17-05-24 15:00 - 17:00");
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BookingMenubtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RoomIDEntertxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Phonetxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ContactPersonTxt = new javax.swing.JTextPane();
        BookingIDtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DateEnter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkbtn = new javax.swing.JToggleButton();
        timeCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ConfirmBookingbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ADD BOOKING");

        BookingMenubtn.setText("Back to Booking Menu");
        BookingMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingMenubtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Room Info");

        jLabel6.setText("Room ID");

        jLabel7.setText("Contact Person");

        Emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailtxtActionPerformed(evt);
            }
        });

        jLabel8.setText("Contact Email");

        Phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonetxtActionPerformed(evt);
            }
        });

        jLabel9.setText("Contact Phone");

        jScrollPane1.setViewportView(ContactPersonTxt);

        jLabel4.setText("Booking ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RoomIDEntertxt)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Emailtxt)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Phonetxt)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addComponent(BookingIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomIDEntertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Phonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BookingIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        DateEnter.setText("01-01-24");
        DateEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateEnterActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Date");

        checkbtn.setText("Check");
        checkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtnActionPerformed(evt);
            }
        });

        timeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 11:00", "11:00 - 13:00", "13:00 - 15:00", "15:00 - 17:00","09:00 - 13:00 (Morning)","13:00 - 17:00 (Afternoon)", "09:00 - 17:00 (All Day)" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(timeCb, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)
                            .addComponent(DateEnter, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(checkbtn)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DateEnter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Dates/Times Available");

        ConfirmBookingbtn.setText("Confirm Booking");
        ConfirmBookingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBookingbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConfirmBookingbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(BookingMenubtn)))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmBookingbtn)
                    .addComponent(BookingMenubtn))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookingMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingMenubtnActionPerformed
       
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new Bookings().setVisible(true);
        });
    }//GEN-LAST:event_BookingMenubtnActionPerformed

String getBookingDetailsString(String bookingID, String roomID, String date, String time, String contactPerson, String contactEmail, String phoneNumber) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        String formattedDate = dateFormat.format(new Date(date));

        String bookingDetails = "Booking ID: " + bookingID + "\n"
                + "Room ID: " + roomID + "\n"
                + "Date: " + formattedDate + "\n"
                + "Time: " + time + "\n"
                + "Contact Person: " + contactPerson + "\n"
                + "Contact Email: " + contactEmail + "\n"
                + "Contact Phone: " + phoneNumber;

        return bookingDetails;
    }
    

    private void ConfirmBookingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBookingbtnActionPerformed
         String bookingID = BookingIDtxt.getText();
        String roomID = RoomIDEntertxt.getText();
        String date = DateEnter.getText();
        String time = timeCb.getSelectedItem().toString();
        String contactPerson = ContactPersonTxt.getText();
        String contactEmail = Emailtxt.getText();
        String phoneNumber = Phonetxt.getText();

        // Check if any field is empty
        if (bookingID.isEmpty() || roomID.isEmpty() || date.isEmpty() || time.isEmpty() || contactPerson.isEmpty() || contactEmail.isEmpty() || phoneNumber.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all the sections before confirming a booking.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Check if the room ID exists
        if (!AppLib.roomExists(roomID)) {
            JOptionPane.showMessageDialog(this, "Room does not exist.", "Invalid Room", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the booking ID already exists
        if (AppLib.bookingExists(bookingID)) {
            JOptionPane.showMessageDialog(this, "Booking ID already exists.", "Duplicate Booking ID", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Add booking to AppLib
        AppLib.addBooking(bookingID, roomID, date, time, contactPerson, contactEmail, phoneNumber);

        // Display success message
        JOptionPane.showMessageDialog(this, "Booking confirmed for Room ID: " + roomID, "Success", JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_ConfirmBookingbtnActionPerformed
    

    
    private void checkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtnActionPerformed
        String enteredDate = DateEnter.getText().trim();

        // Validate date format
        if (!enteredDate.matches("\\d{2}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Invalid date format. Please enter date in the format 'dd-mm-yy'.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String selectedTimeSlot = timeCb.getSelectedItem().toString();
        String bookingDateTime = enteredDate + " " + selectedTimeSlot;

        if (bookedDates.contains(bookingDateTime)) {
            JOptionPane.showMessageDialog(this, "This date and time slot are already booked. Please choose another date or time slot.", "Slot Not Available", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "This date and time slot are available.", "Slot Available", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_checkbtnActionPerformed

    private void DateEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateEnterActionPerformed

    private void EmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailtxtActionPerformed
        // TODO add your handling code here:
        String email = Emailtxt.getText();
    if (!email.contains("@")) {
        JOptionPane.showMessageDialog(this, "Invalid email format. Please include '@' in the email address.", "Invalid Email", JOptionPane.ERROR_MESSAGE);
        Emailtxt.setText(""); // Clear the text field
    }
    }//GEN-LAST:event_EmailtxtActionPerformed

    private void PhonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonetxtActionPerformed
        // TODO add your handling code here:
        String phoneNumber = Phonetxt.getText();
    if (!phoneNumber.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Invalid phone number format. Please enter digits only.", "Invalid Phone Number", JOptionPane.ERROR_MESSAGE);
        Phonetxt.setText(""); // Clear the text field
    }
    }//GEN-LAST:event_PhonetxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookingIDtxt;
    private javax.swing.JButton BookingMenubtn;
    private javax.swing.JButton ConfirmBookingbtn;
    private javax.swing.JTextPane ContactPersonTxt;
    private javax.swing.JTextField DateEnter;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JTextField Phonetxt;
    private javax.swing.JTextField RoomIDEntertxt;
    private javax.swing.JToggleButton checkbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> timeCb;
    // End of variables declaration//GEN-END:variables
}
