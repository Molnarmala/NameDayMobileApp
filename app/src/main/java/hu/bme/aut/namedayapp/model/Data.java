package hu.bme.aut.namedayapp.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data implements Serializable
{

    @SerializedName("dates")
    @Expose
    private Dates dates;
    @SerializedName("namedays")
    @Expose
    private Namedays namedays;
    private final static long serialVersionUID = 8942670005763256616L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Data() {
    }

    /**
     *
     * @param dates
     * @param namedays
     */
    public Data(Dates dates, Namedays namedays) {
        super();
        this.dates = dates;
        this.namedays = namedays;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    public Data withDates(Dates dates) {
        this.dates = dates;
        return this;
    }

    public Namedays getNamedays() {
        return namedays;
    }

    public void setNamedays(Namedays namedays) {
        this.namedays = namedays;
    }

    public Data withNamedays(Namedays namedays) {
        this.namedays = namedays;
        return this;
    }

}