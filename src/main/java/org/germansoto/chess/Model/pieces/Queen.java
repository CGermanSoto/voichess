package org.germansoto.chess.Model.pieces;

import org.germansoto.chess.Model.Piece;

public class Queen extends Piece {
    public Queen(String imagePath) {
        super(imagePath);
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
