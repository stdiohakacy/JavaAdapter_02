package structual.Adapter._02;

public interface IAdvancedPlayer {
	public void play(String fileName);
}

class MP4Player implements IAdvancedPlayer {
	@Override
	public void play(String fileName) {
		System.out.println("MP4 Playing " + fileName);
	}

}

class VLCPlayer implements IAdvancedPlayer {
	@Override
	public void play(String fileName) {
		System.out.println("VLC Playing " + fileName);
	}

}
