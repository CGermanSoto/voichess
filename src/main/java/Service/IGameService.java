package Service;

import Service.Implements.BoardService;

import static Util.PositionConstants.*;
import static Util.PositionConstants.COL_1;

public interface IGameService {
    boolean processUserMove();

    void switchTurn();

    boolean isGameOver();

    String getGameResult();

    void play();
}
