package adapter.design.pattern.model;

public class MP3MediaPlayer {

	private MediaPlayerAdaptor mediaPlayerAdaptor; //using composition

	public MP3MediaPlayer() {
		mediaPlayerAdaptor = new MediaPlayerAdaptor();
	}

	public void play(String type) {
		if (type.equals("mp3")) {
			System.out.println("playing mp3"); // basic inbuilt feature
		} else {
			mediaPlayerAdaptor.play(type); // getting advanced feature from adaptor
		}
	}

}
