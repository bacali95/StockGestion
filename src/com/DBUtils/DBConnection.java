package com.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String SQLiteCONN = "jdbc:sqlite:stockgestion.sqlite";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection(SQLiteCONN);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
