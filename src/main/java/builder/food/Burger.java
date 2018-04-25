package builder.food;

import builder.Item;
import builder.pack.Packing;
import builder.pack.Wrapper;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    public  abstract float price();
}
