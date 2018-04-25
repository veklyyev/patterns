package template;

import template.classes.Cricket;
import template.classes.Football;
import template.classes.Game;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Client {

    public static void main(String [] args){
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
