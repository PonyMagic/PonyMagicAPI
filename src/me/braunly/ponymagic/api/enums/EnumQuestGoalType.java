package me.braunly.ponymagic.api.enums;

import javax.annotation.Nonnull;
import java.util.Optional;

public enum EnumQuestGoalType {
    BLOCK,
    ITEM,
    ENTITY,
    CUSTOM;
    /**
     * Get quest goal type by name.
     * @param name goal type name
     * @return race
     */
    @Nonnull
    public static Optional<EnumQuestGoalType> getByName(@Nonnull String name) {
        for (EnumQuestGoalType goalType : EnumQuestGoalType.values()) {
            if (goalType.name().equalsIgnoreCase(name)) {
                return Optional.of(goalType);
            }
        }
        return Optional.empty();
    }
}
