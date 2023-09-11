package homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        AnimaloidForm human1 = new Human("Миша");
        AnimaloidForm human2 = new Human("Маша");
        AnimaloidForm cat1 = new Cat("Буся");
        AnimaloidForm cat2 = new Cat("Бася");
        AnimaloidForm robot1 = new Robot("T-800");
        AnimaloidForm robot2 = new Robot("Дейта");

        HashMap<AnimaloidForm, Boolean> competitors = new HashMap<>();
        competitors.put(human1, true);
        competitors.put(human2, true);
        competitors.put(cat1, true);
        competitors.put(cat2, true);
        competitors.put(robot1, true);
        competitors.put(robot2, true);

        Wall wall1 = new Wall(100);
        Treadmill treadmill1 = new Treadmill(500);
        Wall wall2 = new Wall(150);
        Treadmill treadmill2 = new Treadmill(1000);
        Wall wall3 = new Wall(200);
        Treadmill treadmill3 = new Treadmill(1500);
        Wall wall4 = new Wall(250);
        Treadmill treadmill4 = new Treadmill(2000);

        ArrayList<Hurdle> hurdles = new ArrayList<>();
        hurdles.add(wall1);
        hurdles.add(treadmill1);
        hurdles.add(wall2);
        hurdles.add(treadmill2);
        hurdles.add(wall3);
        hurdles.add(treadmill3);
        hurdles.add(wall4);
        hurdles.add(treadmill4);


        for (Hurdle hurdle : hurdles) {
            System.out.println("________________________");
            System.out.println("Препятствие номер " + ((int) (hurdles.indexOf(hurdle) + 1)) + ": " + hurdle.type);
            for (Map.Entry<AnimaloidForm, Boolean> competitor : competitors.entrySet()) {
                if (competitor.getValue()) {
                    if (hurdle instanceof Wall) {
                        competitor.setValue(competitor.getKey().jump((Wall) hurdle));
                    } else if (hurdle instanceof Treadmill) {
                        competitor.setValue(competitor.getKey().run((Treadmill) hurdle));
                    } else {
                        System.out.println(competitor.getKey().name + " Прошел дальше");
                    }
                }
            }
        }
    }
}
