package AlarmClock;
public class StateNormal implements State{
    private AlarmClock alarmclock;

    public StateNormal(AlarmClock alarmclock){
        this.alarmclock = alarmclock;
    }

    @Override
    public void display() {
        System.out.println("time counted");
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
