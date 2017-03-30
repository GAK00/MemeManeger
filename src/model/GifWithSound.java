package model;

public class GifWithSound extends Gif
{

	String pathToAudio;
	public GifWithSound(int dankness, boolean mainstream, boolean good, String name, int length, String filePath, String pathToAudio)
	{
		super(dankness, mainstream, good, name, length, filePath);
	}


}
