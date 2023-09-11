package seminar2.Task5;

public class Dog extends Animal {

    public static int countDog;
    public static final int canRun = 500;
    public static final int canSwim = 100;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    public void swim(int distance) {
        if (distance > canSwim){
            System.out.println(name + " не проплыл");
        } else {
            System.out.println(name + " проплыл " + distance);
        }
    }

    @Override
    public void run(int distance) {
        if (distance > canRun){
            System.out.println(name + " не пробежал");
        } else {
            System.out.println(name + " пробежал " + distance);
        }

    }
}
