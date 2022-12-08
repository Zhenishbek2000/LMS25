import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;

public class CarInfo {
    private Year year;
    private String model;
    private BigDecimal price;
    private String colour;

    public CarInfo(Year year, String model, BigDecimal price, String colour) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}

