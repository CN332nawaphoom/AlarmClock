package AlarmClock;
public class StatePreset implements State{
    private AlarmClock alarmclock;

    public StatePreset(AlarmClock alarmclock){
        this.alarmclock = alarmclock;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    };


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
