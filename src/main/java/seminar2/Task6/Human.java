package seminar2.Task6;

public class Human {
    private Transport currentTransport;

    public void start(Transport transport) {
        if (currentTransport == null) {
            transport.run();
            currentTransport = transport;
        } else {
            System.out.println("уже передвигаемся");
        }
    }

    public void finish(Transport transport) {
        if (currentTransport != null) {
            transport.stop();
            currentTransport = null;
        } else {
            System.out.println("уже стоим");
        }
    }
}