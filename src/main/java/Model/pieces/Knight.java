package Model.pieces;

import Model.Piece;

public class Knight extends Piece {
    public Knight(String white) {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
