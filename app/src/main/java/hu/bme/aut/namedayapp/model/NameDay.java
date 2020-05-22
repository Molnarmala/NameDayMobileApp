package hu.bme.aut.namedayapp.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NameDay implements Serializable
{

    @SerializedName("data")
    @Expose
    private Data data;
    private final static long serialVersionUID = -5755677185749445232L;

    /**
     * No args constructor for use in serialization
     *
     */
    public NameDay() {
    }

    /**
     *
     * @param data
     */
    public NameDay(Data data) {
        super();
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public NameDay withData(Data data) {
        this.data = data;
        return this;
    }

}