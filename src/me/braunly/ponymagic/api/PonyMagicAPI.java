package me.braunly.ponymagic.api;

import me.braunly.ponymagic.api.interfaces.IPlayerDataController;
import me.braunly.ponymagic.api.interfaces.IPlayerDataStorage;
import me.braunly.ponymagic.api.interfaces.IStaminaStorage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.fml.common.Loader;

public class PonyMagicAPI {
    /**
     * Player data controller instance. See {@link IPlayerDataController}
     */
    public static IPlayerDataController playerDataController = null;

    @CapabilityInject(IStaminaStorage.class)
    public static final Capability<IStaminaStorage> STAMINA = null;
    @CapabilityInject(IPlayerDataStorage.class)
    public static final Capability<IPlayerDataStorage> PLAYERDATA_CAPABILITY = null;

    /**
     * Get stamina capability.
     * @param player player entity
     * @return stamina storage {@link IStaminaStorage}
     */
    public static IStaminaStorage getStaminaStorage(EntityPlayer player) {
        return player.getCapability(PonyMagicAPI.STAMINA, null);
    }

    /**
     * Get player data capability
     * @param player player entity
     * @return player data storage {@link IPlayerDataStorage}
     */
    public static IPlayerDataStorage getPlayerDataStorage(EntityPlayer player) {
        return player.getCapability(PonyMagicAPI.PLAYERDATA_CAPABILITY, null);
    }

    /**
     * Check if PonyMagic mod loaded and available in runtime.
     * @return boolean
     */
    public static boolean IsAvailable(){
        return Loader.isModLoaded("ponymagic");
    }
}
