package tciacgames.baseSystem;
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
	
	/**<NEWLINE>
	 * Constructor for Sound
	 * @param file
	 * @param fileExtension
	 */
	public Sound(String file, String fileExtension)
	{
		try 
		{
			System.out.println("File Check: " + file + "." + fileExtension.toLowerCase());
			sound = AudioLoader.getAudio(fileExtension.toUpperCase(), ResourceLoader.getResourceAsStream(file + "." + fileExtension.toLowerCase()));
			System.out.println("RESOURCE LOADER :: Loaded Sound " + file + "." + fileExtension.toLowerCase() + "!");
		} 
		catch (IOException e) 
		{
			Logger.getAnonymousLogger().log(Level.INFO, "Could not load: " + file + "." + fileExtension, "info.window");
		}
	}
	/**<NEWLINE>
	 * swap out current sound. With a new sound.
	 * @param file
	 * @param fileExtension
	 */
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
	
	/**<NEWLINE>
	 * Stop sound
	 */
	public void stop()
	{
		sound.stop();
	}
	
	/**<NEWLINE>
	 * Play sound as a sound effect. Which uses dimentions, to define where it's played.
	 * @param volume
	 * @param pitch
	 * @param posX
	 * @param posY
	 * @param posZ
	 * @param loop
	 */
	public void playSoundAsDimentionalEffect(float volume, float pitch, float posX, float posY, float posZ, boolean loop)
	{
		this.loop = loop;
		this.pitch = pitch;
		startVolume = volume;
		x = posX; y = posY; z = posZ;
		sound.playAsSoundEffect(volume, pitch, loop, posX, posY, posZ);
	}
	/**<NEWLINE>
	 * Play sound as music. Which will keep volume, no matter position. (only 1 music object can be playing at a time)
	 * @param volume
	 * @param pitch
	 * @param loop
	 */
	public void playSoundAsMusic(float volume, float pitch, boolean loop)
	{
		sound.playAsMusic(volume, pitch, loop);
	}
}
