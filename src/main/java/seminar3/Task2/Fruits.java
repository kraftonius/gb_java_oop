package seminar3.Task2;

public enum Fruits {
    APPLE("Яблоко"), LEMON("Арбуз"), WATERMELON("Арбуз"), CHERRY("Вишня"), PEACH("Персик");

    private String name;

    Fruits(String name) {
        this.name = name;
    }

    Fruits(){};
    public String getName() {
        return name;
    }
}
