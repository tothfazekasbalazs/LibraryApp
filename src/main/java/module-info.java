module edu.banki.libraryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.banki.libraryapp to javafx.fxml;
    exports edu.banki.libraryapp;
}