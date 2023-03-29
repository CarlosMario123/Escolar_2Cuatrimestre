package com.example.proyectopoofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1252, 777);
        stage.setTitle("DemandasSoft");
//        String CssMain = Objects.requireNonNull(this.getClass().getResource("Main.css")).toExternalForm();
//        scene.getStylesheets().add(CssMain);
        scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}