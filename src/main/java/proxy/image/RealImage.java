package proxy.image;

/**
 * Created by Yevhen_Veklyn on 10/24/2015.
 */
public class RealImage implements Image {

    String filename;

    public RealImage(String name){
        this.filename = name;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying real image");
    }

    private void loadFromDisk() {
        System.out.println("Loading from disk '" + filename + "'");
    }
}
