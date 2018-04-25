package bridge2;

/**
 * Created by Yevhen_Veklyn on 3/26/2017.
 */
public class Main {

    public static void main(String [] args){

        Appartment appartmentSwitch = new Appartment();
        appartmentSwitch.turnOn(new Lamp());
        appartmentSwitch.turnOn(new TV());

        Building buildingSwitch = new Building();
        buildingSwitch.turnOff(new Lamp());
        buildingSwitch.turnOff(new TV());
    }
}
