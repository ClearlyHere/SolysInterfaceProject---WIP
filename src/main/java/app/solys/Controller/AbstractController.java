package app.solys.Controller;

import app.solys.Lib.SceneManager;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AbstractController implements Initializable {
    @FXML
    protected Tab clientsTab;

    @FXML
    protected Tab comptesTab;

    @FXML
    protected Tab employesTab;

    @FXML
    protected Tab locationsTab;

    @FXML
    protected Tab transactionsTab;

    @FXML
    protected Tab vehiculesTab;

    @FXML
    protected ScrollPane scrollPane;

    @FXML
    protected SplitPane splitPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        splitPane.setDividerPositions(0.2f, 0.8f);
    }
}
