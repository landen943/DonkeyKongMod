package landospuk.donkeykongmod.config;

import java.io.File;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import landospuk.donkeykongmod.donkeykongmod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Config 
{
	private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SERVER;
	
	private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CLIENT;
	
	static
	{
		OregenConfig.init(SERVER_BUILDER, CLIENT_BUILDER);
		
		SERVER = SERVER_BUILDER.build();
		CLIENT = CLIENT_BUILDER.build();
	}
	
	public static void loadConfig(ForgeConfigSpec config, String path)
	{
		donkeykongmod.Logger.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		donkeykongmod.Logger.info("Built config: " + path);
		file.load();
		donkeykongmod.Logger.info("Loaded config: " + path);
		config.setConfig(file);
	}
}