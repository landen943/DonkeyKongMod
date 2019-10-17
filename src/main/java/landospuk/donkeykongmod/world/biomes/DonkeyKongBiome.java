package landospuk.donkeykongmod.world.biomes;

import landospuk.donkeykongmod.ModRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class DonkeyKongBiome extends Biome 
{

	public DonkeyKongBiome()
	{
		super((new Biome.Builder())
				.surfaceBuilder(new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.GREEN_CONCRETE.getDefaultState(), Blocks.BROWN_CONCRETE.getDefaultState(), Blocks.BROWN_CONCRETE.getDefaultState())))
				.precipitation(RainType.RAIN)
				.category(Category.FOREST)
				.downfall(0.8f)
				.depth(0.1f)
				.temperature(0.5f)
				.scale(0.1f)
				.waterColor(0x42b9f5)
				.waterFogColor(0x2baced)
				.parent(null));
		
		DefaultBiomeFeatures.addFossils(this);
		
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.PANDA, 100, 2, 5));
		
		this.setRegistryName(ModRegistry.location("dk_island_biome"));
	}

}
