package com.loginApp;

import com.DBUtils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    private Connection connection;

    LoginModel() {
        try {
            this.connection = DBConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (this.connection == null) {
            System.exit(1);
        }
    }

    public boolean isDatabaseConnected() {
        return this.connection != null;
    }

    public boolean isLogin(String username, String password) {
        String query = "SELECT * FROM admins WHERE username = ? AND password = ?";
        try {
            if (this.connection != null) {
                PreparedStatement preparedStatement = this.connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                connection.close();
                return resultSet.next();
            }
        } catch (SQLException e) {
            System.out.println(e.fillInStackTrace().getMessage());
            return false;
        }
        return false;
    }
}
