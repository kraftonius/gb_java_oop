package homework4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TeacherService teacherService1 = new TeacherService();
        teacherService1.create("Mr White",55,672);
        teacherService1.create("Mr Black",49,693);
        teacherService1.create("Mr Green",43,721);
        teacherService1.create("Mr Brown",76,733);
        teacherService1.create("Mr Red",45,715);
        teacherService1.create("Mr Pink",45,673);
        List<Teacher> teachers = teacherService1.getAll();
        System.out.println(teachers);
        System.out.println("--------------------");

        teachers.sort(new TeacherComparator<>());
        System.out.println(teachers);
        System.out.println("--------------------");

        TeacherService teacherService2 = new TeacherService();
        teacherService2.setTeachers(teachers);
        teacherService2.setTeacher(3,"newTeacher",52,677);
        System.out.println(teacherService1.getAll());
        System.out.println(teacherService2.getAll());

    }
}