package edu.banki.libraryapp.controller;

import edu.banki.libraryapp.model.Book;
import edu.banki.libraryapp.model.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Stack;

public class NewBookController implements Initializable {
    @FXML
    private TextField author, title, year;

    @FXML
    private ComboBox<String> categoryBox;

    @FXML
    private DatePicker datePicker;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        categoryBox.getItems().addAll("SzépIrodalom","Szkifi","Tudomány","Nyelvkönyv");
    }

    @FXML
    public void handleSave(ActionEvent event) {
        //Todo input validatoin
        try {
            Book book = new Book(author.getText(),title.getText(),categoryBox.getValue(),Integer.parseInt(year.getText()),datePicker.getValue());
            DataManager.addBook(book);
            showAlert("Sikeres mentés");
        }catch (Exception e) {
            showAlert("Hiba! Ellenőrizd az adatokat" + e.toString());
        }

    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.showAndWait();
    }

    public void goToStock(ActionEvent event) throws IOException {
        Stage stage = (Stage) author.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/edu/banki/libraryapp/stock-view.fxml")));
        stage.getScene(scene);
    }
}