package tciacgames.gui.Addons;

public class GUIText 
{
	String text;
	Font font;
	float x, y;
	public GUIText(String text, Font font, float x, float y)
	{
		this.text = text;
		this.font = font;
		this.x = x;
		this.y = y;
	}
	
	public void setXY(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void Draw()
	{
		font.drawFont(x, y, text);
	}

}
