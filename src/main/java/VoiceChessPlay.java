import Model.Board;
import Controller.Game;

import java.util.Scanner;

import static Constants.Position.*;

public class VoiceChessPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el tablero y la partida
        Board board = new Board();
        Game game = new Game(board);
//        board.printBoard();
        // while para mantener activa la partida
        // Inicia el juego
        //  .. Game.play

        board.movePiece(ROW_B, COL_1 , ROW_C, COL_1);
        board.printBoard();
        // Mueve el blanco
        //  .. game.whiteMovement

        // Mueve el negro
        //  .. Game.blackMovement


        // Siguiente turno
        // Game.BoardState

    }
}

