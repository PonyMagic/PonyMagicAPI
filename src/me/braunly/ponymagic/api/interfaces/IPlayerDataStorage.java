package me.braunly.ponymagic.api.interfaces;

import me.braunly.ponymagic.api.enums.EnumRace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public interface IPlayerDataStorage {
    /**
     * Get player level data.
     * @return level data storage {@link ILevelDataStorage)
     */
    ILevelDataStorage getLevelData();
    /**
     * Get player skills data.
     * @return skills data storage {@link ISkillDataStorage)
     */
    ISkillDataStorage getSkillData();
    /**
     * Get player UUID string.
     * @return uuid string
     */
    String getUUID();

    /**
     * Get player race.
     * @return player race {@link EnumRace}
     */
    EnumRace getRace();
    /**
     * Set player race.
     * @param race race {@link EnumRace}
     */
    void setRace(EnumRace race);

    /**
     * Get player entity.
     * @return player entity
     */
    EntityPlayer getPlayer();
    /**
     * Set player entity.
     */
    void setPlayer(EntityPlayer player);

    /**
     * Get all player data in NBTTagCompound format.
     * @return NBTTagCompound
     */
    NBTTagCompound getNBT();
    /**
     * Set player data from NBTTagCompound.
     * @param nbt NBTTagCompound
     */
    void setNBT(NBTTagCompound nbt);

    /**
     * Reset player all learned skills and free skill points.
     */
    void reset();
}
