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
	boolean lastPress;
	String buttonName;
	
	//Constructor
	public GUIButton(float x, float y, float sizeX, float sizeY, String text, String name, Font font, Texture texture)
	{
		buttonName = name;
		this.text = text;
		btnSnP = new Rectangle(x, y, sizeX, sizeY);
		this.font = font;
		//TODO: Add GUIRawTexture
	}
	//Textureless Constructor
	public GUIButton(float x, float y, float sizeX, float sizeY, String text, String name, Font font)
	{
		buttonName = name;
		this.text = text;
		btnSnP = new Rectangle(x, y, sizeX, sizeY);
		this.font = font;
	}
	
	private void pressButton()
	{
		System.out.println(buttonName + " was pressed!, and is now returning TRUE.");
		for (int i = 0; i < 100; i++)
			isButtonClicked = true;
		System.out.println(buttonName + " is now unpressed, and is now returning FALSE.")
		isButtonClicked = false;
	}
	
	public boolean buttonPressed() {
		return isButtonClicked;
	}
	
	public void Update()
	{
		
		mouseX = Mouse.getX();
		mouseY = Mouse.getY();
		if(btnSnP.xYIntersects(mouseX, mouseY))
		{
			if (Mouse.isButtonDown(1) == false && lastPress == true)
			{
					Thread presser = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							//Press the button, for a hundred ticks.
							pressButton();
						}
						
					});
					presser.start();
			}
			
		}
		lastPress = Mouse.isButtonDown(1);
	}
	
	public void Draw()
	{
		super.Draw();
		font.drawFont(btnSnP.X() / 2, btnSnP.Y() / 2, text);
	}

}
