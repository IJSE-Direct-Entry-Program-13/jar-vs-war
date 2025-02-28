package lk.ijse.dep13.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSceneController {
    public Button btnNavigate;
    public AnchorPane root;

    public void btnNavigateOnAction(ActionEvent actionEvent) throws IOException {
        Stage mainStage = (Stage) root.getScene().getWindow();
        mainStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/scene/SubScene.fxml"))));
        mainStage.centerOnScreen();
    }
}
