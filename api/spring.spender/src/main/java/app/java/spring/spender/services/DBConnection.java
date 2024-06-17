package app.java.spring.spender.services;

import app.java.spring.spender.EnvConfig;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class DBConnection {
    Connection DBConnection = null;

    public boolean ConnectToDB() {
        String DB_URL = EnvConfig.getDbUrl();
        String USER = EnvConfig.getDbUsername();
        String PASS = EnvConfig.getDbPassword();

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            DBConnection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException | ClassNotFoundException se) {
            // Handle errors for JDBC
            se.printStackTrace();
            return false;
        }

        System.out.println("Database connected!");
        return true;
    }

    public boolean ExecuteQuery(String query) {
        try {
            PreparedStatement pstmt = DBConnection.prepareStatement(query);
            pstmt.execute();
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }

        return true;
    }
}
