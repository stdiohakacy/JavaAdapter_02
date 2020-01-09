package structual.Adapter._02;

public class Client {
	public static void main(String[] args) {
		AudioPlayer audio = new AudioPlayer();
		audio.play("mp4", "song.mp4");
	}
}
