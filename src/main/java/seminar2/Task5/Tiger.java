package seminar2.Task5;

public class Tiger extends Cat{
    public static int countTiger;
    public static final int canRun = 500;
    public static final int canTigerSwim = 100;


    public Tiger(String name) {
        super(name);
    }

    @Override
    public void swim(int distance) {
        if (distance > canTigerSwim){
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
