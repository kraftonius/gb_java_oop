package seminar2.Task5;

public abstract class Cat extends Animal {

    public static int countCat;
    public static final int canRun = 200;
    public static final int canSwim = 0;
    public Cat(String name) {
        super(name);
        countCat++;
    }
    @Override
    public abstract void swim(int distance);
    @Override
    public abstract void run(int distance);

}
