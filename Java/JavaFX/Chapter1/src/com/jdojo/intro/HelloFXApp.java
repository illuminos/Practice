package com.jdojo.intro;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * File  : HelloFXApp
 * Author: Ujwal Bharat Nagumantri
 * Desc  :
 */
public class HelloFXApp extends Application{

  public static void main(String[] args) {
    //launch the javaFX application
    Application.launch(args);
  }

  @Override
  public void start(Stage stage){
    //logic for starting the application goes here
    Text msg = new Text("Hello, JavaFX !");
    VBox root = new VBox();
    root.getChildren().add(msg);
    Scene scene = new Scene(root,1024,768);

    Button exit_button = new Button("Exit");

    //using lambda expression
    exit_button.setOnAction(e -> Platform.exit());

    stage.setScene(scene);
    stage.setTitle("Hello JavaFX Application");
    stage.show();
  }


}
