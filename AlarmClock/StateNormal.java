package AlarmClock;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StateNormal implements State{
    private AlarmClock alarmclock;
    private String formattedTime;

    public StateNormal(AlarmClock alarmclock){
        this.alarmclock = alarmclock;

        // get this time
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // format time
        formattedTime = currentTime.format(formatter);
    }

    // increase time by one sec using parse
    private void increaseTime() {
        LocalTime parsedTime = LocalTime.parse(formattedTime);

        parsedTime = parsedTime.plusSeconds(1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        formattedTime = parsedTime.format(formatter);
    }

    public void setTime(String formattedtime){
        this.formattedTime = formattedtime;
    }

    @Override
    public void display() {
        increaseTime();
        System.out.println(formattedTime);
    };


    @Override
    public void onLongPress() {
        alarmclock.setState(1);
    }

    @Override
    public void onShortPress() {
        alarmclock.setState(2, "timeset", formattedTime);
    }


}
