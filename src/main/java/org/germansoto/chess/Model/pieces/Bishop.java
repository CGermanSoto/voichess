package org.germansoto.chess.Model.pieces;

import org.germansoto.chess.Model.Piece;

public class Bishop extends Piece {
    public Bishop() {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}

