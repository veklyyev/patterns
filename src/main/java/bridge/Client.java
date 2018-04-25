package bridge;

import bridge.drawAPI.RedCircle;
import bridge.shape.Circle;
import bridge.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Client {

    public static void main(String [] args){
        Shape circle = new Circle(5, 6, 15, new RedCircle());
        circle.draw();
    }
}
