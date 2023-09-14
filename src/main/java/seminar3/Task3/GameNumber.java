package seminar3.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;

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
