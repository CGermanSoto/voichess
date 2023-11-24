package org.germansoto.chess.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextArea;
import org.w3c.dom.css.Rect;

import static javafx.scene.paint.Color.BLACK;
import static javafx.scene.paint.Color.WHITE;

public class ChessBoardController {

    @FXML
    private GridPane chessBoard;

    @FXML
    private GridPane gridPaneConsole;

    @FXML
    private TextArea textAreaConsole;

    private static final int BOARD_SIZE = 8;

    @FXML
    public void initialize() {
        initializeChessBoard();
    }

    private void initializeChessBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Color color = (row + col) % 2 == 0 ? WHITE : BLACK;
                Rectangle squareChessBoard = createSquare(color);
                chessBoard.add(squareChessBoard, col, row);
            }
        }
    }

    private Rectangle createSquare(Color color) {
        Rectangle square = new Rectangle(50, 50, color);
        square.setOnMouseClicked(event -> handleSquareClick(square));
        return square;
    }

    private void handleSquareClick(Rectangle square) {
        // Obtener las coordenadas del cuadrado clicado
        Integer ejeX = GridPane.getColumnIndex(square);
        Integer ejeY = GridPane.getRowIndex(square);

        // Obtener el texto actual del TextArea
        String textoActual = textAreaConsole.getText();

        // Concatenar las nuevas coordenadas al texto actual, con un salto de línea
        String nuevoTexto = textoActual + "Click en (" + ejeX + ", " + ejeY + ")\n";

        // Establecer el nuevo texto en el TextArea
        textAreaConsole.setText(nuevoTexto);
    }

}
