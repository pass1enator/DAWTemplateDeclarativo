module com.mycompany.declarativo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.declarativo to javafx.fxml;
    exports com.mycompany.declarativo;
}
