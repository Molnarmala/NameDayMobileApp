package hu.bme.aut.namedayapp.utils;

import java.util.Calendar;
import java.util.Date;

public final class DateHelper {
    public static final String ConvertToMonthAndDayFormat(Calendar calendar)
    {
        return calendar.get(Calendar.MONTH)+ ". " + calendar.get(Calendar.DAY_OF_MONTH);
    }
}