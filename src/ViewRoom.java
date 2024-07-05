
import javax.swing.JOptionPane;



public class ViewRoom extends javax.swing.JFrame {

    public ViewRoom() {
        initComponents();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RoomMenubtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RoomIDEnter = new javax.swing.JTextField();
        RoomIDbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ROOM");

        RoomMenubtn.setText("Back To Room Menu");
        RoomMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomMenubtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Room ID");

        RoomIDbtn.setText("OK");
        RoomIDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomIDbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RoomMenubtn)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RoomIDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RoomIDbtn)))
                .addGap(0, 653, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomIDEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomIDbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 293, Short.MAX_VALUE)
                .addComponent(RoomMenubtn)
                .addGap(14, 14, 14))
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

    private void RoomMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomMenubtnActionPerformed

        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new Room().setVisible(true);
        });
    }//GEN-LAST:event_RoomMenubtnActionPerformed

    private void RoomIDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomIDbtnActionPerformed
       String roomId = RoomIDEnter.getText().trim(); 

    // Check if room ID contains spaces
    if (roomId.contains(" ")) {
        JOptionPane.showMessageDialog(this, "Room ID cannot contain spaces", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if room ID contains spaces
    }

    // Check if room ID exists
    if (AppLib.roomExists(roomId)) {
        AppLib.Room room = AppLib.getRoomDetails(roomId);

        String roomDetails = "Room Details:\n" +
                "Room Number: " + room.getRoomId() + "\n" +
                "Floor: " + room.getFloor() + "\n" +
                "Capacity: " + room.getCapacity();

        JOptionPane.showMessageDialog(this, roomDetails);
    } else {
        JOptionPane.showMessageDialog(this, "Room ID does not exist", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_RoomIDbtnActionPerformed
    
private boolean checkIfRoomExists(String roomId) {
       
       
        try {
            int id = Integer.parseInt(roomId);
            return id > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Method to get room details
    private Room1 getRoomDetails(String roomId) {
        
        return new Room1(roomId, 101, 1, 50); 
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RoomIDEnter;
    private javax.swing.JButton RoomIDbtn;
    private javax.swing.JButton RoomMenubtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

   
}