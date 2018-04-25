package state;

import state.states.StartState;
import state.states.StopState;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Client {

    public static void main(String [] args){
        //remembers the state
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());


        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState());

    }
}
