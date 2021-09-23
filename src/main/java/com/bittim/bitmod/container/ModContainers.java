package com.bittim.bitmod.container;

import com.bittim.bitmod.screen.AlloyFurnaceScreen;
import com.bittim.bitmod.setup.RegistryHandler;

import net.minecraft.client.gui.ScreenManager;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.network.IContainerFactory;

public class ModContainers
{
    public static final RegistryObject<ContainerType<AlloyFurnaceContainer>> ALLOY_FURNACE = register("alloy_furnace", AlloyFurnaceContainer::new);

    public static void register() {}

    @OnlyIn(Dist.CLIENT)
    public static void registerScreens(FMLClientSetupEvent event)
    {
        ScreenManager.register(ALLOY_FURNACE.get(), AlloyFurnaceScreen::new);
    }

    private static <T extends Container> RegistryObject<ContainerType<T>> register(String name, IContainerFactory<T> factory) {
        return RegistryHandler.CONTAINERS.register(name, () -> IForgeContainerType.create(factory));
    }
}
