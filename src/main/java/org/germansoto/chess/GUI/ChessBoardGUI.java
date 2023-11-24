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

        // Establece el título del Stage
        primaryStage.setTitle("Voice Chess");

        // Configura el tamaño de la pantalla principal
        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();

        // Establece el Scene
        Scene scene = new Scene(root, screenWidth, screenHeight);
        primaryStage.setScene(scene);

        // Maximiza la ventana (sin entrar en el modo de pantalla completa)
        primaryStage.setMaximized(true);

        // Muestra el Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
