package edu.banki.libraryapp.controller;

import edu.banki.libraryapp.model.Book;
import edu.banki.libraryapp.model.DataManager;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    Button goBacktoStock;
    @FXML
    TextField searchField;

    @FXML
    Button seachButton;

    @FXML
    VBox dataContainer;

    @FXML
    TableView tableView;

    ObservableList<Book> masterData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        masterData.addAll(DataManager.getBooks());
        initTable();
    }

    private void initTable() {
        tableView = new TableView<>(masterData);
        TableColumn author = new TableColumn<>("Szerző: ");
        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        TableColumn title = new TableColumn<>("Cím: ");
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumn category = new TableColumn<>("Kategória: ");
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        TableColumn year = new TableColumn<>("Kiadás:  ");
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        TableColumn acquisitionDate = new TableColumn<>("Beszerzési dátum: ");
        acquisitionDate.setCellValueFactory(new PropertyValueFactory<>("acquisitionDate"));

        tableView.getColumns().addAll(author,title,category, year, acquisitionDate);
        dataContainer.getChildren().add(tableView);
    }

    public void goBack(ActionEvent event) throws IOException {
        Stage stage = (Stage) tableView.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/edu/banki/libraryapp/stock-view.fxml")));
        stage.setScene(scene);
    }

}
