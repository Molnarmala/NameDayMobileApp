package hu.bme.aut.namedayapp.interactors;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import hu.bme.aut.namedayapp.model.Data;
import hu.bme.aut.namedayapp.model.Dates;
import hu.bme.aut.namedayapp.model.NameDay;
import hu.bme.aut.namedayapp.model.Namedays;

//TODO: Actual call needs to be implemented
public class NameDaySearchByDateInteractor {
    public NameDaySearchByDateInteractor(){}

    public NameDay getNameDayByDate(Date date){
        // Mock implementation
            NameDay ret = new NameDay();
            Dates dates = new Dates();
            dates.setDay(11);
            dates.setMonth(9);
            Data data = new Data();
            data.setDates(dates);
            Namedays namedays = new Namedays();
            namedays.setHu("István");
            data.setNamedays(namedays);
            ret.setData(data);
            return ret;
    }
}

