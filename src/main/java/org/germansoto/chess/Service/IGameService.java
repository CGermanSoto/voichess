package org.germansoto.chess.Service;
import org.springframework.stereotype.Service;


public interface IGameService {
    boolean processUserMove();

    void switchTurn();

    boolean isGameOver();

    String getGameResult();

    void play();
}
