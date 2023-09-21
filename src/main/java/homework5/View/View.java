package homework5.View;

import java.util.List;

public interface View {
    int getString();
    void set(String value);
    void appendLog(String log);
    void appendLog(List list);
    void showLog();
}
