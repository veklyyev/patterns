package builder.food;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 40.0f;
    }
}
