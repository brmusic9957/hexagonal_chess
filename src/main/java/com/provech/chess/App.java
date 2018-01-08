package com.provech.chess;

import com.provech.chess.gui.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hexagonal Chess");
        primaryStage.setMinHeight(300);
        primaryStage.setMinWidth(300);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        final SceneManager sceneManager = new SceneManager();
        primaryStage.setScene(sceneManager.getScene());
        primaryStage.show();
    }

}
