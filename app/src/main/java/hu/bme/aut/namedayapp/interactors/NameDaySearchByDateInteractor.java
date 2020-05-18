package hu.bme.aut.namedayapp.interactors;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import hu.bme.aut.namedayapp.model.NameDay;

//TODO: Actual call needs to be implemented
public class NameDaySearchByDateInteractor {
    public NameDaySearchByDateInteractor(){}

    public List<NameDay> getNameDayByDate(Date date){


        // Mock implementation
        ArrayList<NameDay> result = new ArrayList<NameDay>();

        NameDay exampleNameDay1 =new NameDay();
        exampleNameDay1.setName("István");
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.MONTH,9);
        cal1.add(Calendar.DAY_OF_MONTH,21);
        exampleNameDay1.setDate(cal1);

        NameDay exampleNameDay2 =new NameDay();
        exampleNameDay2.setName("István");
        Calendar cal2 = Calendar.getInstance();
        cal2.add(Calendar.MONTH,9);
        cal2.add(Calendar.DAY_OF_MONTH,21);
        exampleNameDay2.setDate(cal2);

        result.add(exampleNameDay1);
        result.add(exampleNameDay2);

        return result;
    }
}

