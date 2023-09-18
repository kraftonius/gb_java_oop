package homework4;

import java.util.Comparator;

public class TeacherComparator<T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getStudentsAverageScore() - o2.getStudentsAverageScore();
    }
}