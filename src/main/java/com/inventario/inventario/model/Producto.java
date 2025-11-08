package com.inventario.inventario.model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Producto {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
