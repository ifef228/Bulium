module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;
    requires charm.glisten;


    opens org.example.App to javafx.fxml;
    opens org.example.App.currency to com.google.gson;
    exports org.example.App;
}