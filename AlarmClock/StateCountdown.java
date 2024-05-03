package AlarmClock;
public class StateCountdown implements State{
    private AlarmClock alarmclock;

    public StateCountdown(AlarmClock alarmclock){
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
