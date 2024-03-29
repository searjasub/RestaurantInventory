package app;

import controller.MainStageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/MainStage.fxml"));
            BorderPane root = loader.load();
            MainStageController c = loader.getController();

            Scene scene = new Scene(root, 400, 300);

            c.setPrimaryStage(primaryStage, scene);
            primaryStage.setTitle("Restaurant Inventory Manager");
            primaryStage.setScene(scene);
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../icon/icon2.png")));
            primaryStage.show();
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
