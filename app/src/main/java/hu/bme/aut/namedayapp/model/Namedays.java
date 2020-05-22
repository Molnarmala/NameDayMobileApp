package hu.bme.aut.namedayapp.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Namedays implements Serializable
{

    @SerializedName("hu")
    @Expose
    private String hu;
    private final static long serialVersionUID = 1190532075549741189L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Namedays() {
    }

    /**
     *
     * @param hu
     */
    public Namedays(String hu) {
        super();
        this.hu = hu;
    }

    public String getHu() {
        return hu;
    }

    public void setHu(String hu) {
        this.hu = hu;
    }

    public Namedays withHu(String hu) {
        this.hu = hu;
        return this;
    }

}