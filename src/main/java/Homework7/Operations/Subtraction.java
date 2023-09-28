package Homework7.Operations;

import Homework7.Data.ComplexNumber;

public class Subtraction extends Operator {

    public Subtraction() {
    }

    @Override
    public ComplexNumber calculate(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setRealPart(x.getRealPart() - y.getRealPart());
        complexNumber.setImaginaryPart(x.getImaginaryPart() - y.getImaginaryPart());
        return complexNumber;
    }
}
