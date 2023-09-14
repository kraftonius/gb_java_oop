package seminar3.Task3Homework;

import java.util.ArrayList;
import java.util.List;

public class GameNumber extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = '0'; i <= '9'; i++) {
            list.add(String.valueOf((char) i));
        }
        return list;
    }
}
