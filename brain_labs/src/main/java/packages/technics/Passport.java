package packages.technics;

import java.util.Date;

/**
 * Passport
 * technics - техника.
 */
public class Passport {
    private String manufacturer;
    private String model;
    private String worranty;
    private Date startDate;

    public String getWorranty() {
        return worranty;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setWorranty(String worranty) {
        this.worranty = worranty;
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

    private int series;


}
