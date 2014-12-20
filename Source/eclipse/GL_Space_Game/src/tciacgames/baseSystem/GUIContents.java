package tciacgames.baseSystem;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;

public class GUIContents 
{
	Texture texture;
	float X, Y;
	
	public void Draw() {
		// TODO Auto-generated method stub
	       Color.white.bind();
	        texture.bind(); // or GL11.glBind(texture.getTextureID());
	        if (texture == null)
	        	System.out.println("Texture bind failed.");
	        
	        
	        GL11.glBegin(GL11.GL_QUADS);
           	GL11.glTexCoord2f(0,0);
           	GL11.glVertex2f(X,Y);
           	GL11.glTexCoord2f(1,0);
           	GL11.glVertex2f(X+texture.getTextureWidth(),Y);
           	GL11.glTexCoord2f(1,1);
           	GL11.glVertex2f(X+texture.getTextureWidth(),Y+texture.getTextureHeight());
           	GL11.glTexCoord2f(0,1);
           	GL11.glVertex2f(X,Y+texture.getTextureHeight());
           GL11.glEnd();
	}
	
}
