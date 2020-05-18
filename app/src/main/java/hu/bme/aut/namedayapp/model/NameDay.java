package hu.bme.aut.namedayapp.model;

import java.util.Calendar;

public class NameDay {

    private String name;
    private Calendar date;

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public Calendar getDate() {
        return date;
    }
    public void setDate(Calendar date) {
        this.date = date;
    }
}