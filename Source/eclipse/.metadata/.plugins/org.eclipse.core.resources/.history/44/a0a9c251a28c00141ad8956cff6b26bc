package tciacgames.gui.Addons;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.opengl.Texture;

import tciacgames.baseSystem.GUIContents;
import tciacgames.baseSystem.Rectangle;

/**<NEWLINE>
 * 
 * @author Member1221
 *
 *
 *	Clickable Raw Texture
 */

public class GUIButton extends GUIContents
{
	//Variables
	Rectangle btnSnP;
	GUIRawTexture texture;
	String text;
	boolean isButtonClicked;
	boolean mousePress;
	int mouseX, mouseY;
	Font font;
	
	//Constructor
	public GUIButton(float x, float y, float sizeX, float sizeY, String text, Font font, Texture texture)
	{
		this.text = text;
		btnSnP = new Rectangle(x, y, sizeX, sizeY);
		this.font = font;
		//TODO: Add GUIRawTexture
	}
	//Textureless Constructor
	public GUIButton(float x, float y, float sizeX, float sizeY, String text, Font font)
	{
		this.text = text;
		btnSnP = new Rectangle(x, y, sizeX, sizeY);
		this.font = font;
	}
	
	/**<NEWLINE>
	 *  OVERRIDE THIS FUNCTION!
	 */
	public void whenButtonPressed()
	{
		
		
	}
	
	public void Update()
	{
		mouseX = Mouse.getX();
		mouseY = Mouse.getY();
		if(btnSnP.xYIntersects(mouseX, mouseY))
		{
			if (Mouse.isButtonDown(1) == false)
			{
					isButtonClicked = true;
					whenButtonPressed();
			}
			
		}
	}
	
	public void Draw()
	{
		super.Draw();
		font.drawFont(btnSnP.X() / 2, btnSnP.Y() / 2, text);
	}

}
