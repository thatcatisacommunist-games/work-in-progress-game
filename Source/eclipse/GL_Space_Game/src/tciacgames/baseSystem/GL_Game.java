package tciacgames.baseSystem;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.*;

import static org.lwjgl.opengl.GL11.*;



public class GL_Game 
{
	public static void main(String[] args)
	{
		//Initate, Game Loop.
		initScr();
		initGL();
		gameLoop();
		trashRemove();
	}
	
	
	
	
	//Remove Trash.
	private static void trashRemove() 
	{
		// Destroy screen object.
		Display.destroy();
		Logger.getLogger(GL_Game.class.getName()).log(Level.INFO, "Destroyed DISPLAY, exitting program...", "info.window");
	}

	
	//Initiate OpenGL.
	private static void initGL() 
	{
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		//Prepare projection matrix.
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,Display.getWidth(), Display.getHeight(), 0, 1, -1); //Remember to draw at 1, else it will be reversed.
		glMatrixMode(GL_MODELVIEW);
		
		//Set the color, to black.
		glClearColor(0,0,0,1);
		
		
		Logger.getLogger(GL_Game.class.getName()).log(Level.INFO, "Sucessfully loaded OpenGL libraries....", "info.openGL");
		
		
		//Disabled the depth test feature of OpenGL.
		glDisable(GL_DEPTH_TEST);
	}

	//Prepare screen.
	private static void initScr()
	{
		try
		{
			//Create the display (Window)
			Logger.getLogger(GL_Game.class.getName()).log(Level.INFO, "Sucessfully initialized Display....", "info.window");
			Display.setDisplayMode(new DisplayMode(500,500));
			Display.setResizable(true);
			
			Display.create();
			// Set the window title.
			Display.setTitle("ThatCatIsACommunistGames-SpaceGame");
		}
		catch (LWJGLException ex)
		{
			//If it fails, log an error.
			Logger.getLogger(GL_Game.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	//The game loop.
	private static void gameLoop()
	{
		GameLoops loops = new GameLoops();
		
		
		Logger.getAnonymousLogger().log(Level.INFO, "Gameloop started...", "info.window");
		while(!Display.isCloseRequested())
		{
			//Drawing Loop
			loops.Draw();
			
			
			//Logic loop
			loops.Update();
			
		}		
	}
}