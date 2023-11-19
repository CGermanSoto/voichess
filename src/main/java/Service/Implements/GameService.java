package Service.Implements;

import Service.IGameService;

import static Util.PositionConstants.*;
import static Util.PositionConstants.COL_1;

public class GameService implements IGameService {
    private BoardService boardService;
    private boolean isWhiteTurn;
    private boolean isGameOver;

    public GameService(BoardService boardService) {
        this.boardService = boardService;
        this.isWhiteTurn = true;
        this.isGameOver = false;
    }

    public boolean processUserMove() {
        // Lógica para procesar el movimiento del usuario
        this.boardService.movePiece(ROW_B, COL_1 , ROW_C, COL_1);
        // Test de boardService
        this.boardService.printBoard();
        // Parsear la entrada, validar el movimiento, etc.
        // this.boardService.isValidMove();
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

    public void play(){
        processUserMove();
        boardService.printBoard();
    }
}

