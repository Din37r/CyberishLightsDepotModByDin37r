package net.din37r.cyberishlightsdepot.block;

import net.din37r.cyberishlights.block.NeonLantern;
import net.din37r.cyberishlightsdepot.CyberishLightsDepot;
import net.din37r.cyberishlightsdepot.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CyberishLightsDepot.MOD_ID);

    //Blocks here
    public static final RegistryObject<Block> MAROON_NEON_LANTERN = registerBlock("maroon_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> ROSE_NEON_LANTERN = registerBlock("rose_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> CORAL_NEON_LANTERN = registerBlock("coral_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.RAW_IRON)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> INDIGO_NEON_LANTERN = registerBlock("indigo_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> NAVY_NEON_LANTERN = registerBlock("navy_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> SLATE_NEON_LANTERN = registerBlock("slate_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WARPED_NYLIUM)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> OLIVE_NEON_LANTERN = registerBlock("olive_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> AMBER_NEON_LANTERN = registerBlock("amber_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WOOD)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> BEIGE_NEON_LANTERN = registerBlock("beige_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SAND)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> TEAL_NEON_LANTERN = registerBlock("teal_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> MINT_NEON_LANTERN = registerBlock("mint_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.WARPED_WART_BLOCK)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> AQUA_NEON_LANTERN = registerBlock("aqua_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIAMOND)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> VERDANT_NEON_LANTERN = registerBlock("verdant_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> FOREST_NEON_LANTERN = registerBlock("forest_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.EMERALD)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> GINGER_NEON_LANTERN = registerBlock("ginger_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> TAN_NEON_LANTERN = registerBlock("tan_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.DIRT)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final RegistryObject<Block> MAROON_NEON_LAMP = registerBlock("maroon_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.CRIMSON_HYPHAE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> ROSE_NEON_LAMP = registerBlock("rose_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> CORAL_NEON_LAMP = registerBlock("coral_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.RAW_IRON)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> INDIGO_NEON_LAMP = registerBlock("indigo_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> NAVY_NEON_LAMP = registerBlock("navy_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> SLATE_NEON_LAMP = registerBlock("slate_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.WARPED_NYLIUM)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> OLIVE_NEON_LAMP = registerBlock("olive_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> AMBER_NEON_LAMP = registerBlock("amber_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.WOOD)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> BEIGE_NEON_LAMP = registerBlock("beige_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.SAND)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> TEAL_NEON_LAMP = registerBlock("teal_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> MINT_NEON_LAMP = registerBlock("mint_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.WARPED_WART_BLOCK)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> AQUA_NEON_LAMP = registerBlock("aqua_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.DIAMOND)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> VERDANT_NEON_LAMP = registerBlock("verdant_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> FOREST_NEON_LAMP = registerBlock("forest_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.EMERALD)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> GINGER_NEON_LAMP = registerBlock("ginger_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    public static final RegistryObject<Block> TAN_NEON_LAMP = registerBlock("tan_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.DIRT)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
