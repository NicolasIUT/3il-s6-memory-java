module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.memory to javafx.fxml;
    exports com.example.memory;
}