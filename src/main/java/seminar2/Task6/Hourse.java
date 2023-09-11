package seminar2.Task6;

public class Hourse implements Transport{

    @Override
    public void run() {
        System.out.println("Лошадь пошла");
    }

    @Override
    public void stop() {
        System.out.println("Лошадь остановилась");

    }
}
