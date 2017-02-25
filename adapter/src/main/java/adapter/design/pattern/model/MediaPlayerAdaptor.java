package adapter.design.pattern.model;

/**
 * @author rajesh
 * 
 * MediaPlayerAdaptor is an adaptor class for AdvancedMediaPlayer.here adaptor has adaptee via composition
 *
 */
public class MediaPlayerAdaptor {
	private AdvancedMediaPlayer advanceMediaPlayer; //using composition - AdvancedMediaPlayer is adaptee

	public MediaPlayerAdaptor() {
		this.advanceMediaPlayer = new AdvancedMediaPlayer();
	}

	public void play(String type) {
		if ("mp4".equals(type)) {
			advanceMediaPlayer.playMP4();
		}
		if ("vlc".equals(type)) {
			advanceMediaPlayer.playVLC();
		}
	}

}
