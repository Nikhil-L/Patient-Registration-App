package com.patient_registration;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connect to Database
 * @author NL089834
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/patient_registration_app";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static ConnectionFactory connectionFactory;

    /**
     * Get a connection to database
     * @return Connection object
     */
    public static Connection getConnection()
    {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }

}

