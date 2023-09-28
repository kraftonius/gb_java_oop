package Homework7.App;

import Homework7.View.*;

public class Main {
    public static void main(String[] args) {
        InputProvider inputProvider = new ConsoleInputProvider();
        OutputProvider outputProvider = new ConsoleOutputProvider();
        CalcView calcView = new CalcView(inputProvider, outputProvider);
        calcView.run();
    }
}
