package abstract_factory;

import abstract_factory.classes.FactoryProducer;
import abstract_factory.classes.color.Color;
import abstract_factory.classes.factory.AbstractFactory;
import abstract_factory.classes.shape.Shape;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Client {

    public static void main(String [] args){

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

    }
}
