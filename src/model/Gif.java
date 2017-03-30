package model;

public abstract class Gif  extends Meme
{

	private int length;
	private String filePath;
	public Gif(int dankness, boolean mainstream, boolean good, String name, int length, String filePath)
	{
		super(dankness, mainstream, good, name);
		this.length = length;
		this.filePath = filePath;
	}

}
