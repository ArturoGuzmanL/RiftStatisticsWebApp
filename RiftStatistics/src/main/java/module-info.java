module webapp.riftstatistics {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires Java.WebSocket;


    opens webapp.riftstatistics to javafx.fxml;
    exports webapp.riftstatistics;
}