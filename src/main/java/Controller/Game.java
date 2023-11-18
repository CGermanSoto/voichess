package Controller;

import Model.Board;

public class Game {
    private Board board;
    private boolean isWhiteTurn;
    private boolean isGameOver;

    public Game(Board board) {
        this.board = board;
        this.isWhiteTurn = true;
        this.isGameOver = false;
    }

    public boolean processUserMove(String input) {
        // Lógica para procesar el movimiento del usuario
        // this.board.movePiece();
        // Parsear la entrada, validar el movimiento, etc.
        // this.board.isValidMove();
        // Devolver true si el movimiento es válido, false si no lo es.
        // Cambio de turno
        this.switchTurn();
        return true;  // Placeholder, debes implementar la lógica real.
    }

    public void switchTurn() {
        isWhiteTurn = !isWhiteTurn;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public String getGameResult() {
        // Lógica para determinar el resultado del juego (jaque mate, empate, etc.)
        return "Resultado del juego";  // Placeholder, debes implementar la lógica real.
    }
}

