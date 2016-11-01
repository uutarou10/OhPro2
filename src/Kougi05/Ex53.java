/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kougi05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex53 {
    public static void main(String[] args) {
        try {
            String driveUrl = "jdbc:derby://localhost:1527/meibo";
            int count = 0;
            Connection con = DriverManager.getConnection(driveUrl, "db", "db");
            String sql = "insert into t_student_a "
                    + "(fullname, gakubu_id, grade) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            //CSVの読み込み
            BufferedReader br = new BufferedReader(new FileReader(new File("student.csv")));
            String line = "";
            while ((line = br.readLine()) != null) {                
                String[] array = line.split(",");
                ps.setString(1, array[0]);
                ps.setInt(2, Integer.parseInt(array[1]));
                ps.setInt(3, Integer.parseInt(array[2]));
                
                count += ps.executeUpdate();
            }
            System.out.println(count + "件のレコードを追加しました。");
            
            con.close();
            ps.close();
            br.close();
        } catch (SQLException|IOException|NumberFormatException e) {
            e.printStackTrace();
        } 
    }
}
