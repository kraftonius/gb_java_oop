package seminar5.org.example;

public class Outer {
    public Outer() {
    }

    static class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerValueMethod() {
            System.out.println(innerValue);
//            System.out.println(outerValue);
//            innerValueMethod();
//            outerValueMethod();
        }
    }

    int outerValue;

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public void outerValueMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);
//        outerValueMethod();
//        innerValueMethod();
    }

    public static void main(String[] args) {
        Inner inner = new Inner(10);
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Fly");
            }
        };
//        flyable.fly();
        System.out.println(flyable.getClass().getName());
        String s = "asjdflkaj";
//        System.out.println(s.getClass().getName());
        //outer implements Flyable
        //Outer$1 flyable = new Outer();
    }


}