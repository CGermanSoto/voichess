package org.germansoto.chess.Model.pieces;

import org.germansoto.chess.Model.Piece;

public class Knight extends Piece {
    public Knight(String imagePath) {
        super(imagePath);
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
