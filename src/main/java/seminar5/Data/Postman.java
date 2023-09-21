package seminar5.Data;

public class Postman extends User{
    private String occupation;

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Postman(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }
}
