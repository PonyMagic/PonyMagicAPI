package me.braunly.ponymagic.api.interfaces;

import java.util.Map;

public interface ISkillDataStorage extends INBTDataStorage{
    /**
     * Get skill level.
     * @param name skill name
     * @return skill level
     */
    int getSkillLevel(String name);
    boolean isAnySkillLearned(Map<String, Integer> skillsMap);
    /**
     * Check if skill learned.
     * @param skillName skill name
     */
    boolean isSkillLearned(String skillName);

    /**
     * Add one level to skill.
     * @param name skill name
     */
    void upSkillLevel(String name);

    /**
     * Remove all learned skills.
     */
    void reset();
}
