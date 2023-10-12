module com.example.theirtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.theirtipcalculator to javafx.fxml;
    exports com.example.theirtipcalculator;
}