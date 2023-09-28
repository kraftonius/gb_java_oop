package Homework7.View;

import java.util.Scanner;

public class ConsoleInputProvider implements InputProvider {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    @Override
    public double promptDouble(String message) {
        System.out.print(message);
        return Double.parseDouble(scanner.nextLine());
    }
}