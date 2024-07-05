
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class AddRoom extends javax.swing.JFrame {

  
     private final List<Room1> roomList = new ArrayList<>();
    private double price;
     
    public AddRoom() {
        initComponents();
//        roomList.add(new Room1("101", 101, 1, 50));
//        roomList.add(new Room1("102", 101, 1, 50));
//        roomList.add(new Room1("103", 101, 1, 50));
    }

    
    private String getRoomDetailsString(Room1 room) {
        String roomDetails = "Room ID: " + room.getRoomID() + "\n"
                + "Room Number: " + room.getRoomNumber() + "\n"
                + "Floor: " + room.getFloor() + "\n"
                + "Capacity: " + room.getCapacity();
        return roomDetails;
    }
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RoomMenubtn = new javax.swing.JButton();
        RoomIDtf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RoomTypecb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        RoomCapacitytf = new javax.swing.JTextField();
        AddRoombtn = new javax.swing.JButton();
        RoomFloorcb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        AdditionalInfobtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ADD ROOM");

        RoomMenubtn.setText("Back To Room Menu");
        RoomMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomMenubtnActionPerformed(evt);
            }
        });

        RoomIDtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomIDtfActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Room ID");

        jLabel3.setText("Room Type");

        RoomTypecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lecture Hall", "Lab" }));
        RoomTypecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTypecbActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Room Capacity");

        AddRoombtn.setText("Add Room");
        AddRoombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoombtnActionPerformed(evt);
            }
        });

        RoomFloorcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel6.setText("Room Floor");

        AdditionalInfobtn.setText("Aditional Info");
        AdditionalInfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionalInfobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AdditionalInfobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RoomTypecb, javax.swing.GroupLayout.Alignment.LEADING, 0, 149, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomIDtf, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RoomCapacitytf)
                        .addComponent(RoomFloorcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 21, Short.MAX_VALUE)))
                    .addComponent(AddRoombtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(401, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RoomMenubtn)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomIDtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomCapacitytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RoomTypecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomFloorcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddRoombtn)
                    .addComponent(AdditionalInfobtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(RoomMenubtn)
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

    private void RoomMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomMenubtnActionPerformed
  
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new Room().setVisible(true);
        });
    }//GEN-LAST:event_RoomMenubtnActionPerformed

    private void RoomIDtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomIDtfActionPerformed
   
    }//GEN-LAST:event_RoomIDtfActionPerformed

    private void RoomTypecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTypecbActionPerformed
    
    }//GEN-LAST:event_RoomTypecbActionPerformed

    private void AddRoombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoombtnActionPerformed
    String roomId = RoomIDtf.getText();
    int floor = Integer.parseInt(RoomFloorcb.getSelectedItem().toString());
    
    // Retrieve capacity as a string
    String capacityStr = RoomCapacitytf.getText();
    
    // Check if capacity field is empty
    if (roomId.isEmpty() || capacityStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields");
        return;
    }
    
    // Parse capacity to integer
    int capacity;
    try {
        capacity = Integer.parseInt(capacityStr);
        if (capacity <= 0) {
            JOptionPane.showMessageDialog(this, "Capacity must be a positive integer");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Capacity must be a valid integer");
        return;
    }
    
    // Check for special characters in room ID
    if (!roomId.matches("[0-9]+")) {
        JOptionPane.showMessageDialog(this, "Room ID must contain numbers only");
        return;
    }

    if (AppLib.roomExists(roomId)) {
        JOptionPane.showMessageDialog(this, "Room number already in use");
        return;
    }

    AppLib.addRoom(roomId, floor, capacity);

    RoomIDtf.setText("");
    RoomCapacitytf.setText("");

    JOptionPane.showMessageDialog(this, "Room added successfully");
    }//GEN-LAST:event_AddRoombtnActionPerformed

    private void AdditionalInfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionalInfobtnActionPerformed
     String selectedType = (String) RoomTypecb.getSelectedItem();

    if ("Lab".equals(selectedType)) {
        String numOfPCs = JOptionPane.showInputDialog(this, "Enter Number of PCs:");
        String operatingSystem = JOptionPane.showInputDialog(this, "Enter Operating System:");

        if (numOfPCs == null || operatingSystem == null || numOfPCs.isEmpty() || operatingSystem.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No info added for Lab Room");
            return;
        }

        LabRoom labRoom = new LabRoom("10", Integer.parseInt(numOfPCs), 1, 1, "Windows");
        roomList.add(labRoom);

        JOptionPane.showMessageDialog(this, "Lab Room Details added successfully");
    } else {
        String microphoneType = JOptionPane.showInputDialog(this, "Enter Microphone Type:");
        int option = JOptionPane.showConfirmDialog(this, "Is there Tiered Seating?", "Tiered Seating", JOptionPane.YES_NO_OPTION);
        boolean tieredSeating = (option == JOptionPane.YES_OPTION);

        if (microphoneType == null || microphoneType.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No info added for Lecture Hall");
            return;
        }

        LectureHall lectureHall = new LectureHall(microphoneType, tieredSeating);
        roomList.add(lectureHall);

        JOptionPane.showMessageDialog(this, "Lecture Hall Details added successfully");
    }
    }//GEN-LAST:event_AdditionalInfobtnActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoombtn;
    private javax.swing.JButton AdditionalInfobtn;
    private javax.swing.JTextField RoomCapacitytf;
    private javax.swing.JComboBox<String> RoomFloorcb;
    private javax.swing.JTextField RoomIDtf;
    private javax.swing.JButton RoomMenubtn;
    private javax.swing.JComboBox<String> RoomTypecb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
