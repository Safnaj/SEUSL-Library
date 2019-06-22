package com.view.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private AnchorPane root;

    @FXML
    private JFXTextField usernameField;

    @FXML
    private JFXButton Login;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    void Login(ActionEvent event) {

    }
}
