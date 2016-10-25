/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex41 {

    public static void main(String[] args) {
        try {
            String driveUrl = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(driveUrl, "db", "db");
            Statement stmt = con.createStatement();
            String sql = "select * from t_student";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String result = "";
                result += rs.getInt("student_id") + ":";
                result += rs.getString("fullname");
                System.out.println(result);
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }

}
