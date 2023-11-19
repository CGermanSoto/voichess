import Controller.GameController;
import Service.Implements.BoardService;
import Service.Implements.GameService;

import java.util.Scanner;

public class VoiceChessPlay {
    public static void main(String[] args) {
        // Crear el tablero y la partida
//        BoardService boardService = new BoardService();
//        GameService gameService = new GameService(boardService);
//        gameService.play();
        GameController gameController = new GameController();
        gameController.play();
        // while para mantener activa la partida
        // Inicia el juego
        //  .. GameService.play


        // Mueve el blanco
        //  .. gameService.whiteMovement

        // Mueve el negro
        //  .. GameService.blackMovement


        // Siguiente turno
        // GameService.BoardState

    }
}

