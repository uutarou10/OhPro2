/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enshu05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Calendar;

public class Kadai05_4 {
    public static void main(String[] args) {
        try {
            String drive = "jdbc:derby://localhost:1527/shop";
            String sql = "insert into t_item (itemname,price,stock,expiration) values (?,?,?,?)";
            
            Connection con = DriverManager.getConnection(drive, "db", "db");
            PreparedStatement ps = con.prepareStatement(sql);
            
            BufferedReader br = new BufferedReader(new FileReader(new File("item2.csv")));
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                
                Date expiration;
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, Integer.parseInt(array[3].split("-")[0]));
                cal.set(Calendar.MONTH, Integer.parseInt(array[3].split("-")[1])-1);
                cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(array[3].split("-")[2]));
                expiration = new Date(cal.getTimeInMillis());
                
                ps.setString(1, array[0]);
                ps.setInt(2, Integer.parseInt(array[1]));
                ps.setInt(3, Integer.parseInt(array[2]));
                ps.setDate(4, expiration);
                
                ps.executeUpdate();
            }
            
            con.close();
            ps.close();
            br.close();
        } catch (IOException|SQLException|NumberFormatException e) {
            e.printStackTrace();
        }
    }
    
}
