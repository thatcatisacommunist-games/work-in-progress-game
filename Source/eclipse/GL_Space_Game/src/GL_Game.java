import java.util.logging.Level;
import java.util.logging.Logger;

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
	}

	
	//Initiate OpenGL.
	private static void initGL() 
	{
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,Display.getWidth(), 0, Display.getHeight(), 2, -1);
		glMatrixMode(GL_MODELVIEW);
		
		glClearColor(0,0,0,1);
		
		glDisable(GL_DEPTH_TEST);
	}

	//Prepare screen.
	private static void initScr()
	{
		try
		{
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
	
	
	private static void loopCool()
	{
		glColor3f(3.203f, 0f, 0f);
		for(int i = 50; i <= 70; i++)
			SimpleDraw.DrawCube(i, i, i);
		glColor3f(0f, 3f, 0f);
		for(int i = 10; i <= 50; i++)
			SimpleDraw.DrawCube(i, i, i);
		
	}

	
	//The game loop.
	private static void gameLoop()
	{
		while(!Display.isCloseRequested())
		{
			glClear(GL_COLOR_BUFFER_BIT);
			
			glColor3f(3.203f, 0f, 0f);
			for(int i = 1; i <= 70; i++)
				SimpleDraw.DrawCube(i, i, i);

			if(Keyboard.isKeyDown(28))
				loopCool();
			
			Display.update();
		}		
	}
}
