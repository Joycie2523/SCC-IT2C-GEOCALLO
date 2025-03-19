package user;

import config.Session;
import javax.swing.JOptionPane;
import travelapp.loginForm;


public class accountDetails extends javax.swing.JFrame {

   
    public accountDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        acc_lname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acc_fname = new javax.swing.JLabel();
        accountType = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lastName = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        mail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        uname = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        ut = new javax.swing.JComboBox<>();
        accountType1 = new javax.swing.JLabel();
        iddisplay = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc_lname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("USER");
        jPanel3.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bl.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 110));

        acc_fname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fname.setText("USER");
        jPanel3.add(acc_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 20));

        accountType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accountType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountType.setText("Change Pass");
        accountType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTypeMouseClicked(evt);
            }
        });
        jPanel3.add(accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 450));

        firstName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstName.setText("First Name:");
        jPanel2.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 150, -1));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 250, 40));

        lastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastName.setText("Last Name:");
        jPanel2.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 140, 20));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel2.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 250, 40));

        mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mail.setText("Email:");
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 130, 20));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 250, 40));

        uname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uname.setText("Username:");
        jPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 140, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 250, 40));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel2.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 250, 40));

        accountType1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accountType1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountType1.setText("Account Type:");
        jPanel2.add(accountType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 410));

        iddisplay.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        iddisplay.setForeground(new java.awt.Color(255, 255, 255));
        iddisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iddisplay.setText("(UID)");
        jPanel1.add(iddisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 130, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ACCOUNT INFORMATION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 340, 30));

        logut.setBackground(new java.awt.Color(153, 153, 255));
        logut.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logut.setText("LOG OUT");
        logut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logutActionPerformed(evt);
            }
        });
        jPanel1.add(logut, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();
 
        iddisplay.setText(""+sess.getUid());
        acc_fname.setText(""+sess.getFname());
        acc_lname.setText(""+sess.getLname());
        email.setText(""+sess.getEmail());
        username.setText(""+sess.getUsername());

    }//GEN-LAST:event_formWindowActivated

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        String firstName = fname.getText().trim();
        if (firstName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "First Name cannot be empty!");
            return;
        }
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        String lastName = lname.getText().trim();

        if (lastName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Last Name cannot be empty!");
            return;
        }
    }//GEN-LAST:event_lnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void logutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logutActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {

            loginForm login = new loginForm(); // Assuming loginForm is your login screen class
            login.setVisible(true); // Make the login form visible

            // Dispose of the current frame
            this.dispose(); // Close the current window
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_logutActionPerformed

    private void accountTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTypeMouseClicked
       changePass cp = new changePass();
       cp.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_accountTypeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fname;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel accountType;
    private javax.swing.JLabel accountType1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lname;
    private javax.swing.JButton logut;
    private javax.swing.JLabel mail;
    private javax.swing.JLabel uname;
    private javax.swing.JTextField username;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
