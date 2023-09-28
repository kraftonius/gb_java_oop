package Homework7.Operations;

import Homework7.Data.ComplexNumber;

public class Division extends Operator {

    public Division() {
    }

    @Override
    public ComplexNumber calculate(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setRealPart(((x.getRealPart() * y.getRealPart()) +
                (x.getImaginaryPart() * y.getImaginaryPart())) /
                ((y.getRealPart() * y.getRealPart()) + (y.getImaginaryPart() * y.getImaginaryPart())));
        complexNumber.setImaginaryPart((((x.getImaginaryPart() * y.getRealPart()) -
                (x.getRealPart() * y.getImaginaryPart())) /
                ((y.getRealPart() * y.getRealPart()) + (y.getImaginaryPart() * y.getImaginaryPart()))));
        return complexNumber;
    }
}