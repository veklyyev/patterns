package factory;

import factory.classes.shape.Shape;
import factory.classes.ShapeFactory;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Client {

    public static void main(String [] args){

        ShapeFactory shapeFactory = new ShapeFactory();
        //
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        //
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();

    }
}
