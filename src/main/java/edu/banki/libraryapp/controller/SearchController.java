package edu.banki.libraryapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    TextField searchField;

    @FXML
    Button seachButton;

    @FXML
    VBox dataContainer;

    @FXML
    TableView tableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initTable();
    }

    private void initTable() {
        tableView = new TableView<>();
        TableColumn author = new TableColumn<>("Szerző: ");
        TableColumn title = new TableColumn<>("Cím: ");
        TableColumn category = new TableColumn<>("Kategória: ");
        TableColumn year = new TableColumn<>("Kiadás:  ");
        TableColumn acquisitionDate = new TableColumn<>("Beszerzési dátum: ");

        tableView.getColumns().addAll(author,title,category, year, acquisitionDate);
        dataContainer.getChildren().add(tableView);
    }

}
