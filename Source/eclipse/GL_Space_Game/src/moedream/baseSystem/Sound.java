package moedream.baseSystem;
import java.io.IOException;

import org.newdawn.slick.openal.*;
import org.newdawn.slick.util.ResourceLoader;


public class Sound {
	private Audio sound;
	
	public Sound(String file, String fileExtension)
	{
		try {
			if (fileExtension == "MP3")
				sound = AudioLoader.getAudio("MP3", ResourceLoader.getResourceAsStream(file));
			else if (fileExtension == "WAV")
				sound = AudioLoader.getAudio("WAV", ResourceLoader.getResourceAsStream(file));
			else if (fileExtension == "OGG")
				sound = AudioLoader.getAudio("OGG", ResourceLoader.getResourceAsStream(file));
			
		} 
		catch (IOException e) 
		{
				e.printStackTrace();
		}
	}
	public void swapSound(String file, String fileExtension)
	{
		try {
			if (fileExtension == "MP3")
				sound = AudioLoader.getAudio("MP3", ResourceLoader.getResourceAsStream(file));
			else if (fileExtension == "WAV")
				sound = AudioLoader.getAudio("WAV", ResourceLoader.getResourceAsStream(file));
			else if (fileExtension == "OGG")
				sound = AudioLoader.getAudio("OGG", ResourceLoader.getResourceAsStream(file));
			
		} 
		catch (IOException e) 
		{
				e.printStackTrace();
		}
	}
	
	
	public void playSoundAsDimentionalEffect(float volume, float pitch, float posX, float posY, float posZ, boolean loop)
	{
		sound.playAsSoundEffect(volume, pitch, loop, posX, posY, posZ);
	}
	public void playSoundAsMusic(float volume, float pitch, boolean loop)
	{
		sound.playAsMusic(volume, pitch, loop);
	}
}
