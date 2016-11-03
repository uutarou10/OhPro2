/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enshu05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Kadai05_2 {

    public static void main(String[] args) {
        try {
            String drive = "jdbc:derby://localhost:1527/shop";
            String sql = "insert into t_item (itemname,price,stock) values (?,?,?)";
            Connection con = DriverManager.getConnection(drive, "db", "db");
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, "りんごヨーグルト");
            ps.setInt(2, 180);
            ps.setInt(3, 80);
            
            ps.executeUpdate();
            
            con.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
