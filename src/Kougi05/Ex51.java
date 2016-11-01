/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kougi05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex51 {
    public static void main(String[] args) {
        try {
            String driveUrl = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(driveUrl,"db","db");
            Statement stmt = con.createStatement();
            String sql = "insert into t_student "
                    + "(student_id, fullname, gakubu_id, grade, score) "
                    + "values (7, '新垣結衣', 2, 3, 50)";
            int count = stmt.executeUpdate(sql);
            System.out.println(count + "件のレコードを追加しました。");
            stmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
