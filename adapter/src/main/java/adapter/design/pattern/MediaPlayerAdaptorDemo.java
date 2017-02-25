package adapter.design.pattern;

import adapter.design.pattern.model.MP3MediaPlayer;

/**
 * @author rajesh
 * 
 * Convert the interface of a class into another interface clients expect. 
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 *
 */
public class MediaPlayerAdaptorDemo {

	public static void main(String[] args) {
		MP3MediaPlayer mp3Player = new MP3MediaPlayer();
		mp3Player.play("mp3"); // inbuilt feature
		mp3Player.play("mp4"); //advanced feature
		mp3Player.play("vlc"); //advanced feature
	}

}
