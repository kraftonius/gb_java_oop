package homework5.Data;

public class RationalNumber {
    private double number;

    public RationalNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Рациональное число = " + number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
