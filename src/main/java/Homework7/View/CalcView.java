package Homework7.View;


import Homework7.Operations.Operator;
import Homework7.Process.OperationsFactory;
import Homework7.Data.ComplexNumber;

public class CalcView {

    public ComplexNumber answer = null;
    private final InputProvider inputProvider;
    private final OutputProvider outputProvider;

    public CalcView(InputProvider inputProvider, OutputProvider outputProvider) {
        this.inputProvider = inputProvider;
        this.outputProvider = outputProvider;
    }

    public void run() {
        String calcMode = "1";
        ComplexNumber complexNumber1 = null;
        ComplexNumber complexNumber2 = null;
        while (!calcMode.equals("0")) {

            if (calcMode.equals("1")) {
                double primaryRealPart = inputProvider.promptDouble("Введите действительную часть первого числа: ");
                double primaryImaginaryPart = inputProvider.promptDouble("Введите мнимую часть первого числа: ");
                complexNumber1 = new ComplexNumber(primaryRealPart, primaryImaginaryPart);
            } else {
                complexNumber1 = this.answer;
            }

            String operationSignature = inputProvider.prompt("Введите доступный оператор вычисления [+, -, *, /]: ");
            Operator operation = OperationsFactory.createOperationInstance(operationSignature);

            double secondaryRealPart = inputProvider.promptDouble("Введите действительную часть второго числа: ");
            double secondaryImaginaryPart = inputProvider.promptDouble("Введите мнимую часть второго числа: ");
            complexNumber2 = new ComplexNumber(secondaryRealPart, secondaryImaginaryPart);

            this.answer = operation.calculate(complexNumber1, complexNumber2);
            System.out.println(("Ответ: " + this.answer));


            String cmd = inputProvider.prompt("Выход: 0, Новые числа: 1, Работать с ответом: 2: ");
            switch (cmd) {
                case "0" -> calcMode = "0";
                case "1" -> calcMode = "1";
                case "2" -> calcMode = "2";
                default -> throw new IllegalArgumentException("Wrong Calculator mode value: " + cmd);
            }
        }
    }
}
