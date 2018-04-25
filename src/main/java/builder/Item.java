package builder;

import builder.pack.Packing;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
