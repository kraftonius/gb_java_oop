package seminar3.Task1;

public class Calendar {

    int month = 1;
    public static final int JAN = 1;

    public static void main(String[] args) {
        Month month1 = Month.JAN;
        month1 = Month.APR;
        month1.valueOf("APR");
        System.out.println(month1.name());
        month1.setNumber(3);
        System.out.println(month1.getNumber());
    }

}
