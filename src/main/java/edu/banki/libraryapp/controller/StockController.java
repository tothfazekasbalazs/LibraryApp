package edu.banki.libraryapp.controller;

import edu.banki.libraryapp.model.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StockController implements Initializable {

    @FXML
    ListView<String> stockList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DataManager.getStock().forEach((category, count) -> stockList.getItems().add(category + ":" + count + " db"));
    }

    public void goToMain(ActionEvent event) throws IOException {
        Stage stage = (Stage) stockList.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/edu/banki/libraryapp/createbook-view.fxml")));
        stage.setScene(scene);
    }

    public void goSearch(ActionEvent event) throws IOException {
        Stage stage = (Stage) stockList.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/edu/banki/libraryapp/search-view.fxml")));
        stage.setScene(scene);
    }
}
