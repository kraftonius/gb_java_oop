package seminar6.Task1;

public class ElectroBook extends Book{

    private int weight;
    private FormatElectronBook format;

    public ElectroBook(String name, String address, Genre genre, FormatElectronBook format) {
        super(name, address, genre);
        this.format = format;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public FormatElectronBook getFormat() {
        return format;
    }

    public void setFormat(FormatElectronBook format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "ElectroBook{" +
                "weight=" + weight +
                ", format=" + format +
                '}';
    }

}

