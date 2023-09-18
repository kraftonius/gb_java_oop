package seminar4.Task2;

import seminar4.Task1.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> users);
}