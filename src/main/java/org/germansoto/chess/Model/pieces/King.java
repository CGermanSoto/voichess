package org.germansoto.chess.Model.pieces;

import org.germansoto.chess.Model.Piece;

public class King extends Piece {

    public King(String imagePath) {
        super(imagePath);
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
