package seminar2.Task5;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("DOG"),
                new HomeCat("HOMECAT"),
                new Tiger("TIGER")
        };
        for (Animal animal : animals) {
            animal.run(300);
            animal.swim(5);

        }

    }
}
