package decorator;

import decorator.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;
    protected String color;

    ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
