package abstract_factory.classes.factory;

import abstract_factory.classes.color.Blue;
import abstract_factory.classes.color.Color;
import abstract_factory.classes.color.Green;
import abstract_factory.classes.color.Red;
import abstract_factory.classes.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorName){

        switch (colorName.toLowerCase()){
            case "green": return new Green();
            case "red": return new Red();
            case "blue": return  new Blue();
            default: throw  new RuntimeException("Not implemented");
        }
    }
}
