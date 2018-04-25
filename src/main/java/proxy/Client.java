package proxy;

import proxy.image.Image;
import proxy.image.ProxyImage;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class Client {
    public static void main(String [] args){
        Image image = new ProxyImage("anything.jpg");
        image.display();
        System.out.print("\n");
        image.display();
    }
}
