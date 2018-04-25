package abstract_factory.classes.factory;

import abstract_factory.classes.color.Color;
import abstract_factory.classes.shape.Circle;
import abstract_factory.classes.shape.Rectangle;
import abstract_factory.classes.shape.Shape;
import abstract_factory.classes.shape.Square;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
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

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
