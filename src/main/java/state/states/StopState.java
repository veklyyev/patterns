package state.states;

import state.Context;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("action stopped");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
