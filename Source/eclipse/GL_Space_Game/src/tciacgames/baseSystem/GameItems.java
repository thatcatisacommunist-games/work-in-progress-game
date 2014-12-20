package tciacgames.baseSystem;

import org.newdawn.slick.opengl.Texture;

public class GameItems extends ItemCollections
{
	//Items
	Item items[];
	
	
	int itemContainerID = -1;
	String itemContainerName = "None";
	
	
	int[] id = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	String[] name = new String[] 
			{
				"Flying Dutchmen's Spear",
				"Flying Dutchmen's Sword", //Weapon 1
				"Half Broken Wand", 
				"The Slapper",
				"Extermination, Extermination.", 
				"Desctruction Matrix", 
				"Y Axis", 
				"X Axis", 
				"Z Axis", 
				"Better Wand", 
				"Half Working Helmet"
			};
	String[] tooltips = new String[] 
			{
				"And they said, the flying dutchman was awesome?!",
				"It's an upgrade... Kinda.",
				"Better than nothing i guess.",
				"YO, YO, MADDAFAKAS!",
				"Extermination, Extermination.",
				"Looks like it comes from a different universe..",
				"Extreme destruction.",
				"- Replace with player Y axis -",
				"Replace with player X Axis",
				"Whatever. you know the deal.",
				"Well, atleast it works better.",
				"Congratulations, you look ridiculous."
			};
	float[] weight = new float[]
			{
				1.0f,
				1.5f,
				0.1f,
				6.0f,
				0.0f,
				10.0f,
				1.0f,
				1.0f,
				1.0f,
				1.9f,
				0.5f
			};
	float[] baseDamage = new float[]
			{
				1.0f * 2,
				1.5f * 2,
				0.1f * 2,
				6.0f * 2,
				0.0f * 2,
				10.0f * 2,
				1.0f * 2,
				1.0f * 2,
				1.0f * 2,
				1.9f * 2,
				0.5f * 2
			};
	int[] buff = new int[]
			{
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0,
				0
			};
	float[] maxDamage = new float[]
			{
				1.0f * 4,
				1.5f * 4,
				0.1f * 4,
				6.0f * 4,
				0.0f * 4,
				10.0f * 5,
				1.0f * 4,
				1.0f * 4,
				1.0f * 3,
				1.9f * 8,
				0.5f * 6
			};
	Texture[] texture = new Texture[]
			{
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null,
				null
			};
	
	
	public GameItems(String collectionName, int collectionID)
	{
		
		
	}
	public void InitiateItems(Texture[] texture)
	{
		super.InitiateItems(id, name, tooltips, weight, baseDamage, buff, maxDamage, texture);
	}
	public void getItem(int id)
	{
		super.getItem(id);
	}
		
		
		
		
		
//		textures = new Texture[length];
//		items = new Item[length];
//		items[0] = new Item(0, "Flying Dutchmen's Spear", "And they said, the flying dutchman was awesome?!", 1.0f, textures[0]);
//		items[1] = new Item(1, "Flying Dutchmen's Sword", "It's an upgrade... Kinda.", 1.5f, textures[1]);
//		items[2] = new Item(2, "Half Broken Wand", "Better than nothing i guess.", 0.1f, textures[2]);
//		items[3] = new Item(3, "The Slapper", "YO, YO, MADDAFAKAS!", 6.0f, textures[3]);
//		items[4] = new Item(4, "Extermination, Extermination.", "Looks like it comes from a different universe..", 0.0f, textures[4]);
//		items[5] = new Item(5, "Desctruction Matrix", "Extreme destruction.", 10.0f, textures[5]);
//		items[6] = new Item(6, "Y Axis", "- Replace with player Y axis -", 1.0f, textures[6]);
//		items[7] = new Item(7, "X Axis", "Replace with player X Axis" , 1.0f, textures[7]);
//		items[8] = new Item(8, "Z Axis", "Whatever. you know the deal.", 1.0f, textures[8]);
//		items[9] = new Item(9, "Better Wand", "Well, atleast it works better.", 1.9f, textures[9]);
//		items[10] = new Item(10, "Half Working Helmet", "Congratulations, you look ridiculous.", 0.5f, textures[10]);
		
	
}
