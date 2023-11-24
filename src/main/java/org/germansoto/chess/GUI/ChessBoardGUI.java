package org.germansoto.chess.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class ChessBoardGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/germansoto/chess/GUI/ChessBoard.fxml"));
        primaryStage.setTitle("Voice Chess");

        // Obtén el tamaño de la pantalla principal
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();

        // Establece el tamaño del Scene para ocupar toda la pantalla
        Scene scene = new Scene(root, screenWidth, screenHeight);

        // Establece el Scene en el Stage
        primaryStage.setScene(scene);

        // Muestra el Stage.
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
