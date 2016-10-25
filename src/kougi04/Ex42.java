package kougi04;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Ex42 {

    public static void main(String[] args) {
        try {
            String driveUrl = "jdbc:derby://localhost:1527/meibo";
            Connection con = DriverManager.getConnection(driveUrl, "db", "db");
            Statement stmt = con.createStatement();
            String sql = "select * from t_gakubu";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String result = "";
                result += rs.getInt("gakubu_id") + ":";
                result += rs.getString("gakubu_name");
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
