package hu.bme.aut.namedayapp.interactors;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import hu.bme.aut.namedayapp.model.NameDay;

//TODO: Actual call needs to be implemented
public class DefaultNameDaySearchInteractor {

    public DefaultNameDaySearchInteractor() {}

    public List<NameDay> getNameDaysToday() {
        List<NameDay> ret = new ArrayList<>();
        Calendar date = Calendar.getInstance();
        date.add(Calendar.MONTH, Calendar.MAY);
        date.add(Calendar.DAY_OF_MONTH, 22);
        NameDay julia = new NameDay();
        julia.setDate(date);
        julia.setName("Julia");
        NameDay rita = new NameDay();
        rita.setName("Rita");
        rita.setDate(date);
        ret.add(julia);
        ret.add(rita);
        return ret;
    }

    public List<NameDay> getNameDaysTomorrow() {
        List<NameDay> ret = new ArrayList<>();
        Calendar date = Calendar.getInstance();
        date.add(Calendar.MONTH, Calendar.MAY);
        date.add(Calendar.DAY_OF_MONTH, 23);
        NameDay dezso = new NameDay();
        dezso.setDate(date);
        dezso.setName("Dezső");
        ret.add(dezso);
        return ret;
    }

    public List<NameDay> getNameDaysYesterday() {
        List<NameDay> ret = new ArrayList<>();
        Calendar date = Calendar.getInstance();
        date.add(Calendar.MONTH, Calendar.MAY);
        date.add(Calendar.DAY_OF_MONTH, 21);
        NameDay konstantin = new NameDay();
        konstantin.setDate(date);
        konstantin.setName("Konstantin");
        ret.add(konstantin);
        return ret;
    }
}
