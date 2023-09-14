package seminar3.Task3;

import com.sun.jdi.ClassType;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer inputValue(String value);


    GameStatus getGameStatus();


    void writeLog(Answer answer);

}
