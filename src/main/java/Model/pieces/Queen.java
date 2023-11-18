package Model.pieces;

import Model.Piece;

public class Queen extends Piece {
    public Queen(String white) {
        super();
    }

    @Override
    public boolean isValidMove(int targetRow, int targetCol) {
        return false;
    }
}
