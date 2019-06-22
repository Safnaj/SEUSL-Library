package com.view.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MemberManagementController implements Initializable {

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
    private JFXButton addMember;

    @FXML
    private JFXTextField memberIdField;

    @FXML
    private JFXButton searchMember;

    @FXML
    private JFXButton updateMember;

    @FXML
    private JFXButton deleteManagement;

    @FXML
    private JFXTextField nameField;

    @FXML
    private JFXTextField doaField;

    @FXML
    private JFXTextField emailField;

    @FXML
    private JFXTextField phoneField;

    @FXML
    private JFXRadioButton genderField;

    @FXML
    private ToggleGroup Gender;

    @FXML
    private TableView<?> membersTable;

    @FXML
    private TableColumn<?, ?> MemberIdColumn;

    @FXML
    private TableColumn<?, ?> NameColumn;

    @FXML
    private TableColumn<?, ?> DOAColumn;

    @FXML
    private TableColumn<?, ?> GenderColumn;

    @FXML
    private TableColumn<?, ?> EmailColumn;

    @FXML
    private TableColumn<?, ?> PhoneColumn;

    @FXML
    void addMember(ActionEvent event) {

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
    void deleteManagement(ActionEvent event) {

    }

    @FXML
    void searchMember(ActionEvent event) {

    }

    @FXML
    void updateMember(ActionEvent event) {

    }
}
