
import javax.swing.JOptionPane;

public class Room_Booking extends javax.swing.JFrame {

    public Room_Booking() {
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        BackgroundImage = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        BookingLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(51, 255, 255));
        BackgroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SplashScreen/Assets/Confused Bookings Logo.jpg"))); // NOI18N
        BackgroundImage.setText("jLabel1");
        BackgroundPanel.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 340, 240));
        BackgroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 490, 30));

        BookingLabel.setBackground(new java.awt.Color(255, 255, 255));
        BookingLabel.setText("Now Loading Confused Bookings...");
        BackgroundPanel.add(BookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        LoadingValue.setText("0 %");
        BackgroundPanel.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Welcome To Confused Bookings!");
        BackgroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel2.setText("Here you will be able to");
        BackgroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        jLabel3.setText("Add a room & view a room");
        BackgroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, 20));

        jLabel4.setText("View a booking, add a booking & delete a booking!");
        BackgroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel5.setText("Exciting Stuff!!!!");
        BackgroundPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Room_Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        
        
    Room_Booking sp = new Room_Booking();
sp.setVisible(true);

try {
    for (int i = 0; i <= 100; i++) { 
        Thread.sleep(100);
        sp.LoadingValue.setText(i + "%");

        if (i == 60) {
            sp.BookingLabel.setText("Loading Nearly Finished...");
        }

        if (i == 100) {
            sp.BookingLabel.setText("Finished Loading Confused Bookings!!");
            sp.LoadingBar.setValue(i);
            
            java.awt.EventQueue.invokeLater(()-> {
            new RoomBookingForm().setVisible(true);
        });
            sp.dispose();
} else{
            sp.LoadingBar.setValue(i);
        }
        
        
        
    }
    
    
} catch (InterruptedException e) {
    JOptionPane.showMessageDialog(null, e);
}

            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel BookingLabel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
