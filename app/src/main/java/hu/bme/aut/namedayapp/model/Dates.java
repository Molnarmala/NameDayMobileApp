package hu.bme.aut.namedayapp.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dates implements Serializable
{

    @SerializedName("day")
    @Expose
    private int day;
    @SerializedName("month")
    @Expose
    private int month;
    private final static long serialVersionUID = -228389374073317802L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Dates() {
    }

    /**
     *
     * @param month
     * @param day
     */
    public Dates(int day, int month) {
        super();
        this.day = day;
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Dates withDay(int day) {
        this.day = day;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public Dates withMonth(int month) {
        this.month = month;
        return this;
    }

}