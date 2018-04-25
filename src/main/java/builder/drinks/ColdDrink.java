package builder.drinks;

import builder.Item;
import builder.pack.Bottle;
import builder.pack.Packing;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public abstract class ColdDrink implements Item {
    public Packing packing(){
        return new Bottle();
    }
    public abstract float price();
}
