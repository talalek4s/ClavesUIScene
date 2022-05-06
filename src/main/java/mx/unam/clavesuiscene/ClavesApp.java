package mx.unam.clavesuiscene;

//package mx.unam.clavesuiscene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class ClavesApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClavesApp.class.getResource("claves-view.fxml"));
        Group rootGroup = fxmlLoader.load();

        final ClavesAppController controller = fxmlLoader.getController();
        controller.setStage(stage);
        //controller.setupBinding();


        Scene scene = new Scene(rootGroup, 420, 240);
        scene.setFill(Color.LIGHTBLUE);
        stage.setTitle("Generador de contraseñas");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}