package me.braunly.ponymagic.api.interfaces;

import net.braunly.ponymagic.race.EnumRace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;

public interface IPlayerDataStorage {
    ILevelDataStorage getLevelData();
    ISkillDataStorage getSkillData();
    String getUUID();

    EnumRace getRace();
    void setRace(EnumRace race);

    EntityPlayer getPlayer();
    void setPlayer(EntityPlayer player);

    NBTTagCompound getNBT();
    void setNBT(NBTTagCompound nbt);

    void reset();
    void clean();
}
