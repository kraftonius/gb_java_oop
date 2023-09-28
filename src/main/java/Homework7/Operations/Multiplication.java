package Homework7.Operations;

import Homework7.Data.ComplexNumber;

public class Multiplication extends Operator {

    public Multiplication() {
    }

    @Override
    public ComplexNumber calculate(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setRealPart((x.getRealPart() * y.getRealPart()) -
                (x.getImaginaryPart() * y.getImaginaryPart()));
        complexNumber.setImaginaryPart((x.getImaginaryPart() * y.getRealPart()) +
                (x.getRealPart() * y.getImaginaryPart()));
        return complexNumber;
    }
}
