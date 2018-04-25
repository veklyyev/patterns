package adapter.advancedPlayer;

/**
 * Created by Yevhen_Veklyn on 10/25/2015.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        //nothing
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("playing Mp4: " + filename);
    }
}
