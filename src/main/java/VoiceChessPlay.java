import Model.Board;
import Controller.Game;

import java.util.Scanner;

public class VoiceChessPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el tablero y la partida
        Board board = new Board();
        Game game = new Game(board);

        // while para mantener activa la partida
        // Inicia el juego
        //  .. Game.play

        // Mueve el blanco
        //  .. game.whiteMovement

        // Mueve el negro
        //  .. Game.blackMovement


        // Siguiente turno
        // Game.BoardState

    }
}

