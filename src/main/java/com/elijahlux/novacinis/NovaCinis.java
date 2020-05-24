package com.elijahlux.novacinis;

import com.elijahlux.novacinis.blocks.*;
import com.elijahlux.novacinis.setup.ClientProxy;
import com.elijahlux.novacinis.setup.IProxy;
import com.elijahlux.novacinis.setup.ServerProxy;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("novacinis")
public class NovaCinis {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public NovaCinis() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
/*        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
*/
        // Register ourselves for server and other game events we are interested in
        // MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
          }


/*    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
*/
    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            blockRegistryEvent.getRegistry().register(new CoolPlume());
            blockRegistryEvent.getRegistry().register(new WarmPlume());
            blockRegistryEvent.getRegistry().register(new ToastyPlume());
            blockRegistryEvent.getRegistry().register(new ScorchingPlume());
            blockRegistryEvent.getRegistry().register(new InfernalPlume());
            LOGGER.info("HELLO from Register Block");
        }
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.COOLPLUME, new Item.Properties()).setRegistryName("coolplume"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.WARMPLUME, new Item.Properties()).setRegistryName("warmplume"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.TOASTYPLUME, new Item.Properties()).setRegistryName("toastyplume"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.SCORCHINGPLUME, new Item.Properties()).setRegistryName("scorchingplume"));
            itemRegistryEvent.getRegistry().register(new BlockItem(ModBlocks.INFERNALPLUME, new Item.Properties()).setRegistryName("infernalplume"));
            LOGGER.info("HELLO from Register Item");
        }

    }
}
