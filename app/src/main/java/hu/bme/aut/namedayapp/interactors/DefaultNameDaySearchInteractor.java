package hu.bme.aut.namedayapp.interactors;

import hu.bme.aut.namedayapp.model.Data;
import hu.bme.aut.namedayapp.model.Dates;
import hu.bme.aut.namedayapp.model.NameDay;
import hu.bme.aut.namedayapp.model.Namedays;

//TODO: Actual call needs to be implemented
public class DefaultNameDaySearchInteractor {

    public DefaultNameDaySearchInteractor() {}

    public NameDay getNameDaysToday() {
        NameDay ret = new NameDay();
        Dates dates = new Dates();
        dates.setDay(22);
        dates.setMonth(5);
        Data data = new Data();
        data.setDates(dates);
        Namedays namedays = new Namedays();
        namedays.setHu("Julia,Rita");
        data.setNamedays(namedays);
        ret.setData(data);
        return ret;
    }

    public NameDay getNameDaysTomorrow() {
        NameDay ret = new NameDay();
        Dates dates = new Dates();
        dates.setDay(23);
        dates.setMonth(5);
        Data data = new Data();
        data.setDates(dates);
        Namedays namedays = new Namedays();
        namedays.setHu("Dezso");
        data.setNamedays(namedays);
        ret.setData(data);
        return ret;
    }

    public NameDay getNameDaysYesterday() {
        NameDay ret = new NameDay();
        Dates dates = new Dates();
        dates.setDay(21);
        dates.setMonth(5);
        Data data = new Data();
        data.setDates(dates);
        Namedays namedays = new Namedays();
        namedays.setHu("Konstantin");
        data.setNamedays(namedays);
        ret.setData(data);
        return ret;
    }
}
