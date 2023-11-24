package org.germansoto.chess.Service.Implements;

import org.germansoto.chess.Model.Piece;
import org.germansoto.chess.Service.IBoardService;
import org.germansoto.chess.Model.pieces.*;
import org.germansoto.chess.Util.BoardConstants;
import org.germansoto.chess.Util.ColorConstants;
import org.germansoto.chess.Util.PositionConstants;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements IBoardService {
    private Piece[][] board;

    public BoardService() {
        this.board = new Piece[BoardConstants.BOARD_SIZE][BoardConstants.BOARD_SIZE];
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
        for (int row = 0; row < BoardConstants.BOARD_SIZE; row++) {
            for (int col = 0; col < BoardConstants.BOARD_SIZE; col++) {
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
        placePiece(new Rook(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_1);
        placePiece(new Knight(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_2);
        placePiece(new Bishop(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_3);
        placePiece(new Queen(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_4);
        placePiece(new King(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_5);
        placePiece(new Bishop(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_6);
        placePiece(new Knight(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_7);
        placePiece(new Rook(), ColorConstants.WHITE, PositionConstants.ROW_A, PositionConstants.COL_8);

        for (int i = 0; i < BoardConstants.BOARD_SIZE; i++) {
            placePiece(new Pawn(), ColorConstants.WHITE, PositionConstants.ROW_B, i);
        }

        placePiece(new Rook(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_1);
        placePiece(new Knight(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_2);
        placePiece(new Bishop(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_3);
        placePiece(new Queen(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_4);
        placePiece(new King(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_5);
        placePiece(new Bishop(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_6);
        placePiece(new Knight(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_7);
        placePiece(new Rook(), ColorConstants.BLACK, PositionConstants.ROW_H, PositionConstants.COL_8);

        for (int i = 0; i < BoardConstants.BOARD_SIZE; i++) {
            placePiece(new Pawn(), ColorConstants.BLACK, PositionConstants.ROW_G, i);
        }
    }

    private void placePiece(Piece piece, String color, int row, int col) {
        board[row][col] = piece;
        piece.setPosition(row, col);
        piece.setColor(color);
    }
}
