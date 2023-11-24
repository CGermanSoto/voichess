package org.germansoto.chess.Controller;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessBoardController {

    @FXML
    private GridPane chessBoard;

//    @FXML
//    private GridPane chessRight;
    private static final int BOARD_SIZE = 8;

    @FXML
    public void initialize() {
        initializeChessBoard();
    }

    private void initializeChessBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                Color color = (row + col) % 2 == 0 ? Color.WHITE : Color.BLACK;
                Rectangle squareChessBoard = createSquare(color);
//                Rectangle squareChessRight = createSquare(color);
                chessBoard.add(squareChessBoard, col, row);
//                chessRight.add(squareChessRight, col, row);
            }
        }
    }

    private Rectangle createSquare(Color color) {
        Rectangle square = new Rectangle(50, 50, color);
        square.setOnMouseClicked(event -> handleSquareClick(square));
        return square;
    }

    private void handleSquareClick(Rectangle square) {
        // Lógica para manejar el clic en un cuadrado del tablero
        System.out.println("Square clicked!");
    }
}
