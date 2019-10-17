package landospuk.donkeykongmod.init;

import landospuk.donkeykongmod.donkeykongmod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class FoodList extends Item {

	public FoodList(String name, int hunger, float saturation, ItemGroup DonkeyKongItemGroup)
	{
	    super(new Properties().group(DonkeyKongItemGroup).food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
	    this.setRegistryName(new ResourceLocation(donkeykongmod.MOD_ID, name));
	}
	public static Food bananaFood = (new Food.Builder()).hunger(4).saturation(0.7f).build();
	public static Food BananaBarrelFood = (new Food.Builder()).hunger(25).saturation(1f).build();
}
