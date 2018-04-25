package test;

/**
 * Created by Yevhen_Veklyn on 10/22/2015.
 */
public class main {

    public static void main(String [] args){
        AbstractPage page = new RealPage();
        page.thisMethodIsCommon();
        page.thisMethodIsReal();
    }
}
