package bridge2;

/**
 * Created by Yevhen_Veklyn on 3/26/2017.
 */
public class Appartment implements Switch {
    public void turnOn(Device device) {
        System.out.println("Turn on device in Appartment");
        device.on();
    }

    public void turnOff(Device device) {
        System.out.println("Turn off device in Appartment");
        device.off();
    }
}
