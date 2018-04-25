package test;

/**
 * Created by Yevhen_Veklyn on 10/22/2015.
 */
public abstract class AbstractPage {
    public int x = 5;

    public AbstractPage(){
        initialize();
    }

    protected void initialize(){
        System.out.print("initializing abstract");
    }

    public void thisMethodIsCommon() {
        System.out.print("common method" + x);
    }

    public abstract void thisMethodIsReal();

}