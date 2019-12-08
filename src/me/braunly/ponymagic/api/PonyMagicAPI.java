package me.braunly.ponymagic.api;

import me.braunly.ponymagic.api.interfaces.IStaminaStorage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Loader;

public class PonyMagicAPI {
    @CapabilityInject(IStaminaStorage.class)
    public static final Capability<IStaminaStorage> STAMINA = null;

    public static IStaminaStorage getStaminaStorage(EntityPlayer player) {
        return player.getCapability(PonyMagicAPI.STAMINA, null);
    }

    public static boolean IsAvailable(){
        return Loader.isModLoaded("ponymagic");
    }
}
