package org.germansoto.chess.Service.Implements;

import org.germansoto.chess.Service.IGameService;
import org.germansoto.chess.Util.PositionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService implements IGameService {
    @Autowired
    private BoardService boardService;
    private boolean isWhiteTurn;
    private boolean isGameOver;

    public GameService(BoardService boardService) {
        this.boardService = boardService;
        this.isWhiteTurn = true;
        this.isGameOver = false;
    }
    @Override
    public boolean processUserMove() {
        // Lógica para procesar el movimiento del usuario
        this.boardService.movePiece(PositionConstants.ROW_B, PositionConstants.COL_1 , PositionConstants.ROW_C, PositionConstants.COL_1);
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

    @Override
    public void play(){
        processUserMove();
        boardService.printBoard();
    }
}

