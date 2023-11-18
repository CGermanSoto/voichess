package Model.pieces;

import Constants.Color;
import Model.Piece;

public class Pawn extends Piece {
    public Pawn() {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
