package model;

public abstract class Meme
{
private int dankness;
private boolean mainstream;
private boolean good;
String name;
public Meme(int dankness, boolean mainstream, boolean good, String name)
{
	this.dankness = dankness;
	this.mainstream = mainstream;
	this.good = good;
	this.name = name;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public int getDankness()
{
	return dankness;
}
public void setDankness(int dankness)
{
	this.dankness = dankness;
}
public boolean isMainstream()
{
	return mainstream;
}
public void setMainstream(boolean mainstream)
{
	this.mainstream = mainstream;
}
public boolean isGood()
{
	return good;
}
public void setGood(boolean good)
{
	this.good = good;
}
}
