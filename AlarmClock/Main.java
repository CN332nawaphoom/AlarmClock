package AlarmClock;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        AlarmClock alarmclock = new AlarmClock();
        Keyboard keyboard = new Keyboard();
        keyboard.attach(alarmclock);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(alarmclock::display);

        Scanner scanner = new Scanner(System.in);
        while(true){
            // System.out.print("Enter 's' or 'l' ");
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("s")){
                keyboard.shortPress();
            }else if (input.equalsIgnoreCase("l")){
                keyboard.longPress();
            }
        }
    }
}
