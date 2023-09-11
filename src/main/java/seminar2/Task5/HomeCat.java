package seminar2.Task5;

import seminar2.Task5.Cat;
public class HomeCat extends Cat{
    public static int countHomeCat;

    public HomeCat(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты не плавают");
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
