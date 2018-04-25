package builder.drinks;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
