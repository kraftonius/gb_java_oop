package seminar2.Task4;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void animalInfo();

    public void voice(){
        System.out.println("Животное = " + name + " издало звук!");
    };

    public void jump(){
        System.out.println("Животное = " + name + " подпрыгнуло!");
    };

}