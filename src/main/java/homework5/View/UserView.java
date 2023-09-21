package homework5.View;

import java.util.List;
import java.util.Scanner;

public class UserView implements View {
    public StringBuilder log = new StringBuilder();
    Scanner scanner = new Scanner(System.in);

    public int getString() {
        return scanner.nextInt();
    }

    @Override
    public void set(String value) {
        System.out.println(value);

    }

    @Override
    public void appendLog(String log) {
        this.log.append(log).append("\n");
    }

    public void appendLog(List list) {
        this.log.append(list.get(list.size() - 2).toString()).append(" ").append(list.get(list.size() - 1).toString());
    }

    @Override
    public void showLog() {
        System.out.println(this.log);
    }

}
