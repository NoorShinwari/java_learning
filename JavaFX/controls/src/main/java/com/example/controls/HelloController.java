package com.example.controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField textToPrint;


    @FXML
    private Button clickMeButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public  void initialize(){
        clickMeButton.setDisable(true);
    }

    @FXML protected  void printValueHandler(ActionEvent e){
        System.out.println("This has been typed " + textToPrint.getText());
        System.out.println("this is event " + e.getSource());

    }

    @FXML
    public void handleKeyReleased(){
        String text= textToPrint.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        clickMeButton.setDisable(disableButton);

    }
}
