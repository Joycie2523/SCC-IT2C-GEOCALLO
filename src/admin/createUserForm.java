
package admin;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static travelapp.registerForm.em;
import static travelapp.registerForm.usname;

/**
 *
 * @author geoca
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
    public String destination ="";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/userimages", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
      public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }

    
public boolean duplicateCheck(){

    dbConnector dbc = new dbConnector();
    
    try { 
       
      
        String query = "SELECT * FROM tbl_user WHERE u_username = '" + username.getText() + "' OR email = '" + email.getText() + "'";
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
            if (usname.equals(username.getText())) { 
                JOptionPane.showMessageDialog(null, "Username is already used!");
                  username.setText(""); 
                return true; 
            }
        }
        return false; 
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false; 
    }
    }
 
    public boolean updateCheck(){

    dbConnector dbc = new dbConnector();
    
    try { 
        String query = "SELECT * FROM tbl_user WHERE (u_username = '" + username.getText() + "' OR email = '" + email.getText() + "') AND u_id !='"+uid.getText()+"'";
       
        
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
            if (usname.equals(username.getText())) { 
                JOptionPane.showMessageDialog(null, "Username is already used!");
                  username.setText(""); 
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

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pnum = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        ut = new javax.swing.JComboBox<>();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        pnumber = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        pword = new javax.swing.JLabel();
        accountType = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        us = new javax.swing.JComboBox<>();
        accountType1 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        refresh1 = new javax.swing.JButton();
        select = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel4.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, -1));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel4.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, -1));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, -1));

        pnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnumActionPerformed(evt);
            }
        });
        jPanel4.add(pnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, -1));

        password.setEnabled(false);
        jPanel4.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, -1));

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "user" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel4.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 200, -1));

        firstName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        firstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        firstName.setText("First Name:");
        jPanel4.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        lastName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lastName.setText("Last Name:");
        jPanel4.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 20));

        mail.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mail.setText("Email:");
        jPanel4.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 20));

        pnumber.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pnumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnumber.setText("Phone Number:");
        jPanel4.add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        uname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uname.setText("Username:");
        jPanel4.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        pword.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        pword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pword.setText("Password:");
        jPanel4.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 20));

        accountType.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accountType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountType.setText("Account Type:");
        jPanel4.add(accountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 150, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, -1, 594));

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel4.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 200, -1));

        accountType1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        accountType1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        accountType1.setText("User Status:");
        jPanel4.add(accountType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, 20));

        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        jPanel4.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 200, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("User ID:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 20));

        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 90, -1));

        clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel4.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 90, -1));

        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 100, -1));

        add.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 90, -1));

        cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel4.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 90, -1));

        remove.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel4.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 100, -1));

        jPanel5.setLayout(null);
        jPanel5.add(image);
        image.setBounds(6, 28, 240, 240);

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 250, 280));

        refresh1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refresh1.setText("REFRESH");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });
        jPanel4.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 100, -1));

        select.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        select.setText("SELECT");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel4.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 100, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 740, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
  if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || 
        pnum.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required!");
    } 
    else if (password.getText().length() < 8) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters above!");
        password.setText("");
    } 
    else if (updateCheck()) {
        System.out.println("Duplicate Exist");
    } 
    else {
        dbConnector dbc = new dbConnector();
        dbc.updateData("UPDATE tbl_user SET u_fname ='" + fname.getText() + "', u_lname ='" + lname.getText() + "', email ='" + email.getText() + "', phone_number ='" + pnum.getText() + "',"
               + "u_username ='" + username.getText() + "',u_password ='" + password.getText() + "', u_type ='" + ut.getSelectedItem() + "',"
               + " u_status ='" + us.getSelectedItem() + "', u_image = '"+destination+"' WHERE u_id ='" + uid.getText() + "'");
        JOptionPane.showMessageDialog(null,"Updated Successfully!");
        
        if(destination.isEmpty()){
         File existingFile = new File(oldpath); 
         if(existingFile.exists()){
         existingFile.delete();
         }
        }else{
        if(!(oldpath.equals(path))){
            imageUpdater(oldpath, path);
        }
        }
        usersForm usf = new usersForm();
        usf.setVisible(true);
        this.dispose();
    }


    }//GEN-LAST:event_updateActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    
    }//GEN-LAST:event_addActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usersForm usf = new usersForm();
        usf.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_cancelActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        select.setEnabled(true);
        image.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      if (duplicateCheck()) {
        return; 
    }                                                                                                   

if (fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || 
    pnum.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required!");
} 
// Check for password length
else if (password.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
    password.setText("");
} 

else if (!pnum.getText().matches("\\d+")) { 
    JOptionPane.showMessageDialog(null, "Contact number should only accept numbers!");
    pnum.setText(""); 
} 
else {
    dbConnector dbc = new dbConnector();
    
  
    String sql = "INSERT INTO tbl_user(u_fname, u_lname, email, phone_number, u_username, u_password, u_type, u_status, u_image) "
               + "VALUES('" + fname.getText() + "','" + lname.getText() + "','" + email.getText() + "','" 
               + pnum.getText() + "','" + username.getText() + "','" + password.getText() + "','" 
               + ut.getSelectedItem() + "','"+us.getSelectedItem()+"', '"+destination+"')";
  
    System.out.println("SQL Query: " + sql);
     if (dbc.insertData(sql)) {
    try {
        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
        JOptionPane.showMessageDialog(null, "Inserted Successfully!");
        usersForm usf = new usersForm();
        usf.setVisible(true);
        this.dispose();
    } catch (IOException ex) {
        System.out.println("Insert Image Error: " + ex);
    }
} else {
    JOptionPane.showMessageDialog(null, "Connection Error!");
}

}

   

    }//GEN-LAST:event_addMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
    
 
    




    }//GEN-LAST:event_updateMouseClicked

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1ActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
         JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimages/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            select.setEnabled(false);
                            remove.setEnabled(true);
                       
                       
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }


    }//GEN-LAST:event_selectActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountType;
    private javax.swing.JLabel accountType1;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JTextField email;
    private javax.swing.JLabel firstName;
    public javax.swing.JTextField fname;
    public javax.swing.JLabel image;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lastName;
    public javax.swing.JTextField lname;
    private javax.swing.JLabel mail;
    public javax.swing.JPasswordField password;
    public javax.swing.JTextField pnum;
    private javax.swing.JLabel pnumber;
    private javax.swing.JLabel pword;
    private javax.swing.JButton refresh1;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JTextField uid;
    private javax.swing.JLabel uname;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField username;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
