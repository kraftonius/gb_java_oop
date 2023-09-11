package seminar2.Task6;

public class Bycicle implements Transport{

    @Override
    public void run(){
        System.out.println("Велосипед едет");
    }

    @Override
    public void stop(){
        System.out.println("Велосипед стоит");
    }
}
