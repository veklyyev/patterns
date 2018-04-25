package state.states;

import state.Context;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("action started");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
