import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;


public class SimpleDraw {
	public static void DrawCube(int x, int y, int size)
	{
		glBegin(GL_QUADS);
		{
			glVertex2f(x,y);
			glVertex2f(x, y + size);
			glVertex2f(x + size, y + size);
			glVertex2f(x + size,y);
		}
		glEnd();
	
	}
}
