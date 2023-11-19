package Controller;

import Service.IBoardService;
import Service.IGameService;
import Service.Implements.BoardService;
import Service.Implements.GameService;

public class GameController {
    private IBoardService iBoardService;
    private IGameService iGameService;

    public void play(){
        iGameService.play();
    }
}
