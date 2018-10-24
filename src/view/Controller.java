package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btnDie;

    @FXML
    private Tooltip tooltipDie;

    @FXML
    private void initialize() {
        btnDie.setTooltip(tooltipDie);
    }

    @FXML
    private void close(){
        System.exit(0);
    }

    @FXML
    private void open(){
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("nuevaVentana.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Nueva ventana");
        stage.show();
    }

}
