package me.braunly.ponymagic.api.interfaces;

public interface ILevelDataStorage extends INBTDataStorage{
    /**
     * Get current player level.
     * @return level
     */
    int getLevel();
    /**
     * Add one level.
     */
    void addLevel();
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
     * Add one free skill point.
     */
    void addFreeSkillPoints();
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
     * Remove all exp
     */
    void resetExp();
}
