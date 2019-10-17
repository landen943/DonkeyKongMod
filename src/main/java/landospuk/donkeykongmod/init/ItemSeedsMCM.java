package landospuk.donkeykongmod.init;

import landospuk.donkeykongmod.donkeykongmod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;

public class ItemSeedsMCM extends BlockNamedItem {
	
	private static final ItemGroup DonkeyKongItemGroup = donkeykongmod.DonkeyKongItemGroup;

	public ItemSeedsMCM(String name, Block crop)
	{
        super(crop, new Properties().maxStackSize(64).group(DonkeyKongItemGroup));
        this.setRegistryName(new ResourceLocation(donkeykongmod.MOD_ID, name));
    }
}
