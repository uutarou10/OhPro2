/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kougi05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex52 {
    public static void main(String[] args) {
        try {
            String driveUrl = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(driveUrl,"db","db");
//            Statement stmt = con.createStatement
            String sql = "insert into t_student_a "
                    + "(fullname, gakubu_id, grade) "
                    + "values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "星野源");
            ps.setInt(2, 2);
            ps.setInt(3, 3);
            int count = ps.executeUpdate();
            System.out.println(count + "件のレコードを追加しました。");
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
