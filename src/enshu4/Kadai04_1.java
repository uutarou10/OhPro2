/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enshu4;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Kadai04_1 {

    public static void main(String[] args) {
        try {
            String driveUrl = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(driveUrl, "db", "db");
            Statement stmt = con.createStatement();
            String sql = "select * from t_student";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String result = "";
                result += rs.getInt("student_id") + ",";
                result += rs.getString("fullname") + ",";
                result += rs.getInt("gakubu_id") + ",";
                result += rs.getInt("grade") + ",";
                result += rs.getInt("score");
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
