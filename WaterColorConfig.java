package net.captainlu.watercolorfix;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.List;

public final class WaterColorConfig {
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> BIOMES;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
        builder.push("water_color");
        BIOMES = builder
                .comment("Biome registry IDs whose water color should be set to white (16777215 / #FFFFFF).",
                         "Examples: minecraft:ocean, minecraft:river, biomesoplenty:some_biome")
                .defineListAllowEmpty("biomes", List.of(), value -> value instanceof String);
        builder.pop();
        SPEC = builder.build();
    }

    private WaterColorConfig() {}
}
