package seminar3.Task3Homework;

import java.util.ArrayList;
import java.util.List;

public class RUGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            list.add(String.valueOf((char) i));
        }
        list.add("ё");
        return list;
    }
}

