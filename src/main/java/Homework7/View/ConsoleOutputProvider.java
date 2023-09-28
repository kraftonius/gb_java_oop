package Homework7.View;

public class ConsoleOutputProvider implements OutputProvider{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
