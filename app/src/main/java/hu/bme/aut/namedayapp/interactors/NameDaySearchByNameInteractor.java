package hu.bme.aut.namedayapp.interactors;

import hu.bme.aut.namedayapp.model.Data;
import hu.bme.aut.namedayapp.model.Dates;
import hu.bme.aut.namedayapp.model.NameDay;
import hu.bme.aut.namedayapp.model.Namedays;

//TODO: Actual call needs to be implemented
public class NameDaySearchByNameInteractor {
    public NameDaySearchByNameInteractor(){}

    public NameDay getNameDayByDate(String name){
        NameDay ret = new NameDay();
        Dates dates = new Dates();
        dates.setDay(21);
        dates.setMonth(9);
        Data data = new Data();
        data.setDates(dates);
        Namedays namedays = new Namedays();
        namedays.setHu("Máté,Mirella");
        data.setNamedays(namedays);
        ret.setData(data);
        return ret;
    }
}