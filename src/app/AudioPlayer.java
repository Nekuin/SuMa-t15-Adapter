package app;

public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter adapter;

	@Override
	public void play(String audioType, String fileName) {
		//audioplayer can play mp3
		if(audioType.equals("mp3")) {
			System.out.println("Playing mp3: " + fileName);
			//use adapter for vlc or mp4
		} else if(audioType.equals("vlc") || audioType.equals("mp4")) {
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		} else {
			System.out.println("Audiotype " + audioType + " not supported");
		}
	}

}
