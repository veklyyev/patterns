package builder.food;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
