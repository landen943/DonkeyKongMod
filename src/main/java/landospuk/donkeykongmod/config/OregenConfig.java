package landospuk.donkeykongmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig
{
	public static ForgeConfigSpec.IntValue crystal_ore_chance;
	public static ForgeConfigSpec.BooleanValue generate_overworld;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		server.comment("Oregen Config");
		
		crystal_ore_chance = server
				.comment("Maximum number of ore veins of the crystal ore that can spawn in one chunk.")
				.defineInRange("oregen.crystal_ore_chance", 10, 8, 20);
		
		generate_overworld = server
				.comment("Decide if you want maggot ores to spawn in the overworld")
				.define("oregen.generate_overworld", true);
	}
}