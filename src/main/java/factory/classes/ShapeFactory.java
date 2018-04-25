package factory.classes;

import factory.classes.shape.Circle;
import factory.classes.shape.Rectangle;
import factory.classes.shape.Shape;
import factory.classes.shape.Square;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
