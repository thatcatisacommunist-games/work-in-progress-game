package tciacgames.baseSystem;

import org.newdawn.slick.opengl.Texture;

/**<NEWLINE>
 * 
 * @author Member1221
 * @usage Override this class. using super, where you want to use the precoded system.
 */
class ItemCollections
{
	int length = 20;
	//Items
	Item items[];
	Texture textures[];
	public void InitiateItems(int[] id, String[] name , String[] tooltips, float[] weight, float[] baseDamage, int[] buff, float[] maxDamage, Texture[] texture)
	{
		items = new Item[id.length];
		for (int i = 0; i < items.length; i++)
		{
			items[i] = new Item(id[i], name[i], tooltips[i], weight[i], baseDamage[i], buff[i], maxDamage[i], texture[i]);
		}
		
	}
	
}
