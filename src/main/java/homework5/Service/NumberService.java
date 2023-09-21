package homework5.Service;

import homework5.Data.ComplexNumber;
import homework5.Data.RationalNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberService implements NumberInterface {
    private List<ComplexNumber> complexNumbers;
    private List<RationalNumber> rationalNumbers;
    ;

    public NumberService() {
        this.complexNumbers = new ArrayList<>();
        this.rationalNumbers = new ArrayList<>();
    }

    @Override
    public List<ComplexNumber> getAllComplexNumbers() {
        return complexNumbers;
    }

    @Override
    public List<RationalNumber> getAllRationalNumbers() {
        return rationalNumbers;
    }

    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа");
        y = scanner.nextDouble();
        ComplexNumber complexNumber1 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber1);
        System.out.println("Введите действительную часть второго числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа");
        y = scanner.nextDouble();
        ComplexNumber complexNumber2 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber2);
    }

    @Override
    public void createCoupleRationalNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<RationalNumber> list = new ArrayList<>();
        System.out.println("Введите первое рациональное число");
        int x1 = scanner.nextInt();
        RationalNumber rationalNumber1 = new RationalNumber(x1);
        rationalNumbers.add(rationalNumber1);
        System.out.println("Введите второе рациональное число");
        int x2 = scanner.nextInt();
        RationalNumber rationalNumber2 = new RationalNumber(x2);
        rationalNumbers.add(rationalNumber2);
    }

    @Override
    public ComplexNumber addition(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setNumerator(x.getNumerator() + y.getNumerator());
        complexNumber.setImaginaryPart(x.getImaginaryPart() + y.getImaginaryPart());
        return complexNumber;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setNumerator(x.getNumerator() - y.getNumerator());
        complexNumber.setImaginaryPart(x.getImaginaryPart() - y.getImaginaryPart());
        return complexNumber;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setNumerator((x.getNumerator() * y.getNumerator()) -
                (x.getImaginaryPart() * y.getImaginaryPart()));
        complexNumber.setImaginaryPart((x.getImaginaryPart() * y.getNumerator()) +
                (x.getNumerator() * y.getImaginaryPart()));
        return complexNumber;
    }

    @Override
    public ComplexNumber division(ComplexNumber x, ComplexNumber y) {
        ComplexNumber complexNumber = new ComplexNumber(0.0, 0.0);
        complexNumber.setNumerator(((x.getNumerator() * y.getNumerator()) +
                (x.getImaginaryPart() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart() * y.getImaginaryPart())));
        complexNumber.setImaginaryPart((((x.getImaginaryPart() * y.getNumerator()) -
                (x.getNumerator() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart() * y.getImaginaryPart()))));
        return complexNumber;
    }

    @Override
    public RationalNumber addition(RationalNumber x, RationalNumber y) {
        return new RationalNumber(x.getNumber() + y.getNumber());
    }

    @Override
    public RationalNumber subtraction(RationalNumber x, RationalNumber y) {
        return new RationalNumber(x.getNumber() - y.getNumber());
    }

    @Override
    public RationalNumber multiplication(RationalNumber x, RationalNumber y) {
        return new RationalNumber(x.getNumber() * y.getNumber());
    }

    @Override
    public RationalNumber division(RationalNumber x, RationalNumber y) {
        return new RationalNumber(x.getNumber() / y.getNumber());
    }

}






























