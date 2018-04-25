package proxy.image;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class ProxyImage implements Image {

    String filename;
    RealImage realImage;

    public ProxyImage(String name){
        this.filename = name;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
