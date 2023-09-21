package seminar5.Data;

public class Human extends User{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Human(String name, String address) {
        super(name);
        this.address = address;
    }
}
