package AlarmClock;
import java.util.concurrent.TimeUnit;

public class AlarmClock implements Observer{
    // TODO Add methods
    private State[] states; // index 0 for normal, 1 for preset, 2 for countdown mode
    private State currentState;

    public AlarmClock(){
        states = new State[] {new StateNormal(this), new StatePreset(this), new StateCountdown(this)};
        this.currentState = states[0]; // start alarmclock with normal mode
    }

    public void setState(State state){
        currentState = state;
    }

    public void onLongPress(){
        System.out.println("alarm recieved: long press");
        // currentState.onLongPress();
    }

    public void onShortPress(){
        System.out.println("alarm recieved: short press");
        // currentState.onShortPress();
    }

    public void display(){
        while(true){
            currentState.display();
            try {
                TimeUnit.SECONDS.sleep(1); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("interrupted: " + e);
            }
        }
    }

    @Override
    public void update(String event){
        if(event.equalsIgnoreCase("longpress")){
            onLongPress();
        }else{
            onShortPress();
        }
    }
}
