package com.example.helloworldfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 240);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
    }

    // @Override
    // public void start(Stage stage) throws IOException {
    // // FXMLLoader fxmlLoader = new
    // // FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

    // GridPane root = new GridPane();
    // root.setAlignment(Pos.CENTER);
    // root.setVgap(10);
    // root.setHgap(10);

    // Label greeting = new Label("Welcome to JavaFX!");

    // VBox box = new VBox();
    // box.setAlignment(Pos.CENTER);
    // box.setSpacing(20);
    // Insets inset = new Insets(20);
    // box.setPadding(inset);

    // Button button = new Button();
    // button.setText("Welome");
    // EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {

    // @Override
    // public void handle(ActionEvent arg0) {
    // // TODO Auto-generated method stub
    // System.out.println(arg0);
    // greeting.setText("Welcome to JavaFX Application!\nAnd Hello to the world of
    // JavaFX!!");

    // }

    // };
    // button.setOnAction(event);

    // box.getChildren().addAll(greeting, button);
    // root.getChildren().add(box);

    // Scene scene = new Scene(root, 320, 240);
    // stage.setTitle("Hello World!");
    // stage.setScene(scene);
    // stage.show();
    // }

    public static void main(String[] args) {
        launch();
    }
}