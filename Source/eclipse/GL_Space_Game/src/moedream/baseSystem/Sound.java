package moedream.baseSystem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.openal.*;
import org.newdawn.slick.util.ResourceLoader;


public class Sound {
	private Audio sound;
	float x, y, z;
	float startVolume;
	float pitch;
	boolean loop;
	
	public Sound(String file, String fileExtension)
	{
		try 
		{
			System.out.println(file + "." + fileExtension.toLowerCase());
			sound = AudioLoader.getAudio(fileExtension.toUpperCase(), ResourceLoader.getResourceAsStream(file + "." + fileExtension.toLowerCase()));
		} 
		catch (IOException e) 
		{
			Logger.getAnonymousLogger().log(Level.INFO, "Could not load: " + file + "." + fileExtension, "info.window");
		}
	}
	public void swapSound(String file, String fileExtension)
	{
		try 
		{
			sound = AudioLoader.getAudio(fileExtension, ResourceLoader.getResourceAsStream(file + "." + fileExtension));
		} 
		catch (IOException e) 
		{
			Logger.getAnonymousLogger().log(Level.INFO, "Could not load: " + file + "." + fileExtension, "info.window");
		}
	}
	
	
	public void stop()
	{
		sound.stop();
	}
	
	public void playSoundAsDimentionalEffect(float volume, float pitch, float posX, float posY, float posZ, boolean loop)
	{
		this.loop = loop;
		this.pitch = pitch;
		startVolume = volume;
		x = posX; y = posY; z = posZ;
		sound.playAsSoundEffect(volume, pitch, loop, posX, posY, posZ);
	}
	public void playSoundAsMusic(float volume, float pitch, boolean loop)
	{
		sound.playAsMusic(volume, pitch, loop);
	}
}

