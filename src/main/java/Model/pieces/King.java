package Model.pieces;

import Model.Piece;

public class King extends Piece {
    public King(String white) {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
