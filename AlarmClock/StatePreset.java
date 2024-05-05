package AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StatePreset implements State{
    private AlarmClock alarmclock;

    public StatePreset(AlarmClock alarmclock){
        this.alarmclock = alarmclock;
    }

    @Override
    public void display() {
        setTime();
    };

    private void setTime(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Time in format(HH:MM:SS): ");
        String input = scanner.nextLine();

        LocalTime parsedTime = LocalTime.parse(input);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = parsedTime.format(formatter);
        alarmclock.setState(0, "timeset", formattedTime);
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
