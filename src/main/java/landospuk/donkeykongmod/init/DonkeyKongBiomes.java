package landospuk.donkeykongmod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;

public class DonkeyKongBiomes 
{
	public static Biome dk_island_biome;
	
	public static void registerBiomes()
	{
		registerBiome(dk_island_biome, Type.RARE, Type.BEACH, Type.SANDY, Type.JUNGLE);
	}
	
	public static void registerBiome(Biome biome, Type... types)
	{
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}
}
