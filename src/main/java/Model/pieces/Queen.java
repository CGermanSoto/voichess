package Model.pieces;

import Constants.Color;
import Model.Piece;

public class Queen extends Piece {
    public Queen() {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
