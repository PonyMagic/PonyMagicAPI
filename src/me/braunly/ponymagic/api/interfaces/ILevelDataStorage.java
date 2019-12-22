package me.braunly.ponymagic.api.interfaces;

import me.braunly.ponymagic.api.events.LevelUpEvent;
import net.minecraft.entity.player.EntityPlayer;

public interface ILevelDataStorage extends INBTDataStorage{
    /**
     * Check if exp enough for level up
     * @return boolean
     */
    boolean isLevelUp();
    /**
     * Add one level and remove exp.
     * Fires {@link LevelUpEvent}
     * @param player player entity
     */
    void levelUp(EntityPlayer player);
    /**
     * Get current player level.
     * @return level
     */
    int getLevel();
    /**
     * Set player level.
     * @param level level
     */
    void setLevel(int level);

    /**
     * Get current free skill points count.
     * @return skill points count
     */
    int getFreeSkillPoints();
    /**
     * Add (or remove) free skill points.
     * @param points points count. Can be negative
     */
    void addFreeSkillPoints(int points);
    /**
     * Set free skill points.
     * @param points skill points amount
     */
    void setFreeSkillPoints(int points);

    /**
     * Get current exp count.
     * @return exp count
     */
    double getExp();
    /**
     * Add (or remove) exp
     * @param exp exp count. Can be negative
     */
    void addExp(double exp);

    /**
     * Set current exp amount.
     * @param exp exp amount
     */
    void setExp(double exp);
}
