package Service;

public interface IBoardService {
        boolean movePiece(int startX, int startY, int endX, int endY);

        boolean isValidMove(int startX, int startY, int endX, int endY);

        void printBoard();
}
