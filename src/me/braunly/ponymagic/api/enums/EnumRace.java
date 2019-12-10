package me.braunly.ponymagic.api.enums;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nonnull;
import java.util.Optional;
import java.util.Set;

public enum EnumRace {
	REGULAR("Регуляр", TextFormatting.WHITE, "cake", ImmutableSet.of()),
	ALICORN("Аликорн", TextFormatting.LIGHT_PURPLE, "heal",
			ImmutableSet.of(
					"blink"
			)
	),
	PEGASUS("Пегас", TextFormatting.AQUA, "fly",
			ImmutableSet.of(
					"speed",
					"flyspeed",
					"flyduration",
					"haste",
					"slowfallauto",
					"archery",
					
					"swish",
					"highground",
					"onedge",
					"dodging",
					"dodgingbuff",
					
					"staminaPool",
					"staminaRegen",
					"shregen"
			)
	), 
	UNICORN("Единорог", TextFormatting.RED, "teleport",
			ImmutableSet.of(
					"teleport",
					"fireresistance",
					"hpregen", "unenchant",
					"solidcore",
					"tpbed",
					
					"shield",
					"heal",
					"enchant",
					"slowfall",

					"tpsurface",
					"recoil",
					"slowfall",
					"revival",
					"fly",
					
					"staminaPool",
					"staminaRegen",
					"shregen"
			)
	), 
	EARTHPONY("Земнопони", TextFormatting.GREEN, "craft",
			ImmutableSet.of(
					"craft",
					"jump",
					"grow",
					"stepup",
					"speed",
					"strength",
					"haste",
					"solidcore",

					"resist",
					"burst",
					"recoil",
					"repair",

					"staminaPool",
					"staminaRegen",
					"shregen"
			)
	), 
	ZEBRA("Зебра", TextFormatting.BLUE, "jump",
			ImmutableSet.of(
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
					"revival",

					"staminaPool",
					"staminaRegen",
					"shregen"
			)
	);

	private final Set<String> spells;
	private final TextFormatting color;
	private final String localizedName;
	private final String defaultSpell;

	public TextFormatting getColor() {
		return this.color;
	}

	public String getlocalizedName() {
		return this.localizedName;
	}

	public String getDefaultSpell() {
		return this.defaultSpell;
	}

	EnumRace(String localizedName, TextFormatting color, String defaultSpell, Set<String> spells) {
		this.localizedName = localizedName; // TODO lang file
		this.defaultSpell = defaultSpell;
		this.spells = spells;
		this.color = color;
	}

	public boolean hasSpell(@Nonnull String spellName) {
		return spells.contains(spellName);
	}

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
