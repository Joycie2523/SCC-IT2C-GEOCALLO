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
        firstName = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        lastName = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        mail = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        conpass = new javax.swing.JPasswordField();
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

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 410));

        firstName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstName.setText("Type Old Pass:");
        jPanel2.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 150, -1));

        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        jPanel2.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 260, 40));

        lastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastName.setText("Enter New Pass:");
        jPanel2.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 180, 20));

        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel2.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 260, 40));

        mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mail.setText("Confirm:");
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, 20));

        jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 80, 40));

        back.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 80, 40));
        jPanel2.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 700, 330));

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
        jPanel1.add(logut, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 130, 40));

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
        

    }//GEN-LAST:event_formWindowActivated

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

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        String lastName = newpass.getText().trim();

        if (lastName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Last Name cannot be empty!");
            return;
        }
    }//GEN-LAST:event_newpassActionPerformed

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        String firstName = oldpass.getText().trim();
        if (firstName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "First Name cannot be empty!");
            return;
        }
    }//GEN-LAST:event_oldpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try{
        dbConnector dbc = new dbConnector();
        Session sess = Session.getInstance();
        
        String query = "SELECT*FROM tbl_user WHERE u_id ='"+sess.getUid()+"'";
        ResultSet rs = dbc.getData(query);
        if(rs.next()){
           String olddbpass = rs.getString("u_password");
           String oldhash = passwordHasher.hashPassword(oldpass.getText());
   
        if(olddbpass.equals(oldhash)){
           String npass = passwordHasher.hashPassword(newpass.getText());
           dbc.updateData("UPDATE tbl_user SET u_password = '"+npass+"'");
              JOptionPane.showMessageDialog(null, "Successfully Updated!");
              loginForm lg =  new loginForm();
              lg.setVisible(true);
              this.dispose();
        }else{
              JOptionPane.showMessageDialog(null, "Old Password is incorrect!");
          }
   
           }
           }catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ex);
         }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       userDashboard usd = new userDashboard();
       usd.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
    private javax.swing.JButton back;
    private javax.swing.JPasswordField conpass;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel iddisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lastName;
    private javax.swing.JButton logut;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables
}
