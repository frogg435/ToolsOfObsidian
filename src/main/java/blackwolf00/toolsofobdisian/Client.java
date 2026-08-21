package blackwolf00.toolsofobdisian;

import blackwolf00.toolsofobdisian.init.ItemInit;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class Client {
    public static void clientSetup(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(Client::clientInit);
    }

    public static void clientInit(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ItemProperties.register(ItemInit.OBSIDIAN_BOW.get(), new ResourceLocation("pull"),
                    (itemStack, world, livingEntity, num) ->
                            livingEntity == null ? 0.0f
                                    : livingEntity.getUseItem() != itemStack ? 0.0f
                                    : (float) (itemStack.getUseDuration() - livingEntity.getUseItemRemainingTicks()) / 20.0f);
            ItemProperties.register(ItemInit.OBSIDIAN_BOW.get(), new ResourceLocation("pulling"),
                    (itemStack, world, livingEntity, num) ->
                            livingEntity != null && livingEntity.isUsingItem() && livingEntity.getUseItem() == itemStack
                                    ? 1.0f : 0.0f);
        });
    }
}