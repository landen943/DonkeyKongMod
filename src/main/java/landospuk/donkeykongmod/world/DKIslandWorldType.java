package landospuk.donkeykongmod.world;

import landospuk.donkeykongmod.init.DonkeyKongBiomes;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.SingleBiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public class DKIslandWorldType extends WorldType 
{
	public DKIslandWorldType() 
	{
		super("dk_island_type");
	}
	
	@Override
	public ChunkGenerator<?> createChunkGenerator(World world) 
	{
		OverworldGenSettings settings = new OverworldGenSettings();
		SingleBiomeProviderSettings single = new SingleBiomeProviderSettings();
		single.setBiome(DonkeyKongBiomes.dk_island_biome);
		return new OverworldChunkGenerator(world, new SingleBiomeProvider(single), settings);
	}
}
