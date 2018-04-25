package builder.drinks;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
