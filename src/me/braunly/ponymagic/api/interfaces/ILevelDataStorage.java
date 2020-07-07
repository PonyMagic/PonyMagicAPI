package me.braunly.ponymagic.api.interfaces;

import com.google.common.collect.ImmutableMap;
import me.braunly.ponymagic.api.events.LevelUpEvent;

import java.util.HashMap;

public interface ILevelDataStorage extends INBTDataStorage{
    /**
     * Check if exp enough for level up
     * @return boolean
     */
    boolean isLevelUp();

    /**
     * Add one level and remove exp.
     * Fires {@link LevelUpEvent}
     */
    void levelUp();

    HashMap<String, HashMap<String, Integer>> getCurrentGoals();

    boolean isCurrentGoal(String questName, String goalName);

    void decreaseGoal(String questName, String goalName);

    void setGoals(ImmutableMap<String, ImmutableMap<String, Integer>> goals);

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
}
