package com.cedricverlinden.banking;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BankingController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to the Banking Application!");
    }
}