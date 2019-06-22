package com.view.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserManagementController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private AnchorPane root;

    @FXML
    private AnchorPane sidebar;

    @FXML
    private JFXButton btnDashboard;

    @FXML
    private JFXButton btnBookMgmt;

    @FXML
    private JFXButton btnMemberMgmt;

    @FXML
    private JFXButton btnUserMgmt;

    @FXML
    private JFXButton btnLendBook;

    @FXML
    private JFXButton btnSignOut;

    @FXML
    private JFXButton addUser;

    @FXML
    private JFXTextField usernameField;

    @FXML
    private JFXButton searchUser;

    @FXML
    private JFXButton updateUser;

    @FXML
    private JFXButton deleteUser;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    private TableView<?> usersTable;

    @FXML
    private TableColumn<?, ?> UsernameColumn;

    @FXML
    private TableColumn<?, ?> PasswordColumn;

    @FXML
    void addUser(ActionEvent event) {

    }

    @FXML
    void btnBookMgmt(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/com/view/fxml/BookManagement.fxml")));
            root.getChildren().setAll(pane);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnDashboard(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/com/view/fxml/Dashboard.fxml")));
            root.getChildren().setAll(pane);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnLendBook(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/com/view/fxml/LendBook.fxml")));
            root.getChildren().setAll(pane);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnMemberMgmt(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/com/view/fxml/MemberManagement.fxml")));
            root.getChildren().setAll(pane);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void btnSignOut(ActionEvent event) {

    }

    @FXML
    void btnUserMgmt(ActionEvent event) {
        try {
            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/com/view/fxml/UserManagement.fxml")));
            root.getChildren().setAll(pane);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    @FXML
    void deleteUser(ActionEvent event) {

    }

    @FXML
    void searchUser(ActionEvent event) {

    }

    @FXML
    void updateUser(ActionEvent event) {

    }
}
