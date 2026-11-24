package net.captainlu.watercolorfix;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WaterColorFix.MOD_ID)
public final class WaterColorFix {
    public static final String MOD_ID = "watercolorfix";

    public WaterColorFix() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, WaterColorConfig.SPEC);
    }
}
