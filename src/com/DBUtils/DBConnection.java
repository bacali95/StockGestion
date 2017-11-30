package com.DBUtils;

import com.mainApp.BorrowData;
import com.mainApp.BorrowerData;
import javafx.beans.property.SimpleMapProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

import java.sql.*;
import java.util.ArrayList;

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
