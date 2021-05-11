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

    /**
     * Get current player goals.
     * @return quests hashmap
     */
    HashMap<String, HashMap<String, Integer>> getCurrentGoals();

    /**
     * Check is player has goal
     * @param questName quest
     * @param goalName goal of quest
     * @return bool
     */
    boolean isCurrentGoal(String questName, String goalName);

    /**
     * Decrease quest goal
     * @param questName quest name
     * @param goalName goal name of quest
     */
    void decreaseGoal(String questName, String goalName);

    /**
     * Set new player quests
     * @param quests quests hashmap
     */
    void setGoals(ImmutableMap<String, ImmutableMap<String, Integer>> quests);

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
