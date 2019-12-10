package me.braunly.ponymagic.api.interfaces;

import net.minecraft.nbt.NBTTagCompound;

interface INBTDataStorage {
    /**
     * Save all storage info to NBTTag compound.
     * @param compound NBTTagCompound
     */
    void saveToNBT(NBTTagCompound compound);
    /**
     * Get info from NBTTag compound.
     * @param compound NBTTagCompound
     */
    void readFromNBT(NBTTagCompound compound);
}
