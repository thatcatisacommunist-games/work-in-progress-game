package moedream.engine;
import java.util.logging.Level;
import java.util.logging.Logger;

import moedream.engine.drawmisc.SillyStuff;
import moedream.engine.drawmisc.SimpleDraw;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;



public class GL_Game 
{
	//PROGRAM MAIN VOID.
	public static void main(String[] args)
	{
		initScr();
		initGL();
		gameLoop();
		trashRemove();
	}
	
	
	
	
	//Remove Trash.
	private static void trashRemove() 
	{
		Display.destroy();
		Logger.getLogger(GL_Game.class.getName()).log(Level.INFO, "Destroyed DISPLAY, exitting program...", "info.window");
	}

	
	//Initiate OpenGL.
	private static void initGL() 
	{
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,Display.getWidth(), 0, Display.getHeight(), 2, -1);
		glMatrixMode(GL_MODELVIEW);
		
		glClearColor(0,0,0,1);
		
		Logger.getLogger(GL_Game.class.getName()).log(Level.INFO, "Sucessfully loaded OpenGL libraries....", "info.openGL");
		
		glDisable(GL_DEPTH_TEST);
	}

	//Prepare screen.
	private static void initScr()
	{
		try
		{
			Logger.getLogger(GL_Game.class.getName()).log(Level.INFO, "Sucessfully initialized Display....", "info.window");
			Display.setDisplayMode(new DisplayMode(500,500));
			Display.setResizable(true);
			Display.create();
			Display.setTitle("Space Game WIP Stuff - Engine begginning.");
		}
		catch (LWJGLException ex)
		{
			Logger.getLogger(GL_Game.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	


	
	//The game loop.
	private static void gameLoop()
	{
		
		Logger.getAnonymousLogger().log(Level.INFO, "Gameloop started...", "info.window");
		while(!Display.isCloseRequested())
		{
			//Drawing Loop
			GameEngine.Draw();
			
			
			//Logic loop
			GameEngine.Update();
			
		}		
	}
}