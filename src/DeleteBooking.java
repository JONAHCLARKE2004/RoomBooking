
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class DeleteBooking extends javax.swing.JFrame {
 private final ArrayList<Booking> bookings;
    
    public DeleteBooking() {
        initComponents();
        bookings = new ArrayList<>();
        bookings.add(new Booking("1", "Room 101", new Date(), "09:00 - 11:00", "Example 1", "one@example.com"));
        bookings.add(new Booking("2", "Room 102", new Date(), "13:00 - 15:00", "Example 2", "two@example.com"));
    
    }

    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        DeleteBookingLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RemovalReasonstf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RemoveBookingbtn = new javax.swing.JButton();
        BookingMenubtn = new javax.swing.JButton();
        bookingIDtxt = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        DeleteBookingLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DeleteBookingLbl.setText("DELETE BOOKING");

        jLabel1.setText("Booking ID");

        jLabel2.setText("Reasons For Removal");

        RemoveBookingbtn.setText("Remove Booking");
        RemoveBookingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBookingbtnActionPerformed(evt);
            }
        });

        BookingMenubtn.setText("Back to Booking Menu");
        BookingMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingMenubtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BookingMenubtn)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(DeleteBookingLbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(RemovalReasonstf, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(RemoveBookingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookingIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteBookingLbl)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemovalReasonstf, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveBookingbtn))
                .addGap(111, 111, 111)
                .addComponent(BookingMenubtn)
                .addGap(27, 27, 27))
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

    private void RemoveBookingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBookingbtnActionPerformed
       if (bookingIDtxt.getText().isEmpty() || RemovalReasonstf.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all sections before removing the booking.", "Incomplete Information", JOptionPane.WARNING_MESSAGE);
    } else {
        int confirmDialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove the booking?", "Confirm Removal", JOptionPane.YES_NO_OPTION);

        if (confirmDialogResult == JOptionPane.YES_OPTION) {
            // Get the selected booking ID
            String selectedBookingID = bookingIDtxt.getText();
            // Iterate over bookings and remove the one with the matching ID
            Iterator<AppLib.Booking> iterator = AppLib.bookings.iterator();
            while (iterator.hasNext()) {
                AppLib.Booking booking = iterator.next();
                if (booking.getBookingID().equals(selectedBookingID)) {
                    iterator.remove();
                    JOptionPane.showMessageDialog(this, "Booking removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    return; // Exit the method after successful removal
                }
            }
            // If the loop completes without finding the booking ID
            JOptionPane.showMessageDialog(this, "Booking ID not found.", "Invalid Booking ID", JOptionPane.ERROR_MESSAGE);
        
    
    }//GEN-LAST:event_RemoveBookingbtnActionPerformed
    }
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookingMenubtn;
    private javax.swing.JLabel DeleteBookingLbl;
    private javax.swing.JTextField RemovalReasonstf;
    private javax.swing.JButton RemoveBookingbtn;
    private javax.swing.JTextField bookingIDtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
