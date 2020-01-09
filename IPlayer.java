package structual.Adapter._02;

public interface IPlayer {
	public void play(String type, String fileName);
}

class MediaAdapter implements IPlayer{
	IAdvancedPlayer advanced;
	@Override
	public void play(String type, String fileName) {
		if(type.equalsIgnoreCase("mp4")) {
			advanced = new MP4Player();
			advanced.play(fileName);
		}
		else if(type.equalsIgnoreCase("vlc")) {
			advanced = new VLCPlayer();
			advanced.play(fileName);
		}
	}
	
}

class AudioPlayer implements IPlayer{
	MediaAdapter adapter;
	@Override
	public void play(String type, String fileName) {
		if(type.equalsIgnoreCase("mp3"))
			System.out.println("Mp3 Playing " + fileName);
		else if(type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")){
			adapter = new MediaAdapter();
			adapter.play(type, fileName);
		}
	}
	
}