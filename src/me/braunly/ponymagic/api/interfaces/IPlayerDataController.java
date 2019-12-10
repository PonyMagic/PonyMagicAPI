package me.braunly.ponymagic.api.interfaces;

import net.minecraft.entity.player.EntityPlayer;

public interface IPlayerDataController {
    /**
     * Get player PonyMagic data storage by username.
     * @param playerName player name
     * @return player data storage {@link IPlayerDataStorage}
     */
    IPlayerDataStorage getPlayerData(String playerName);
    /**
     * Get player PonyMagic data storage by player entity.
     * @param player player entity
     * @return player data storage {@link IPlayerDataStorage}
     */
    IPlayerDataStorage getPlayerData(EntityPlayer player);
    /**
     * Save PonyMagic player data to disk.
     * @param playerData player data storage {@link IPlayerDataStorage}
     */
    void savePlayerData(IPlayerDataStorage playerData);
}
