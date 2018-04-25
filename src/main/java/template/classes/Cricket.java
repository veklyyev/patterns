package template.classes;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Initialize Cricket");
    }

    @Override
    void startPlay() {
        System.out.println("Start Cricket");
    }

    @Override
    void endPlay() {
        System.out.println("End Cricket");
    }
}
