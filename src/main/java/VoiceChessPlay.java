import javafx.application.Application;
import org.germansoto.chess.Controller.GameController;
import org.germansoto.chess.GUI.ChessBoardGUI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.germansoto.chess")
public class VoiceChessPlay {
    @Autowired
    private GameController gameController;

    public static void main(String[] args) {
        launchJavaFX(args);

        ApplicationContext context = new AnnotationConfigApplicationContext(VoiceChessPlay.class);
        VoiceChessPlay app = context.getBean(VoiceChessPlay.class);
        app.play();
    }

    public static void launchJavaFX(String[] args) {
        new Thread(() -> Application.launch(ChessBoardGUI.class, args)).start();
    }

    public void play() {
        // Llamar al método play del GameController
//        gameController.play();
    }
}



