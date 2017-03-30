package model;

public class CaptionedMeme extends Meme
{
	String caption;
	public CaptionedMeme(int dankness, boolean mainstream, boolean good, String name, String caption)
	{
		super(dankness, mainstream, good, name);
		this.caption = caption;
	}

}
