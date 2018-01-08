package com.provech.chess.gui;

import javafx.scene.Scene;

public class SceneManager {

    private final Scene scene;
    private final MenuPane menu;
    private final GamePane game;

    public SceneManager() {
        menu = new MenuPane(this);
        game = new GamePane(this);
        scene = new Scene(menu);
    }

    public Scene getScene() {
        return scene;
    }

    public void showGamePane() {
        scene.setRoot(game);
    }

    public void showMenuPane() {
        scene.setRoot(menu);
    }

}
