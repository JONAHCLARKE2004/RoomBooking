
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class ViewBooking extends javax.swing.JFrame {

    public ViewBooking() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BookingMenubtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BookingIdtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BookingIdbtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("VIEW BOOKING");

        BookingMenubtn.setText("Back to Booking Menu");
        BookingMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingMenubtnActionPerformed(evt);
            }
        });

        jLabel2.setText("All Current Bookings");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, "16-04-24", "James Blue"},
                {2, "30-04-24", "John Weather"},
                {3, "04-05-24", "Oliver Carter"},
                {4, "17-05-24", "Katie Falls"}
            },
            new String [] {
                "Room", "Date", "Client Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Enter Booking ID");

        BookingIdbtn.setText("Ok");
        BookingIdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingIdbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BookingMenubtn)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(706, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BookingIdtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookingIdbtn)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookingIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookingIdbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(BookingMenubtn)
                .addGap(21, 21, 21))
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

    private void BookingIdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingIdbtnActionPerformed
        String bookingID = BookingIdtxt.getText();

        if (AppLib.bookingExists(bookingID)) {
            AppLib.Booking booking = AppLib.getBookingDetails(bookingID);
            JOptionPane.showMessageDialog(this, "Booking Details:\n" +
                    "Booking ID: " + booking.getBookingID() + "\n" +
                    "Room ID: " + booking.getRoomID() + "\n" +
                    "Date: " + booking.getDate() + "\n" +
                    "Time: " + booking.getTime() + "\n" +
                    "Contact Person: " + booking.getContactPerson() + "\n" +
                    "Email: " + booking.getContactEmail() + "\n" +
                    "Phone Number: " + booking.getPhoneNumber()
            );
        } else {
            JOptionPane.showMessageDialog(this, "Booking ID does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BookingIdbtnActionPerformed

    private AppLib.Booking getBookingDetails(String bookingID) {
     
       return AppLib.getBookingDetails(bookingID);
    }

    
  private boolean checkBookingExists(String bookingId) {
        
        try {
            int id = Integer.parseInt(bookingId);
            return id > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void displayBookingDetails(String bookingId) {

        AppLib.Booking booking = getBookingDetails(bookingId);

        if (booking != null) {
            String bookingDetails = booking.getBookingDetailsString();
            JOptionPane.showMessageDialog(this, bookingDetails, "Booking Details", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Booking ID does not exist", "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    
private List<Booking> bookings;

// Method to retrieve a booking by its ID
private Booking getBookingById(String bookingId) {
    for (Booking booking : bookings) {
        if (booking.getBookingID().equals(bookingId)) {
            return booking;
        }
    }
    return null; // If no booking with the given ID is found
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BookingIdbtn;
    private javax.swing.JTextField BookingIdtxt;
    private javax.swing.JButton BookingMenubtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

   
}
