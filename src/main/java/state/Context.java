package state;

import state.states.State;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
