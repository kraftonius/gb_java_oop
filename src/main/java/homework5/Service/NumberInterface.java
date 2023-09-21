package homework5.Service;

import homework5.Data.ComplexNumber;
import homework5.Data.RationalNumber;

import java.util.List;

public interface NumberInterface {
    List<ComplexNumber> getAllComplexNumbers();

    List<RationalNumber> getAllRationalNumbers();

    void createCoupleComplexNumbers();

    void createCoupleRationalNumbers();

    ComplexNumber addition(ComplexNumber x, ComplexNumber y);

    ComplexNumber subtraction(ComplexNumber x, ComplexNumber y);

    ComplexNumber multiplication(ComplexNumber x, ComplexNumber y);

    ComplexNumber division(ComplexNumber x, ComplexNumber y);

    RationalNumber addition(RationalNumber x, RationalNumber y);

    RationalNumber subtraction(RationalNumber x, RationalNumber y);

    RationalNumber multiplication(RationalNumber x, RationalNumber y);

    RationalNumber division(RationalNumber x, RationalNumber y);


}
