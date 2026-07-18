package net.din37r.cyberishlightsdepot;

import com.mojang.logging.LogUtils;
import net.din37r.cyberishlights.item.ModCreativeModTabs;
import net.din37r.cyberishlightsdepot.block.ModBlocks;
import net.din37r.cyberishlightsdepot.item.ModItems;
// import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
// import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
// import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CyberishLightsDepot.MOD_ID)
public class CyberishLightsDepot
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "cyberishlightsdepot";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public CyberishLightsDepot(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        // context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(ModCreativeModTabs.CYBERISHLIGHTS_TAB.getKey())) {
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.RED_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.MAROON_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.RED_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.ROSE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.ORANGE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.CORAL_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.ORANGE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.GINGER_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.YELLOW_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.TAN_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.YELLOW_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.BEIGE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIME_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.OLIVE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIME_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.AMBER_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.GREEN_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.FOREST_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.CYAN_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.VERDANT_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.CYAN_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.TEAL_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIGHT_BLUE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.AQUA_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIGHT_BLUE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.MINT_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.PURPLE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.NAVY_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.PURPLE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.SLATE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.PURPLE_NEON_LAMP.get().asItem().getDefaultInstance(),
                    ModBlocks.INDIGO_NEON_LAMP.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.RED_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.MAROON_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.RED_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.ROSE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.ORANGE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.CORAL_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.ORANGE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.GINGER_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.YELLOW_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.TAN_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.YELLOW_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.BEIGE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIME_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.OLIVE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIME_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.AMBER_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.GREEN_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.FOREST_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.CYAN_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.VERDANT_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.CYAN_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.TEAL_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIGHT_BLUE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.AQUA_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.LIGHT_BLUE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.MINT_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.PURPLE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.NAVY_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.PURPLE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.SLATE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
            event.getEntries().putBefore(
                    net.din37r.cyberishlights.block.ModBlocks.PURPLE_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    ModBlocks.INDIGO_NEON_LANTERN.get().asItem().getDefaultInstance(),
                    CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS
            );
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    // @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    // public static class ClientModEvents
    // {
    //     @SubscribeEvent
    //     public static void onClientSetup(FMLClientSetupEvent event)
    //     {
    //     }
    // }
}
