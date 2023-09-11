package seminar2.Task6;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Human human = new Human();
        human.start(car);
        human.start(car);
        human.finish(car);
        human.finish(car);
        Skate skate = new Skate();
        human.start(skate);
        human.finish(skate);
    }
}
