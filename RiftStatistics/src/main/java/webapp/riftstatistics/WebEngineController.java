package webapp.riftstatistics;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class WebEngineController implements Initializable {

    @FXML
    private WebView webViewPrincipal;
    @FXML
    private BorderPane borderPaneBase;
    @FXML
    private GridPane gridPaneBarraSuperior;

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle) {
        final WebEngine webEngine = webViewPrincipal.getEngine();
        URL urlhtml = getClass().getResource("/webapp/riftstatistics/web/index.html");
        webEngine.load(urlhtml.toExternalForm());
    }
}