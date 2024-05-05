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

    public void setState(int stateIndex){
        try{
            currentState = states[stateIndex];
        }catch(IndexOutOfBoundsException e){
            System.out.println("index out of bounds: " + e);
        }
        
    }

    public void setState(int stateIndex, String action, String args){
        if(stateIndex == 0 && action.equalsIgnoreCase("timeset")){
            State state = states[0];
            StateNormal stateNormal = (StateNormal) state;   
            stateNormal.setTime(args);
            setState(0);
        }else if (stateIndex == 2 && action.equalsIgnoreCase("timeset")){
            State state = states[2];
            StateCountdown stateCountdown = (StateCountdown) state;
            stateCountdown.setTime(args);
            setState(2);
        }
    }

    public void onLongPress(){
        // System.out.println("alarm recieved: long press");
        currentState.onLongPress();
    }

    public void onShortPress(){
        // System.out.println("alarm recieved: short press");
        currentState.onShortPress();
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
