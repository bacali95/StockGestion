package com.loginApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;

public class LoginApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(new File("asset/logo.png").toURI().toString()));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Gestionnaire du Stock");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
