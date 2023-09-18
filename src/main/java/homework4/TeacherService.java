package homework4;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age, int studentsAverageScore) {
        Teacher teacher = new Teacher(name, age, studentsAverageScore);
        teachers.add(teacher);
    }
    public void setTeacher(int index,String name,int age,int studentsAverageScore){
        teachers.set(index,new Teacher(name, age, studentsAverageScore));
    }
}