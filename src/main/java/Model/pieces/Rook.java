package Model.pieces;

import Model.Piece;

public class Rook extends Piece {
    public Rook(String white) {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
