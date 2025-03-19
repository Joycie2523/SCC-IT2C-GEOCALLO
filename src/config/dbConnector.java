package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbConnector {
    private Connection connect;

    // Constructor to connect to our database
    public dbConnector() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/geocallo", "root", "");
        } catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }

    // Method to retrieve data
    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = connect.createStatement();
        ResultSet rst = stmt.executeQuery(sql);
        return rst;
    }

   
        public boolean insertData(String sql) {
    try {
        Connection conn = this.getConnection(); // Ensure this method returns a valid connection
        Statement stmt = conn.createStatement();
        int rowsAffected = stmt.executeUpdate(sql);
        stmt.close(); // Close the statement
        return rowsAffected > 0; // Return true if at least one row was affected
    } catch (SQLException e) {
        System.out.println("Error during insertion: " + e.getMessage());
        return false; // Return false if there was an error
    }

    }

    // Method to get the connection
    public Connection getConnection() {
        return connect;
    }
   //Function to update data
        public boolean updateData(String sql){
            try{
                PreparedStatement pst = connect.prepareStatement(sql);
                    int rowsUpdated = pst.executeUpdate();
                        if(rowsUpdated > 0){
                            JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
                        }else{
                            System.out.println("Data Update Failed!");
                        }
                        pst.close();
            }catch(SQLException ex){
                System.out.println("Connection Error: "+ex);
            }
        
        return false;
        }
}
        



