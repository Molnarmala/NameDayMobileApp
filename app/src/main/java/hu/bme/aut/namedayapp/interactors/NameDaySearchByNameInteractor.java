package hu.bme.aut.namedayapp.interactors;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import hu.bme.aut.namedayapp.model.NameDay;

//TODO: Actual call needs to be implemented
public class NameDaySearchByNameInteractor {
    public NameDaySearchByNameInteractor(){}

    public List<NameDay> getNameDayByDate(String name){


        // Mock implementation
        ArrayList<NameDay> result = new ArrayList<NameDay>();

        NameDay exampleNameDay1 = new NameDay();
        exampleNameDay1.setName("Máté");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2020);
        cal1.set(Calendar.MONTH, Calendar.AUGUST);
        cal1.set(Calendar.DAY_OF_MONTH, 20);
        exampleNameDay1.setDate(cal1);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2020);
        cal2.set(Calendar.MONTH, Calendar.OCTOBER);
        cal2.set(Calendar.DAY_OF_MONTH, 11);
        NameDay exampleNameDay2 = new NameDay();
        exampleNameDay2.setName("Mirella");
        exampleNameDay2.setDate(cal2);

        result.add(exampleNameDay1);
        result.add(exampleNameDay2);

        return result;
    }
}