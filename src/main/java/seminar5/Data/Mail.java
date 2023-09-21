package seminar5.Data;

public class Mail {
    private Human to;
    private Postman from;
    private String address;
    private String data;

    public Mail(Human to, Postman from, String address, String data) {
        this.to = to;
        this.from = from;
        this.address = address;
        this.data = data;
    }
    public Mail(){

    }

    public Mail generateNewMail(){
        return new Mail(new Human("Vasya","Lenena5"),
                new Postman("fsfasdf","Boss"),
                "adress",
                "aldkjflasjdlfjaslfj");
    }
}
