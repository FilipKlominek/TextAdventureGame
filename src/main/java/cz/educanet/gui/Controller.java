package cz.educanet.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    public Button btnHelloWorld;

    public void onHelloWorldClicked(ActionEvent actionEvent) {
        System.out.println("Hello world!");
        btnHelloWorld.setText("Ahoj");
    }
}
