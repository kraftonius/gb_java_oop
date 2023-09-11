package seminar2.Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Рыжий", 21);
        cat1.setName("Барсик");
        cat1.setColor("Рыжий");
        System.out.println("cat1 = " + cat1);

        cat1.animalInfo();
        cat1.voice();
        cat1.jump();
        cat1.svernutsya();

        Animal cat2 = new Cat("Мурзик", "Серый", 2);
        ((Cat) cat2).svernutsya();

        ArrayList<Animal> animals = new ArrayList<>(Arrays.
                asList(new Cat(), new Dog()));
        for (Animal animal1: animals
             ) {
            animal1.animalInfo();
            if (animal1 instanceof Cat) {
                ((Cat) animal1).svernutsya();
            }
        }
    }
}
