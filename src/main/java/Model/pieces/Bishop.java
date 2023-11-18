package Model.pieces;

import Constants.Color;
import Model.Piece;

public class Bishop extends Piece {
    public Bishop() {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}

