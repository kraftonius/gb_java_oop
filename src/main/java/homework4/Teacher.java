package homework4;

public class Teacher extends User {
    private int age;
    private int studentsAverageScore;

    public Teacher(String name, int age, int studentsAverageScore) {
        super(name);
        this.age = age;
        this.studentsAverageScore = studentsAverageScore;
    }

    public Teacher(String name, int age) {
        super(name);
        this.age = age;
    }

    public Teacher(String name) {
        super(name);
    }

    public int getAge() {
        return age;
    }

    public int getStudentsAverageScore() {
        return studentsAverageScore;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudentsAverageScore(int studentsAverageScore) {
        this.studentsAverageScore = studentsAverageScore;
    }

    @Override
    public String toString() {
        return "Teacher {name = " + getName() +
                ", age= '" + age + '\'' +
                ", studentsAverageScore = " + studentsAverageScore +
                "}\n";
    }
}