package moedream.engine;
import java.util.logging.Level;
import java.util.logging.Logger;

import moedream.engine.drawmisc.SimpleDraw;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class GameEngine 
{
	//The loops which handles drawing.
	public static void Draw()
	{
		glClear(GL_COLOR_BUFFER_BIT);
		
		//TODO: Add code here for drawing
		
		Display.update();
	}
	//The loop which handles ingame logic.
	public static void Update()
	{
		
		
		//TODO: Add code here for logic
	}
}
