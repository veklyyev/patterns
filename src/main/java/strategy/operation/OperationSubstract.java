package strategy.operation;

/**
 * Created by Yevhen_Veklyn on 10/25/2015.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int x, int y) {
        return x - y;
    }
}
