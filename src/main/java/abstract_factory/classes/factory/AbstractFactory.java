package abstract_factory.classes.factory;

import abstract_factory.classes.color.Color;
import abstract_factory.classes.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
