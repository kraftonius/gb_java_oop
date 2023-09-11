package seminar2.Task6;

public class Skate implements Transport{

    @Override
    public void run(){
        System.out.println("Скейт едет");
    }

    @Override
    public void stop(){
        System.out.println("Скейт стоит");
    }
}
