package app;

public class AdapterMain {
	//source https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm
	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		player.play("mp3", "1.mp3");
		player.play("mp4", "2.mp4");
		player.play("vlc", "3.vlc");
		player.play("avi", "4.avi");
	}

}
