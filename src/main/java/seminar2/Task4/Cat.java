package seminar2.Task4;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Cat extends Animal {
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
    }

    public void svernutsya()
    {
        System.out.println("Кот " + this.name + " свернулся");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void animalInfo() {
        System.out.println(
                "Кот " + super.name
                        + " цвета : " + color
                        + " возраста : " + age);
    }

    @Override
    public void voice() {
        System.out.println("Животное = " + name + " издало звук!");
    }

    @Override
    public void jump() {
        System.out.println("Животное = " + name + " подпрыгнуло!");
    }


}

