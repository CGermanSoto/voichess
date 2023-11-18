package Model;

import Constants.Position;
import Model.pieces.*;

import static Constants.BoardConstants.BOARD_SIZE;
import static Constants.Color.BLACK;
import static Constants.Color.WHITE;
import static Constants.Position.*;

public class Board {
    private Piece[][] board;

    public Board(){
        this.board = new Piece[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        // Mueve la pieza de la posición inicial a la posición final si el movimiento es válido.
        if(!isValidMove(startX, startY, endX, endY)){
            return false;
        }
        // Devuelve true si el movimiento fue exitoso, false si fue inválido.
        return true;
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // Verifica si el movimiento desde la posición inicial a la posición final es válido.
        return true;
    }

    public void printBoard(){
        // Imprime el estado del tablero
    }

    private void initializeBoard() {
        placePiece(new Rook(WHITE), ROW_A, COL_1);
        placePiece(new Knight(WHITE), ROW_A, COL_2);
        placePiece(new Bishop(WHITE), ROW_A, COL_3);
        placePiece(new Queen(WHITE), ROW_A, COL_4);
        placePiece(new King(WHITE), ROW_A, COL_5);
        placePiece(new Bishop(WHITE), ROW_A, COL_6);
        placePiece(new Knight(WHITE), ROW_A, COL_7);
        placePiece(new Rook(WHITE), ROW_A, COL_8);

        for (int i = 0; i < BOARD_SIZE; i++) {
            placePiece(new Pawn(WHITE), 1, i);
        }

        placePiece(new Rook(BLACK), ROW_A, COL_1);
        placePiece(new Knight(BLACK), ROW_B, COL_1);
        placePiece(new Bishop(BLACK), ROW_C, COL_1);
        placePiece(new Queen(BLACK), ROW_D, COL_1);
        placePiece(new King(BLACK), ROW_E, COL_1);
        placePiece(new Bishop(BLACK), ROW_F, COL_1);
        placePiece(new Knight(BLACK), ROW_G, COL_1);
        placePiece(new Rook(BLACK), ROW_H, COL_1);

        for (int i = 0; i < BOARD_SIZE; i++) {
            placePiece(new Pawn(BLACK), 1, i);
        }
    }

    private void placePiece(Piece piece, int row, int col) {
        board[row][col] = piece;
        piece.setPosition(row, col);
    }


}
