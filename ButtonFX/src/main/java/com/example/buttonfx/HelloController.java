package com.example.buttonfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button clickMeButton;

//    @FXML
//    public void initialize() {
//        clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                onHelloButtonClick();
//            }
//        });
//    }

    @FXML
    public void initialize() {
        clickMeButton.setOnAction((actionEvent)->onHelloButtonClick());
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}