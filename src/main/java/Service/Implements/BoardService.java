package Service.Implements;

import Model.Piece;
import Model.pieces.*;
import Service.IBoardService;

import static Util.BoardConstants.BOARD_SIZE;
import static Util.ColorConstants.BLACK;
import static Util.ColorConstants.WHITE;
import static Util.PositionConstants.*;

public class BoardService implements IBoardService {
    private Piece[][] board;

    public BoardService() {
        this.board = new Piece[BOARD_SIZE][BOARD_SIZE];
        initializeBoard();
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        // Mueve la pieza de la posición inicial a la posición final si el movimiento es válido.
        Piece tipePiece = this.board[startX][startY];
        this.board[endX][endY] = tipePiece;
        this.board[startX][startY] = null;

        // Devuelve true si el movimiento fue exitoso, false si fue inválido.
        if (!isValidMove(startX, startY, endX, endY)) {
            return false;
        }

        return true;
    }

    public boolean isValidMove(int startX, int startY, int endX, int endY) {
        // Verifica si el movimiento desde la posición inicial a la posición final es válido.
        return true;
    }

    public void printBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] != null) {
                    System.out.print(" Row: " + row + " " + "Col: " + col + ": " + board[row][col].toString() );
                } else {
                    System.out.print(" Row: " + row + " " + "Col: " + col + ": " +"Empty ");
                }
            }
            System.out.println();
        }
    }


    private void initializeBoard() {
        placePiece(new Rook(), WHITE, ROW_A, COL_1);
        placePiece(new Knight(), WHITE, ROW_A, COL_2);
        placePiece(new Bishop(), WHITE, ROW_A, COL_3);
        placePiece(new Queen(), WHITE, ROW_A, COL_4);
        placePiece(new King(), WHITE, ROW_A, COL_5);
        placePiece(new Bishop(), WHITE, ROW_A, COL_6);
        placePiece(new Knight(), WHITE, ROW_A, COL_7);
        placePiece(new Rook(), WHITE, ROW_A, COL_8);

        for (int i = 0; i < BOARD_SIZE; i++) {
            placePiece(new Pawn(), WHITE, ROW_B, i);
        }

        placePiece(new Rook(), BLACK, ROW_H, COL_1);
        placePiece(new Knight(), BLACK, ROW_H, COL_2);
        placePiece(new Bishop(), BLACK, ROW_H, COL_3);
        placePiece(new Queen(), BLACK, ROW_H, COL_4);
        placePiece(new King(), BLACK, ROW_H, COL_5);
        placePiece(new Bishop(), BLACK, ROW_H, COL_6);
        placePiece(new Knight(), BLACK, ROW_H, COL_7);
        placePiece(new Rook(), BLACK, ROW_H, COL_8);

        for (int i = 0; i < BOARD_SIZE; i++) {
            placePiece(new Pawn(), BLACK, ROW_G, i);
        }
    }

    private void placePiece(Piece piece, String color, int row, int col) {
        board[row][col] = piece;
        piece.setPosition(row, col);
        piece.setColor(color);
    }
}
