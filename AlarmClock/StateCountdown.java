package AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StateCountdown implements State{
    private AlarmClock alarmclock;
    private String formattedTime;
    private int time;

    public StateCountdown(AlarmClock alarmclock){
        this.alarmclock = alarmclock;
        time = 10;
    }

    // increase time by one sec using parse
    private void increaseTime() {
        LocalTime parsedTime = LocalTime.parse(formattedTime);

        parsedTime = parsedTime.plusSeconds(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        formattedTime = parsedTime.format(formatter);
    }

    @Override
    public void display() {
        // System.out.println("display");
        if(time > 0){
            increaseTime();
            System.out.println(time--);
        }else{
            increaseTime();
            alarmclock.setState(0,"timeset", formattedTime);
        }
    };

    public void setTime(String formattedtime){
        this.formattedTime = formattedtime;
    }


    @Override
    public void onLongPress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onLongPress'");
    }

    @Override
    public void onShortPress() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onShortPress'");
    }


}
