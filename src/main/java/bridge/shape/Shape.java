package bridge.shape;

import bridge.drawAPI.DrawAPI;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
