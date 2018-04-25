package decorator;

import decorator.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class GreenShapeDecorator extends ShapeDecorator {

    GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setGreenBorder(decoratedShape);
        super.color = "green";
    }

    private void setGreenBorder(Shape decoratedShape) {
        System.out.println("Set shape border: Green");
    }


}
