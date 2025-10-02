package edu.banki.libraryapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewBookController {
    @FXML
    private TextField author, title, year;

    @FXML
    private ComboBox<String> categoryBox;

    @FXML
    private DatePicker datePicker;

}