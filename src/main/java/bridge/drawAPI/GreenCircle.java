package bridge.drawAPI;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
