package Model.pieces;

import Model.Piece;

public class Pawn extends Piece {
    public Pawn(String white) {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
