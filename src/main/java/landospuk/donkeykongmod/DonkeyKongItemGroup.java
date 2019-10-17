package landospuk.donkeykongmod;

import landospuk.donkeykongmod.init.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class DonkeyKongItemGroup extends ItemGroup
{	
	public DonkeyKongItemGroup()
	{
		super("donkeykongmod");
	}
	
	public ItemStack createIcon()
	{
		return new ItemStack(ItemList.banana);
	}
}