package baseball.controller;

public class GameController {

    private final String GAME_START_GUIDE = "숫자 야구 게임을 시작합니다.";

    private ComputerController computerController = new ComputerController();

    public GameController() {
        System.out.println(GAME_START_GUIDE);
    }

    public void playGame() {
        computerController.saveRandomNumbers();
    }
}
