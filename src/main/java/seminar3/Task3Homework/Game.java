package seminar3.Task3Homework;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);


    GameStatus getGameStatus();


    void writeLog(Answer answer);

}
