package com.provech.chess.gui;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

class MenuPane extends VBox {

    private final static String NEW_GAME = "New Game";
    private final static String ABOUT = "About us";

    private final SceneManager sceneManager;

    public MenuPane(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
        setAlignment(Pos.CENTER);
        setSpacing(10);
        getChildren().addAll(
                createNewGameButton(),
                createAboutButton()
        );
    }

    private Button createNewGameButton() {
        final Button button = new Button(NEW_GAME);
        button.setOnAction(event -> {
            System.out.println(NEW_GAME);
            sceneManager.showGamePane();
        });
        return button;
    }

    private Button createAboutButton() {
        final Button button = new Button(ABOUT);
        button.setOnAction(event -> System.out.println(ABOUT));
        return button;
    }

}
