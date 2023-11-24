package org.germansoto.chess.Controller;

import org.germansoto.chess.Service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameController {
    @Autowired
    private IGameService iGameService;

    public GameController() {
        super();
    }

    public GameController(IGameService iGameService){
        this.iGameService = iGameService;
    }

    public void play(){
        iGameService.play();
    }
}
