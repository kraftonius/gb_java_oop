package Homework7.Process;

import Homework7.Operations.Operator;
import Homework7.Operations.Addition;
import Homework7.Operations.Subtraction;
import Homework7.Operations.Division;
import Homework7.Operations.Multiplication;

public class OperationsFactory{

    private OperationsFactory() {
    }

    public static Operator createOperationInstance(String operationSignature) {
        return switch (operationSignature) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "*" -> new Multiplication();
            case "/"-> new Division();
            default -> throw new IllegalArgumentException("Oh, you have entered invalid operation signature: " + operationSignature);
        };
    }
}
