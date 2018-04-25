package strategy;

import strategy.operation.Strategy;

/**
 * Created by Yevhen_Veklyn on 10/25/2015.
 */
public class Context {
    private Strategy strategy;

    public  Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y){
        return strategy.doOperation(x, y);
    }
}
