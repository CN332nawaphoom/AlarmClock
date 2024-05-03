package AlarmClock;

import java.util.ArrayList;
import java.util.List;

/**
 * Keyboard
 */
public class Keyboard implements Subject{
    List<Observer> alarmclocks= new ArrayList<Observer>();
    private String event;

    // TODO add methods body
    public void longPress(){
        event = "longPress";
        notifyObserver();
    }

    public void shortPress(){
        event = "shortPress";
        notifyObserver();
    }

    public void attach(Observer alarmclock){
        alarmclocks.add(alarmclock);
    }

    public void detach(Observer alarmClock){
        alarmclocks.remove(alarmClock);
    }

    public void notifyObserver(){
        for (Observer alarmclock : alarmclocks) {
            alarmclock.update(event);
        }
    }


    
}