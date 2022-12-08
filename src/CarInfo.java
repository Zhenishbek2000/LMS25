public class CarInfo {
    private int yearOfIssue;
    private String model;
    private long price;
    private String colour;

    public CarInfo(int yearOfIssue, String model, long price, String colour) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public CarInfo() {

    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}

