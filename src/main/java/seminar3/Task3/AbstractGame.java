package seminar3.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    String word;
    GameStatus gameStatus;
    List<String> log = new ArrayList<>();

    /**
     * @return
     * @apiNote предзаполняет слово компьютера
     */
    public String generateWord() {
        List<String> alphabet = generateCharList();
        Random r = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int index = r.nextInt(alphabet.size());
            result = result.concat(alphabet.get(index));
            alphabet.remove(index);
        }
        return result;
    }

    abstract List<String> generateCharList();

    public void writeLog(Answer answer) {
        String str = ("player input = " + answer.getUserInput()
                + " | cows = " + answer.getCow() + " | bulls = " + answer.getBull()
                + " | status= " + this.getGameStatus());
        this.log.add(str);
        System.out.println(str);
    }

    public void showLog() {
        System.out.println("_________");
        System.out.println("LOG");
        for (int i = 0; i < this.log.size(); i++) {
            System.out.println(this.log.get(i));
        }
        System.out.println("_________");
    }

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.word = generateWord();
        gameStatus = GameStatus.START;
        System.out.println("подсказка: " + word);
    }

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == value.charAt(i)) {
                bulls++;
                cows++;
            } else {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == value.charAt(i)) {
                        cows++;
                    }
                }
            }
        }
        if (word.length() == bulls) {
            gameStatus = GameStatus.WINNER;
        }
        if (maxTry == 0 && !gameStatus.equals(GameStatus.WINNER)) {
            gameStatus = GameStatus.LOSE;
        }
        return new Answer(value, bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }

}
