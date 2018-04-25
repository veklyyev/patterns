package adapter2;

/**
 * Created by Yevhen_Veklyn on 3/26/2017.
 */
public class Charger {
    SocketAdapter socketAdapter;

    public Charger(){
        socketAdapter = new SocketAdapter();
    }

    public void chargeLaptop(){
        System.out.println("charging laptop with volt " + socketAdapter.get120Volt());
    }

    public void chargePhone(){
        System.out.println("charging laptop with volt " + socketAdapter.get12Volt());
    }
}
