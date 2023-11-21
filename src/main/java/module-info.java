module com.cedricverlinden.banking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cedricverlinden.banking to javafx.fxml;
    exports com.cedricverlinden.banking;
}