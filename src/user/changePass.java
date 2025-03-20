package user;

import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import travelapp.loginForm;


public class changePass extends javax.swing.JFrame {

   
    public changePass() {
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
        iddisplay1 = new javax.swing.JLabel();
        iddisplay = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        oldpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        conpass = new javax.swing.JPasswordField();
        logout = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

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

        iddisplay1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        iddisplay1.setForeground(new java.awt.Color(255, 255, 255));
        iddisplay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iddisplay1.setText("current user");
        jPanel3.add(iddisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 20));

        iddisplay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        iddisplay.setForeground(new java.awt.Color(255, 255, 255));
        iddisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iddisplay.setText("id");
        jPanel3.add(iddisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 330));

        firstName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstName.setText("Type Old Pass:");
        jPanel2.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, -1));

        lastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastName.setText("Enter New Pass:");
        jPanel2.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, 20));

        mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mail.setText("Confirm Pass:");
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, 20));

        save.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 110, 40));
        jPanel2.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 220, 40));
        jPanel2.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 220, 40));
        jPanel2.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 220, 40));

        logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("LOG OUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 330));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ACCOUNT INFORMATION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 340, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BACK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 80, 40));

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
   if(sess.getUid()== 0){
     JOptionPane.showMessageDialog(null,"No Account, Login First");
     loginForm lf = new loginForm();
     lf.setVisible(true);
     this.dispose();
     }else{
        iddisplay.setText(""+sess.getUid());
        acc_fname.setText(""+sess.getFname());
        acc_lname.setText(""+sess.getLname());
        
   }
    }//GEN-LAST:event_formWindowActivated

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        try {
            dbConnector dbc = new dbConnector();
            Session sess = Session.getInstance();

            String query = "SELECT * FROM tbl_user WHERE u_id = '" + sess.getUid() + "'";
            ResultSet rs = dbc.getData(query);

            if (rs.next()) {
                String olddbpass = rs.getString("u_password"); // Get stored hashed password
                String oldhash = passwordHasher.hashPassword(oldpass.getText().trim()); // Hash input old password

                if (olddbpass.equals(oldhash)) { // If old password is correct

                    String newPass = newpass.getText().trim();
                    String confirmPass = conpass.getText().trim();

                    // Validate if new password and confirm password match
                    if (!newPass.equals(confirmPass)) {
                        JOptionPane.showMessageDialog(null, "New Password and Confirm Password do not match!");
                        newpass.setText("");
                        conpass.setText("");
                        return;
                    }

                    // Validate if new password is different from old password
                    if (newPass.equals(oldpass.getText().trim())) {
                        JOptionPane.showMessageDialog(null, "New password must be different from the old password!");
                        newpass.setText("");
                        conpass.setText("");
                        return;
                    }

                    // Validate password strength (at least 8 characters, 1 uppercase letter)
                    if (!isValidPassword(newPass)) {
                        JOptionPane.showMessageDialog(null, "Invalid password! Must be at least 8 characters and include an uppercase letter.");
                        newpass.setText("");
                        conpass.setText("");
                        return;
                    }

                    // Hash the new password before storing
                    String npass = passwordHasher.hashPassword(newPass);

                    // Update the password in the database
                    dbc.updateData("UPDATE tbl_user SET u_password = '" + npass + "' WHERE u_id = '" + sess.getUid() + "'");

                    JOptionPane.showMessageDialog(null, "Successfully Updated!");
                    loginForm lg = new loginForm();
                    lg.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Old Password is incorrect!");
                }
            }
        } catch (SQLException | NoSuchAlgorithmException ex) {
            System.out.println("Error: " + ex);
        }

    }//GEN-LAST:event_saveMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked
   private boolean isValidPassword(String password) {
        String pattern = "^(?=.*[A-Z]).{8,}$";
        return password.matches(pattern);}
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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fname;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JPasswordField conpass;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JLabel iddisplay1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lastName;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel mail;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
