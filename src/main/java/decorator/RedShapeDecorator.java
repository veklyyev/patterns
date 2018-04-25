package decorator;

import decorator.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class RedShapeDecorator extends ShapeDecorator {

    RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
        super.color = "red";
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Set shape border: Red");
    }


}
