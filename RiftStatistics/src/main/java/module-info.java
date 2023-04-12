module webapp.riftstatistics {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens webapp.riftstatistics to javafx.fxml;
    exports webapp.riftstatistics;
}