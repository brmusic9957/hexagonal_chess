package com.provech.chess.gui;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

class GamePane extends StackPane {

    private final SceneManager sceneManager;

    public GamePane(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
        Label label = new Label("Game pane");
        this.getChildren().add(label);
    }

}
