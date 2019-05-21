package packages.transport;

/**
 * Passport
 * transport - транспорт.
 */

public class Passport {
    private String manufacturer;
    private String model;
    private int series;
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    private int yearOfIssue;

    @Override
    public String toString() {
        return "Passport{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", series=" + series +
                ", ownerName='" + ownerName + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';


    }
}
