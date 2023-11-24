package org.germansoto.chess.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface IBoardService {
        boolean movePiece(int startX, int startY, int endX, int endY);

        boolean isValidMove(int startX, int startY, int endX, int endY);

        void printBoard();
}
