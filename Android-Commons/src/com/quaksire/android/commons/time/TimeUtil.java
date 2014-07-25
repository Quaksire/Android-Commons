package com.quaksire.android.commons.time;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author julio
 */
public class TimeUtil {
    
    private static final long SECOND = 1000;
    private static final long MINUTE = SECOND * 60;
    private static final long HOUR = MINUTE * 60;
    private static final long DAY = HOUR * 24;
    
    /**
     * @return day in milliseconds 
     */
    public static long dayInMilliseconds() {
        return DAY;
    }

    /**
     * @return hour in milliseconds
     */
    public static long hourInMilliseconds() {
        return HOUR;
    }
    
    /**
     * @return minute in milliseconds
     */
    public static long minuteInMilliseconds() {
        return MINUTE;
    }
    
    /**
     * Translate milliseconds to Fri, Sat, Sun, ...
     * @param time 
     * @return short name
     */
    public static String getShortDayName(long time){
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault());
    }
    
    /**
     * Translate milliseconds to Friday, Saturday, Sunday, ...
     * @param time 
     * @return long name
     */
    public static String getLongDayName(long time){
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(time);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
    }
    
    /**
     * Convert time in milliseconds to time ago, example: 1h, 2d, 3s
     * @param time
     * @return String with the representation of time ago,
     */
    public static String toAgo(long time){
        long now = System.currentTimeMillis();
        now = now - time;
        
        String result;
        if ((now / DAY) > 0) {
            //Return Days
            long ago = now / DAY;
            result = ago + "d";
        } else if ((now / HOUR) > 0) {
            //Return hour
            long ago = now / HOUR;
            result = ago + "h";
        } else if ((now / MINUTE) > 0) {
            //Return minute
            long ago = now / MINUTE;
            result = ago + "m";
        } else {
            //Return seconds
            long ago = now / SECOND;
            result = ago + "s";
        }
        
        if(result.startsWith("-")){
            result = "";
        }
        
        return result;
    }
    
}
