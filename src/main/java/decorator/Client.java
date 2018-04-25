package decorator;

import decorator.shape.Circle;
import decorator.shape.Rectangle;
import decorator.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class Client {

    public static void main(String [] args){

//        Shape circle = new Circle();
//        circle.draw();
//        System.out.print("\n");
//
//        Shape redCircle = new RedShapeDecorator(new Circle());
//        redCircle.draw();
//        System.out.print("\n");
//
//        Shape redRectangle = new RedShapeDecorator(new Rectangle());
//        redRectangle.draw();
//        System.out.print("\n");

        Shape shapeDecorator = new GreenShapeDecorator(new RedShapeDecorator(new Rectangle()));
        shapeDecorator.draw();
        int i=1;
    }
}
