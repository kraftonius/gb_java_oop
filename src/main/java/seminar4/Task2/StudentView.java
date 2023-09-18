package seminar4.Task2;

import seminar4.Task1.Student;

import java.util.List;

public class StudentView<T extends Student> implements UserView<T> {

    public void sendOnConsole(List<T> students) {
        for(T user: students){
            System.out.println(user);
        }
    }



}