package builder;

import builder.drinks.Coke;
import builder.drinks.ColdDrink;
import builder.drinks.Pepsi;
import builder.food.Burger;
import builder.food.ChickenBurger;
import builder.food.VegBurger;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Burger burger = new VegBurger();
        ColdDrink drink = new Pepsi();
        Meal meal = new Meal();
        meal.addItem(burger);
        meal.addItem(drink);
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Burger burger = new ChickenBurger();
        ColdDrink drink = new Coke();
        Meal meal = new Meal();
        meal.addItem(burger);
        meal.addItem(drink);
        return meal;
    }
}
