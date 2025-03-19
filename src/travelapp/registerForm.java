package travelapp;

import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class registerForm extends javax.swing.JFrame {

    public registerForm() {
        initComponents();
    }
    public static String em,usname;
    public boolean duplicateCheck(){

    dbConnector dbc = new dbConnector();
    
    try { 
        // Correct the query syntax
        String query = "SELECT * FROM tbl_user WHERE u_username = '" + user.getText() + "' OR email = '" + email.getText() + "'";
        
        ResultSet resultSet = dbc.getData(query);

        if (resultSet.next()) {
            em = resultSet.getString("email");
            System.out.println("" + em); 
            if (em.equals(email.getText())) { 
                JOptionPane.showMessageDialog(null, "Email is already used!");
               email.setText(""); 
                return true; 
            }
            usname = resultSet.getString("u_username");
            System.out.println("" + usname); 
            if (usname.equals(user.getText())) { 
                JOptionPane.showMessageDialog(null, "Username is already used!");
                  user.setText(""); 
                return true; 
            }
        }
        return false; 
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false; 
    }
}
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        checkbox1 = new java.awt.Checkbox();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        registration = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pnum = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        ut = new javax.swing.JComboBox<>();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        pnumber = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        pword = new javax.swing.JLabel();
        accountType = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        checkbox1.setLabel("checkbox1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registration.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        registration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registration.setText("REGISTRATION FORM");
        jPanel4.add(registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 440, 40));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel4.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 220, 40));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel4.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 220, 40));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 220, 40));

        pnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumActionPerformed(evt);
            }
        });
        jPanel4.add(pnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 220, 40));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel4.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 220, 40));
        jPanel4.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 220, 40));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "user" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel4.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 220, 40));

        register.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel4.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, -1, 30));

        login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        login.setText("LOGIN");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel4.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 90, 30));

        firstName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstName.setText("First Name:");
        jPanel4.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 150, -1));

        lastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastName.setText("Last Name:");
        jPanel4.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, 20));

        mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mail.setText("Email:");
        jPanel4.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 130, 20));

        pnumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pnumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnumber.setText("Phone Number:");
        jPanel4.add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 170, 30));

        uname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uname.setText("Username:");
        jPanel4.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 140, -1));

        pword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pword.setText("Password:");
        jPanel4.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 140, 20));

        accountType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accountType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountType.setText("Account Type:");
        jPanel4.add(accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 150, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, -1, 594));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRAVEL BOOKING");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 225, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("MANAGEMENT SYSTEM");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 47, 215, -1));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imy.png"))); // NOI18N
        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 87, 210, 272));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ok.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 368, 150, 96));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 240, 490));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void pnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnumActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
                                             

    if (duplicateCheck()) {
        return;
    }

    try {
        String u_password = passwordHasher.hashPassword(pass.getText());

        if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() ||
            pnum.getText().isEmpty() || user.getText().isEmpty() || pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } 
        else if (pass.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
            pass.setText("");
        } 
        else if (!pnum.getText().matches("\\d+")) { 
            JOptionPane.showMessageDialog(null, "Contact number should only accept numbers!");
            pnum.setText(""); 
        } 
        else {
            dbConnector dbc = new dbConnector();

            String sql = "INSERT INTO tbl_user(u_fname, u_lname, email, phone_number, u_username, u_password, u_type, u_status, u_image) "
               + "VALUES('" + fname.getText() + "','" + lname.getText() + "','" + email.getText() + "','" 
               + pnum.getText() + "','" + user.getText() + "','" + u_password + "','" 
               + ut.getSelectedItem() + "','Pending', 'destination')";


            System.out.println("SQL Query: " + sql);

            if (dbc.insertData(sql)) {
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                loginForm lfr = new loginForm();
                lfr.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    } catch (NoSuchAlgorithmException ex) {
        System.out.println("Error: " + ex);   
    }



             
     
    

   


   
      
    }//GEN-LAST:event_registerActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
      loginForm lgf = new loginForm();
      lgf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountType;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lname;
    private javax.swing.JButton login;
    private javax.swing.JLabel mail;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField pnum;
    private javax.swing.JLabel pnumber;
    private javax.swing.JLabel pword;
    private javax.swing.JButton register;
    private javax.swing.JLabel registration;
    private javax.swing.JLabel uname;
    private javax.swing.JTextField user;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
