package seminar2.Task4;

public class Dog extends Animal{
    String name;

    @Override
    public void animalInfo() {
        System.out.println(
                "Пес " + super.name);

    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
