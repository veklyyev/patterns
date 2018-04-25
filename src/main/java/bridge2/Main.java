package bridge2;

/**
 * Created by Yevhen_Veklyn on 3/26/2017.
 */
public class Main {

    public static void main(String [] args){

        Appartment aptSwitch = new Appartment();
        aptSwitch.turnOn(new Lamp());
        aptSwitch.turnOn(new TV());

        Building bldSwitch = new Building();
        bldSwitch.turnOff(new Lamp());
        bldSwitch.turnOff(new TV());
    }
}
