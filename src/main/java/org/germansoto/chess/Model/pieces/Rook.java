package org.germansoto.chess.Model.pieces;

import org.germansoto.chess.Model.Piece;

public class Rook extends Piece {
    public Rook() {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
