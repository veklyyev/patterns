package test;

/**
 * Created by Yevhen_Veklyn on 10/22/2015.
 */
public class RealPage extends AbstractPage {



    protected RealPage(){
        //x = 999;
    }

//    @Override
//    public void thisMethodIsCommon(){
//        System.out.print("real page method" + x);
//    }

    @Override
    public void thisMethodIsReal(){
        System.out.print("real page method" + x);
    }
}
