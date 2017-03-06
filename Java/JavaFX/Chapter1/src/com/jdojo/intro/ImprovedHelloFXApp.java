package com.jdojo.intro;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * File  : ImprovedHelloFXApp
 * Author: Ujwal Bharat Nagumantri
 * Desc  :
 */
public class ImprovedHelloFXApp extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage){
    Label name_label = new Label("Enter your name:");
    TextField name_txtFld = new TextField();

    Label msg = new Label();
    msg.setStyle("-fx-text-fill: blue;");

    //create buttons
    Button sayHello_btn = new Button("Say Hello");
    Button exit_btn = new Button("Exit");

    //Add the event handler for the say hello button
    sayHello_btn.setOnAction(e -> {
      String name = name_txtFld.getText();
      if(name.trim().length() > 0){
        msg.setText("Hello, "+name+"!");
      }else{
        msg.setText("Hello there!");
      }
    });

    //event handler for exit button
    exit_btn.setOnAction(e-> Platform.exit());

    //Create the root node
    VBox root = new VBox();
    root.setSpacing(5);
    root.getChildren().addAll(name_label,name_txtFld,msg,sayHello_btn,exit_btn);
    Scene scene = new Scene(root,500,500);
    stage.setScene(scene);
    stage.setTitle("Improved HelloFX App");
    stage.show();
  }
}
