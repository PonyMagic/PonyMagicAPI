package me.braunly.ponymagic.api.enums;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nonnull;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;

public enum EnumRace {
	REGULAR(TextFormatting.WHITE, "cake", ImmutableSet.of()),
	ALICORN(TextFormatting.LIGHT_PURPLE, "heal",
			ImmutableSet.of(
					"blink"
			)
	),
	PEGASUS(TextFormatting.AQUA, "fly",
			ImmutableSet.of(
					"staminaPool",
					"staminaRegen",
					"shregen",

					"speed",
					"haste",
					"archery",
					"swish",

					"slowfallauto",
					"flyspeed",
					"flyduration",
					"highground",
					"onedge",
					"dodging",
					"dodgingbuff",
					"flyhaste"
			)
	), 
	UNICORN(TextFormatting.RED, "teleport",
			ImmutableSet.of(
					"staminaPool",
					"staminaRegen",
					"shregen",

					"teleport",
					"hpregen",
					"unenchant",
					"solidcore",
					"tpbed",
					"shield",
					"heal",
					"enchant",
					"slowfall",
					"tpsurface",
					"slowfall",
					"revival",
					"fly",

					"blink",
					"portal",
					"moonbeam",
					"healwave",

					"readyforduel",
					"extinguisher"
			)
	), 
	EARTHPONY(TextFormatting.GREEN, "craft",
			ImmutableSet.of(
					"staminaPool",
					"staminaRegen",
					"shregen",

					"craft",
					"jump",
					"grow",
					"stepup",
					"speed",
					"dash",
					"strength",
					"haste",
					"solidcore",
					"resist",
					"ironskin",
					"recoil",
					"repair"
			)
	), 
	ZEBRA(TextFormatting.BLUE, "jump",
			ImmutableSet.of(
					"staminaPool",
					"staminaRegen",
					"shregen",

					"jump",
					"dispel",
					"fireresistance",
					"drown",
					"slow",
					"purity",
					"nightvision",
					"vulnerable",
					"antidote",
					"climb",
					"poison",
					"invisibility",
					"cure",
					"invert",
					"extension",
					"revival"
			)
	);

	private final Set<String> spells;
	private final TextFormatting color;
	private final String defaultSpell;

	/**
	 * Get color in TextFormatting format.
	 * @return race color
	 */
	public TextFormatting getColor() {
		return this.color;
	}

	/**
	 * Get localized name.
	 * @return race name
	 */
	public String getLocalizedName() {
		return new TextComponentTranslation("race." + this.name().toLowerCase(Locale.ROOT) + ".name").getUnformattedText();
	}

	/**
	 * Get race default spell name.
	 * @return spell name
	 */
	public String getDefaultSpell() {
		return this.defaultSpell;
	}

	EnumRace(TextFormatting color, String defaultSpell, Set<String> spells) {
		this.defaultSpell = defaultSpell;
		this.spells = spells;
		this.color = color;
	}

	/**
	 * Check if race can use spell.
	 * @param spellName spell name
	 * @return race color
	 */
	public boolean hasSpell(@Nonnull String spellName) {
		return spells.contains(spellName);
	}

	/**
	 * Get race by name.
	 * @param name race namea
	 * @return race
	 */
	@Nonnull
	public static Optional<EnumRace> getByName(@Nonnull String name) {
		for (EnumRace race : EnumRace.values()) {
			if (race.name().equalsIgnoreCase(name)) {
				return Optional.of(race);
			}
		}
		return Optional.empty();
	}
}
