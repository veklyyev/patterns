package strategy;

import strategy.operation.OperationAdd;
import strategy.operation.OperationMultiply;
import strategy.operation.OperationSubstract;

/**
 * Created by Yevhen_Veklyn on 10/25/2015.
 */
public class Client {
    public static void main(String [] args){
        Context context = new Context(new OperationAdd());
        System.out.println("Add 5 + 7: " + context.executeStrategy(5, 7) + "\n");

        context = new Context(new OperationSubstract());
        System.out.println("Add 20 - 10: " + context.executeStrategy(20, 10) + "\n");

        context = new Context(new OperationMultiply());
        System.out.println("Add 12 - 12: " + context.executeStrategy(12, 12) + "\n");
    }
}
