package adapter;

import adapter.advancedPlayer.AdvancedMediaPlayer;
import adapter.advancedPlayer.Mp4Player;
import adapter.player.*;

/**
 * Created by Yevhen_Veklyn on 10/25/2015.
 */
public class Client {

    public static void main(String [] args){
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "celentano");

        AdvancedMediaPlayer advancedMediaPlayer = new Mp4Player();
        advancedMediaPlayer.playMp4("erika");

        audioPlayer.play("mp4", "muse");
    }



}
