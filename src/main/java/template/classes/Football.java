package template.classes;

/**
 * Created by Yevhen_Veklyn on 10/21/2015.
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Initialize Football");
    }

    @Override
    void startPlay() {
        System.out.println("Start Football");
    }

    @Override
    void endPlay() {
        System.out.println("End Football");
    }
}
