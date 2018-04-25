package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class Meal {
    List<Item> items = new ArrayList();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.println(item.name());
        }
    }
}
