package tciacgames.baseSystem;

public class InventoryContainer 
{
	Item[] contents;
	int inventoryIndex;
	int lastInventoryChangeIndex = 0;
	int inventoryLength;
	float inventoryWeight;
	float inventoryMaxWeight;
	GameObject parent;

	
	public InventoryContainer(int inventorySize, float maxWeight, GameObject creator)
	{
		contents = new Item[inventorySize];
		inventoryMaxWeight = maxWeight;
		parent = creator;
	}
	
	public InventoryContainer(Item[] spawnContents, int inventorySize, float maxWeight, GameObject creator)
	{
		lastInventoryChangeIndex = 0;
		contents = new Item[inventorySize];
		for (int cnts = 0; cnts < spawnContents.length; cnts++)
		{
			contents[cnts] = spawnContents[cnts];
			lastInventoryChangeIndex++;
		}
		inventoryMaxWeight = maxWeight;
		parent = creator;
	}
	
	public boolean addItem(Item item)
	{
		//Create value that will be used for returning
		boolean returner = false;
		
		//Loop indexes in the inventory
		for (int invIndex = 0; invIndex < contents.length; invIndex++)
		{
			//Check if the spot is empty
			if (contents[invIndex] == null && contents[invIndex].ItemWeight() + inventoryWeight < inventoryMaxWeight)
			{
				//If it is, add the item to that slot. And quit the loop.
				contents[invIndex] = item;
				returner = true;
				break;
			}
			else if (contents[invIndex].ItemWeight() + inventoryWeight > inventoryMaxWeight)
			{
				//Ugh, so close. But there was missing a spot in the inventory. ;n;
				returner = false;
				break;
			}
			else if (invIndex == contents.length - 1)
			{
				//If it could not find any free spots, return false. And quit the loop.
				returner = false;
				break;
			}
		}
		//Return the value, which has been defined.
		return returner;
	}
	
	public boolean removeItem(int Index)
	{
		//Check the spot you want to remove the item from.
		if (contents[Index] != null)
		{
			//If it's not empty, remove it's item.
			contents[Index] = null;
			return true;
		}
		else
		{
			//Else, return false.
			return false;
		}
	}
	
	
	
	
	
	
}
