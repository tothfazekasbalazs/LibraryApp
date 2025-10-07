package edu.banki.libraryapp.controller;

import edu.banki.libraryapp.model.Book;
import edu.banki.libraryapp.model.DataManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

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
        Book book = new Book(author.getText(),title.getText(),categoryBox.getValue(),Integer.parseInt(year.getText()),datePicker.getValue());
        DataManager.addBook(book);
        showAlert("Sikeres mentés");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.showAndWait();
    }
}