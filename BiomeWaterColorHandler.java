package net.captainlu.watercolorfix;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Mod.EventBusSubscriber(modid = WaterColorFix.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class BiomeWaterColorHandler {
    private static final int WHITE = 16777215;

    @SubscribeEvent(priority = EventPriority.LOW)
    public static void onBiomeLoading(BiomeLoadingEvent event) {
        ResourceLocation biomeId = event.getName();
        if (biomeId == null) return;

        Set<String> configured = new HashSet<>();
        for (String entry : WaterColorConfig.BIOMES.get()) {
            if (entry != null) configured.add(entry.trim().toLowerCase(Locale.ROOT));
        }

        if (configured.contains(biomeId.toString().toLowerCase(Locale.ROOT))) {
            event.getSpecialEffects().setWaterColor(WHITE);
        }
    }

    private BiomeWaterColorHandler() {}
}
