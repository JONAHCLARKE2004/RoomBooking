
public class Room extends javax.swing.JFrame {

    public Room() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Roomlbl = new javax.swing.JLabel();
        BackToMenubtn = new javax.swing.JButton();
        AddRoombtn = new javax.swing.JButton();
        ViewRoombtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        Roomlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Roomlbl.setText("ROOM");

        BackToMenubtn.setText("Back To Main Menu");
        BackToMenubtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenubtnActionPerformed(evt);
            }
        });

        AddRoombtn.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        AddRoombtn.setText("ADD ROOM");
        AddRoombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRoombtnActionPerformed(evt);
            }
        });

        ViewRoombtn.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        ViewRoombtn.setText("VIEW ROOM");
        ViewRoombtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRoombtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(752, Short.MAX_VALUE)
                .addComponent(BackToMenubtn)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Roomlbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(AddRoombtn, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewRoombtn)
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Roomlbl)
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ViewRoombtn, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(AddRoombtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(BackToMenubtn)
                .addGap(18, 18, 18))
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

    private void BackToMenubtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenubtnActionPerformed

        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new RoomBookingForm().setVisible(true);
        });
    }//GEN-LAST:event_BackToMenubtnActionPerformed

    private void AddRoombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRoombtnActionPerformed

        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new AddRoom().setVisible(true);
        });
    }//GEN-LAST:event_AddRoombtnActionPerformed

    private void ViewRoombtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewRoombtnActionPerformed

        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new ViewRoom().setVisible(true);
        });
        
    }//GEN-LAST:event_ViewRoombtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRoombtn;
    private javax.swing.JButton BackToMenubtn;
    private javax.swing.JLabel Roomlbl;
    private javax.swing.JButton ViewRoombtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
