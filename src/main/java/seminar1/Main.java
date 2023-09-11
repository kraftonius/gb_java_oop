package seminar1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "Рыжий", 21);
        cat1.setName("Барсик");
        cat1.setColor("Рыжий");
        System.out.println("cat1 = " + cat1);


        Vector vector1 = new Vector(1, 0, 1);
        Vector vector2 = new Vector(2, 0, 2);
        System.out.println(vector1.length());
        System.out.println(vector1.scal(vector2));
        System.out.println(vector1.vprod(vector2));

        vector1.angle(vector2);
        Animal animal = new Animal();
        animal.animalInfo();
        animal.voice();
        animal.jump();

    }
}
