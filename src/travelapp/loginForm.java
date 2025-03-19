    package travelapp;

import admin.adminDashboard;
import admin.usersForm;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import config.Session;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import user.userDashboard;

public class loginForm extends javax.swing.JFrame {
   
    public loginForm() {
      initComponents();
    }
     static String status;
    static String type;
private static boolean loginAcc(String username, String password) throws NoSuchAlgorithmException {

        dbConnector connector = new dbConnector();
        
          
    try {
         String query = "SELECT * FROM tbl_user WHERE u_username = '" + username + "' ";
         ResultSet resultSet = connector.getData(query);
        if(resultSet.next()){
            
            String hashedPassword = resultSet.getString("u_password");
            String rehashedPassword = passwordHasher.hashPassword(password);
            
            if(hashedPassword.equals(rehashedPassword)){
                
                System.out.println(""+hashedPassword);  
                System.out.println(""+rehashedPassword);
                
            status = resultSet.getString("u_status");
            type = resultSet.getString("u_type");
            Session sess = Session.getInstance();
            sess.setUid(resultSet.getInt("u_id"));
            sess.setFname(resultSet.getString("u_fname"));
            sess.setLname(resultSet.getString("u_lname"));
            sess.setEmail(resultSet.getString("email"));
            sess.setPnumber(resultSet.getString("phone_number"));
            sess.setUsername(resultSet.getString("u_username"));
            sess.setType(resultSet.getString("u_type"));
            sess.setStatus(resultSet.getString("u_status"));
           sess.setImage(resultSet.getString("u_image"));
            System.out.println(""+sess.getUid());
           return true;
               
            }else{
            System.out.println("Password Don't Match");
           return false;  
            }

         }else{
        return false;
        }
  } catch (SQLException | NoSuchAlgorithmException ex){
        return false; 
    }


}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        registered = new javax.swing.JPanel();
        loginForm = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        loguser = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        reg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registered.setBackground(new java.awt.Color(204, 204, 255));
        registered.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginForm.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        loginForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginForm.setText("LOGIN FORM");
        registered.add(loginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 270, 31));
        registered.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 270, 40));
        registered.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 270, 40));

        cancel.setText("CANCEL");
        registered.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 100, -1));

        loguser.setText("LOGIN");
        loguser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loguserActionPerformed(evt);
            }
        });
        registered.add(loguser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 90, -1));

        username.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        username.setText("Username:");
        registered.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 120, 36));

        password.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        password.setText("Password:");
        registered.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 130, 31));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        registered.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TRAVEL BOOKING ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGEMENT SYSTEM");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 42, 240, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imy.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 77, 172, 186));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 296, 150, 96));

        registered.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 420));

        reg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        reg.setText("REGISTER");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        registered.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Don't have account yet?");
        registered.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 190, -1));

        jPanel1.add(registered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loguserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loguserActionPerformed
                                           
        dbConnector connector = new dbConnector();
       try {
        if (loginAcc(user.getText(), pass.getText())) {
            // If login is successful, check the account status and user type
            if (status == null || !status.equals("Active")) {
                JOptionPane.showMessageDialog(null, "Account is not active. Contact the Admin!");
            } else {
                // Check the user type
                if ("Admin".equals(type)) {
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    adminDashboard ads = new adminDashboard();
                    ads.setVisible(true);
                    this.dispose();
                } else if ("user".equals(type)) {
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    userDashboard usd = new userDashboard();
                    usd.setVisible(true);
                    this.dispose();
                } 
            }
} else {
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
        }
    } catch (NoSuchAlgorithmException ex) {
        Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
    }


    }//GEN-LAST:event_loguserActionPerformed

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
        registerForm rgf = new registerForm();
        rgf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regMouseClicked

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regActionPerformed
    
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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loginForm;
    private javax.swing.JButton loguser;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel password;
    private javax.swing.JButton reg;
    private javax.swing.JPanel registered;
    private javax.swing.JTextField user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
