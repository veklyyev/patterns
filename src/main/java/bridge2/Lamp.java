package bridge2;

/**
 * Created by Yevhen_Veklyn on 3/26/2017.
 */
public class Lamp implements Device {
    public void on() {
        System.out.print("Lamp  ON");
    }

    public void off() {
        System.out.print("Lamp off");
    }
}
