

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Kadai05_5 {
    public static void main(String[] args) {
        try {
            String drive = "jdbc:derby://localhost:1527/shop";
            String sql = "select item_id,itemname,stock,expiration from t_item where expiration<current_date";

            Connection con = DriverManager.getConnection(drive, "db", "db");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            
            System.out.println("現在の日付：" + new Date(new java.util.Date().getTime()));
            while(rs.next()) {
                System.out.print(rs.getInt("item_id") + ":");
                System.out.print(rs.getString("itemname") + ":");
                System.out.print(rs.getInt("stock") + ":");
                System.out.println(rs.getDate("expiration"));
            }
            

            con.close();
            stmt.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
