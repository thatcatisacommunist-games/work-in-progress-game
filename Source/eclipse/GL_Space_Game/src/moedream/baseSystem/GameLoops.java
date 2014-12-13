package moedream.baseSystem;
import java.util.logging.Level;
import java.util.logging.Logger;

import moedream.baseSystem.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;


public class GameLoops 
{
	GameStates.GameState gameState = GameStates.GameState.FirstUpdate;
	Sound sound;
	
	
	//The loops which handles drawing.
	public void Draw()
	{
		glClear(GL_COLOR_BUFFER_BIT);
		
		if (gameState == GameStates.GameState.FirstUpdate)
		{
			
		}
		else if (gameState == GameStates.GameState.LoadScreen)
		{
			
		}
		else if (gameState == GameStates.GameState.MainMenu)
		{
			
		}
		else if (gameState == GameStates.GameState.GameScreen)
		{
			
		}
		else
		{
			Logger.getAnonymousLogger().log(Level.INFO, "GameState (Draw) returned an invalid value(" + gameState.toString() + ") changing to: " + GameStates.GameState.MainMenu.toString(), "info.window");
		}
		
		
		//TODO: Add code here for drawing
		
		Display.update();
	}
	
	
	private void changeState(GameStates.GameState state)
	{
		Logger.getAnonymousLogger().log(Level.INFO, "Changed the state, from: " + gameState.toString() + " to: " + state.toString(), "info.window");
		gameState = state;
	}
	
	
	//The loop which handles In-Game logic.
	public void Update()
	{
		if (gameState == GameStates.GameState.FirstUpdate)
		{
			sound = new Sound("res/credits", "WAV");
			sound.playSoundAsMusic(1.0f, 1.0f, true);
			//sound.stop();
			changeState(GameStates.GameState.LoadScreen);
		}
		else if (gameState == GameStates.GameState.Intro)
		{
			
		}
		else if (gameState == GameStates.GameState.LoadScreen)
		{
			
			//sound.playSoundAsMusic(0.5f, 1.0f, false);
			//changeState(GameStates.GameState.GameScreen);
		}
		else if (gameState == GameStates.GameState.MainMenu)
		{
			
		}
		else if (gameState == GameStates.GameState.GameScreen)
		{
			
		}
		else
		{
			Logger.getAnonymousLogger().log(Level.INFO, "GameState (Update) returned an invalid value, changing to: " + GameStates.GameState.MainMenu.toString(), "info.window");
		}
		
		
		
		
		
		//TODO: Add code here for logic
	}
}
