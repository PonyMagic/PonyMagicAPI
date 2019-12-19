package me.braunly.ponymagic.api.interfaces;

import java.util.HashMap;

public interface ITickDataStorage extends INBTDataStorage{
    /**
     * Get timer ticks count for given skill.
     * @param skillName Skill name
     * @return ticks count
     */
    int getTicks(String skillName);

    /**
     * Get all current timers.
     * @return hashmap with skill name and ticks
     */
    HashMap<String, Integer> getTimers();

    /**
     * Check for existance of timer for given skill.
     * @param skillName skill name
     * @return boolean
     */
    boolean isTicking(String skillName);
    /**
     * Check if exist any timer.
     * @return boolean
     */
    boolean isTicking();

    /**
     * Start new tick timer for skill.
     * @param skillname skill name
     * @param ticks timer length
     */
    void startTicking(String skillname, int ticks);

    /**
     * Stop timer for given skill.
     * @param skillname skill name
     */
    void stopTicking(String skillname);

    /**
     * Perform ticking.
     */
    void tick();
    /**
     * Reset all skills timers.
     */
    void reset();
}
