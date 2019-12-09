package me.braunly.ponymagic.api.interfaces;

public interface ISkillDataStorage extends INBTDataStorage{
    int getSkillLevel(String name);
    boolean isSkillLearned(String skillName);

    void upSkillLevel(String name);

    void reset();
}
