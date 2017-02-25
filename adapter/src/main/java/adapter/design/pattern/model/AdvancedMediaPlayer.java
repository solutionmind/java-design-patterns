package adapter.design.pattern.model;

/**
 * @author rajesh
 * 
 * AdvancedMediaPlayer is an adpatee and it could be any third party system.
 *
 */
public class AdvancedMediaPlayer {
	
	public void playMP4(){
		System.out.println("playing mp4");
	}
	
	public void playVLC(){
		System.out.println("playing vlc");
	}

}
