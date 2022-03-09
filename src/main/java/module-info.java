module com.example.tp2tdd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp2tdd to javafx.fxml;
    exports com.example.tp2tdd;
}
