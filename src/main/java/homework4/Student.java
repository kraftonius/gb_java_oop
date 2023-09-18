package homework4;

public class Student extends User {

    private int age;
    private int score;

    public Student(String name, int score, int age) {
        super(name);
        this.score = score;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", age=" + age +
                '}';
    }

    public Student(String name) {
        super(name);
    }
}