package me.braunly.ponymagic.api.interfaces;

import net.minecraft.nbt.NBTTagCompound;

interface INBTDataStorage {
    void saveToNBT(NBTTagCompound compound);
    void readFromNBT(NBTTagCompound compound);
}
