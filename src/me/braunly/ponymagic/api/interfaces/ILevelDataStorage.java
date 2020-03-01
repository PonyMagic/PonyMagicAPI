package me.braunly.ponymagic.api.interfaces;

import me.braunly.ponymagic.api.events.LevelUpEvent;
import net.minecraft.entity.player.EntityPlayer;

public interface ILevelDataStorage extends INBTDataStorage{
    /**
     * Check if exp enough for level up
     * Deprecated. Use isLevelChange() instead.
     * @return boolean
     */
    @Deprecated
    boolean isLevelUp();

    /**
     * Check if level need to be changed
     * @return boolean
     */
    boolean isLevelChange();
    /**
     * Add one level and remove exp.
     * Fires {@link LevelUpEvent}
     * Deprecated. Use changeLevel() instead
     * @param player player entity
     */
    @Deprecated
    void levelUp(EntityPlayer player);

    /**
     * Change level and free skill points in order of exp count
     * Level up if exp enough for next level and level down if exp not enough for current level
     */
    void changeLevel();

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
