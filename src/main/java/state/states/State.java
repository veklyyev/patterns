package state.states;

import state.Context;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public interface State {

    void doAction(Context context);
}
