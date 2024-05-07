package org.example.App;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 240, 475);
        stage.setScene(scene);
        stage.setTitle("bulium");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}