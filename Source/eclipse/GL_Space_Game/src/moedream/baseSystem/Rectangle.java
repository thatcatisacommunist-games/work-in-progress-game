package moedream.baseSystem;

/*
 *	Rectangle collsion system
 *  -  By Member1221 
 * 
 */

public class Rectangle 
{
	private float px,py,w,h;
	
	
	
	public Rectangle(float x, float y, float width, float height)
	{
		px = x; py = y; w = width; h = height;
	}
	
	public boolean xYIntersects(float x, float y)
	{
		if (px >= x && py >= y && w <= x && h <= y)
			return true;
		else
			return false;
	}
	
	public boolean Intersects(Rectangle collider)
	{
		if (px >= collider.X() && py >= collider.Y() && w <= collider.Height() && h <= collider.Height())
			return true;
		else
			return false;
	}
	
	public float X()
	{
		return px;
	}
	public float Y()
	{
		return py;
	}
	public float Width()
	{
		return w;
	}
	public float Height()
	{
		return h;
	}
}
