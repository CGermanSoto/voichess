package Model.pieces;

import Constants.Color;
import Model.Piece;

public class Knight extends Piece {
    public Knight() {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
