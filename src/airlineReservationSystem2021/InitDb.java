/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineReservationSystem2021;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mohd Mohsin Ismail
 */
public class InitDb {

    private static Connection conn = null;

    public static Connection getConnection() {

        try {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://103.233.0.82/essapp_oop";
            Class.forName(myDriver);
            System.out.println("Connection established......");
            conn = DriverManager.getConnection(myUrl, "essapp_essapp", "kdo#UL.n@0=0");

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return conn;
    }

    public static void close() throws SQLException {
        conn.close();
    }
}
