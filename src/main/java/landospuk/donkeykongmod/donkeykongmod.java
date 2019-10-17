package landospuk.donkeykongmod;

import org.apache.logging.log4j.LogManager;
import landospuk.donkeykongmod.config.Config;
import landospuk.donkeykongmod.world.DKIslandWorldType;
import landospuk.donkeykongmod.world.OreGeneration;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("donkeykongmod")
public class donkeykongmod
{
	public static donkeykongmod instance;
	public static final String modid = "donkeykongmod";
	public static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(modid);
	public static final DonkeyKongItemGroup DonkeyKongItemGroup = new DonkeyKongItemGroup();
	public static final org.apache.logging.log4j.Logger LOGGER = null;
	public static final String MOD_ID = "donkeykongmod";
	public static final WorldType DONKEYKONG_TYPE = new DKIslandWorldType();
	
	private void setup1(final FMLCommonSetupEvent event)
	{
		OreGeneration.setupOreGeneration();
		Logger.info("Setup method registered.");
	}
	
public donkeykongmod()
	{
		instance = this;
	
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup1);
		
		Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("breffmod-client.toml").toString());
		Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("breffmod-server.toml").toString());
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event)
	{
		Logger.info("Setup method registered");
	}
}
