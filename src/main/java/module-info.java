module com.example.schoolmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schoolmanagementsystem to javafx.fxml;
    exports com.example.schoolmanagementsystem;
}