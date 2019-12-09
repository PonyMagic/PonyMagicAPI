package me.braunly.ponymagic.api.interfaces;

import net.minecraft.entity.player.EntityPlayer;

public interface IPlayerDataController {
    IPlayerDataStorage getPlayerData(String playerName);
    IPlayerDataStorage getPlayerData(EntityPlayer player);
    void savePlayerData(IPlayerDataStorage playerData);
}
