package edu.isu.assg4.observer;

import java.util.Date;
/**
 * Class to capture subscriber preferences. Subscriber will have a composition with Subscriber
 */
public class Preferences {
    
    public enum Duration{
        HOUR,DAY,BI_WEEKLY, MONTH;
    }

    private Duration frequency;
    private Date lastupdate;

    Preferences(Duration d, Date lu){
        frequency = d;
        lastupdate = lu;
    }
    public Duration getDuration(){
        return frequency;
    }
    public Date getLastUpdate(){
        return lastupdate
    }

}
