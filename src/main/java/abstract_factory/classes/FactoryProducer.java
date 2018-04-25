package abstract_factory.classes;

import abstract_factory.classes.factory.AbstractFactory;
import abstract_factory.classes.factory.ColorFactory;
import abstract_factory.classes.factory.ShapeFactory;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
