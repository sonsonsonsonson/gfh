# Water Color Fix (Forge 1.20.1)

A tiny Forge mod that sets `water_color` to `16777215` (`#FFFFFF`) for only the biome IDs listed in its common config.

## Build

- Minecraft: 1.20.1
- Forge: 47.4.26
- Java: 17
- Open the project in IntelliJ IDEA or Eclipse with the ForgeGradle plugin, or run `gradle build` from this folder after installing Gradle 8.x and Java 17.
- The compiled mod jar will be in `build/libs/`.

## Configure

Launch once to generate `config/watercolorfix-common.toml`, then edit its `biomes` list. It is empty by default. Example:

```toml
[water_color]
biomes = ["minecraft:ocean", "minecraft:deep_ocean", "minecraft:river"]
```

Use full registry IDs. Modded examples look like `biomesoplenty:some_biome` or `regions_unexplored:some_biome`.

Only the `water_color` value is changed. Water fog color, biome climate, generation, and all unlisted biomes are left alone. Restart/reload the world after editing the list.
