package com.loginApp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private LoginModel loginModel = new LoginModel();

    @FXML
    private Label dbstatus;

    @FXML
    private Label failureLogin;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button connectBtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.failureLogin.setVisible(false);
        if (this.loginModel.isDatabaseConnected()) {
            dbstatus.setText("Connecté");
            dbstatus.setTextFill(Color.rgb(0, 250, 0));
        } else {
            dbstatus.setText("Non Connecté");
            dbstatus.setTextFill(Color.rgb(250, 0, 0));
        }
    }

    @FXML
    public void login() {
        try {
            if (this.loginModel.isLogin(username.getText(), password.getText())) {
                this.failureLogin.setVisible(false);
                Stage stage = (Stage) this.connectBtn.getScene().getWindow();
                stage.close();
                Stage mainStage = new Stage();
                TabPane pane = FXMLLoader.load(getClass().getResource("/com/mainApp/main.fxml"));
                Scene scene = new Scene(pane);
                mainStage.setScene(scene);
                mainStage.setTitle("Gestionnaire de Stock");
                mainStage.getIcons().add(new Image(new File("asset/logo.png").toURI().toString()));
                mainStage.setResizable(false);
                mainStage.show();
            } else {
                this.failureLogin.setVisible(true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void exit() {
        System.exit(0);
    }
}
