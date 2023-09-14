package seminar3.Task2;

public class Main {
    public static void main(String[] args) {
        Fruits fruits1 = Fruits.CHERRY;
        switch (fruits1){
            case APPLE -> System.out.println("apple " + fruits1.getName());
            case LEMON -> System.out.println("lemon " + fruits1.getName());
            case WATERMELON -> System.out.println("watermelon " + fruits1.getName());
            case CHERRY -> System.out.println("cherry " + fruits1.getName());
            case PEACH ->  System.out.println("peach " + fruits1.getName());
            default -> System.out.println("Default");
        }
    }
}
