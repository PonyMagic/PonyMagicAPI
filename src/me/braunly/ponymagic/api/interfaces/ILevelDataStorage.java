package me.braunly.ponymagic.api.interfaces;

public interface ILevelDataStorage extends INBTDataStorage{
    int getLevel();
    void addLevel();
    void setLevel(int level);

    int getFreeSkillPoints();
    void addFreeSkillPoints();
    void addFreeSkillPoints(int points);
    void setFreeSkillPoints(int points);

    double getExp();
    void addExp(double exp);
    void resetExp();
}
