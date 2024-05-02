package AlarmClock;

/**
 * State
 */
public interface State {
    public void display();

    public void onLongPress();

    public void onShortPress();

}