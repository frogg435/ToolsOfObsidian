package blackwolf00.toolsofobdisian;

import blackwolf00.toolsofobdisian.init.ItemInit;
import blackwolf00.toolsofobdisian.util.ModCreativeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "toolsofobsidian";
    public static final String MOD_NAME = "ToolsOfObsidian";

    public Main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.ITEMS.register(bus);
        ModCreativeTabs.REGISTRY.register(bus);
        MinecraftForge.EVENT_BUS.register(this);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> Client.clientSetup(bus, MinecraftForge.EVENT_BUS));
    }
}