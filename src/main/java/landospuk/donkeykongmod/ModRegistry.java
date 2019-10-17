package landospuk.donkeykongmod;

import org.apache.logging.log4j.Logger;
import landospuk.donkeykongmod.blocks.CustomCropBlock;
import landospuk.donkeykongmod.init.BlockList;
import landospuk.donkeykongmod.init.DonkeyKongBiomes;
import landospuk.donkeykongmod.init.FoodList;
import landospuk.donkeykongmod.init.ItemList;
import landospuk.donkeykongmod.init.ItemSeedsMCM;
import landospuk.donkeykongmod.world.biomes.DonkeyKongBiome;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = donkeykongmod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModRegistry 
{
	public static final ItemGroup DonkeyKongItemGroup = donkeykongmod.DonkeyKongItemGroup;
	public static final Logger LOGGER = donkeykongmod.LOGGER;
	public static final String MODID = donkeykongmod.modid;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			ItemList.banana_barrel = new Item(new Item.Properties().food(FoodList.BananaBarrelFood).group(DonkeyKongItemGroup)).setRegistryName(location("banana_barrel")),
			ItemList.crystal_coconut_ore = new BlockItem(BlockList.crystal_coconut_ore, new Item.Properties().group(DonkeyKongItemGroup)).setRegistryName(BlockList.crystal_coconut_ore.getRegistryName()),
			ItemList.banana = new Item(new Item.Properties().food(FoodList.bananaFood).group(DonkeyKongItemGroup)).setRegistryName(location("banana")),
			ItemList.banana_seeds =  new ItemSeedsMCM("banana_seeds",  BlockList.banana_plant)
		);
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll
		(
			BlockList.crystal_coconut_ore = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f, 3.0f).lightValue(10).sound(SoundType.STONE)).setRegistryName(location("crystal_coconut_ore")),
			BlockList.banana_plant = new CustomCropBlock("banana_plant")
		);
	}
	
	@SubscribeEvent
	public static void registerBiomes(final RegistryEvent.Register<Biome> event)
	{
		event.getRegistry().registerAll
		(
			DonkeyKongBiomes.dk_island_biome = new DonkeyKongBiome()
		);
		
		DonkeyKongBiomes.registerBiomes();
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}	
