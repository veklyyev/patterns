package adapter.advancedPlayer;

/**
 * Created by Yevhen_Veklyn on 10/25/2015.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("playing Vlc: " + filename);
    }

    @Override
    public void playMp4(String filename) {
        //nothing
    }
}
