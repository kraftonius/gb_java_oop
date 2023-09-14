package seminar3.Task3Homework;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AbstractGame game = new ENGame();
        game.start(5, 5);
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            while (!game.getGameStatus().equals(GameStatus.WINNER) && !game.getGameStatus().equals(GameStatus.LOSE)) {
                System.out.print("enter your word: ");
                String scannerWord = scanner.nextLine();
                Answer answer = game.inputValue(scannerWord);
                game.writeLog(answer);
            }

            System.out.print(" 1 >> show Log and exit, other will exit: ");
            String scannerWord2 = scanner.nextLine();

            if (Objects.equals(scannerWord2, "1")){
                game.showLog();
            }
            flag = false;
        }
    }
}
