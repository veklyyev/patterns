package test;

/**
 * Created by Yevhen_Veklyn on 10/22/2015.
 */
public class Main {

    public static void main(String [] args){
        AbstractPage page = new RealPage();
        page.thisMethodIsCommon();
        page.thisMethodIsReal();
    }
}
