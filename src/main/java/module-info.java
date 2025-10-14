module edu.banki.libraryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.banki.libraryapp to javafx.fxml;
    exports edu.banki.libraryapp;
    exports edu.banki.libraryapp.controller;
    opens edu.banki.libraryapp.controller to javafx.fxml;
    opens edu.banki.libraryapp.model to javafx.base, javafx.fxml;
}