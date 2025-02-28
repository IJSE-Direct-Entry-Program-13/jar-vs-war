package lk.ijse.dep13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/scene/MainScene.fxml"))));
        stage.setTitle("Jar Application");
        stage.show();
        stage.centerOnScreen();
    }
}
