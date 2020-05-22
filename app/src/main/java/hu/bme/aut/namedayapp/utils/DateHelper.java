package hu.bme.aut.namedayapp.utils;

import java.util.Calendar;
import java.util.Date;

import hu.bme.aut.namedayapp.model.Dates;

public final class DateHelper {
    public static String ConvertToMonthAndDayFormat(Dates dates)
    {
        return dates.getMonth()+ ". " + dates.getDay();
    }
}