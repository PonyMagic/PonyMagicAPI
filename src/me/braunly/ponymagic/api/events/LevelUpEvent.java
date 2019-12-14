package me.braunly.ponymagic.api.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Event;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class LevelUpEvent extends Event {

	@Nonnull
	private EntityPlayer player;
	private int level;

	public int getLevel() {
		return level;
	}

	@Nonnull
	public EntityPlayer getPlayer() {
		return player;
	}

	@ParametersAreNonnullByDefault
	public LevelUpEvent(EntityPlayer player, int level) {
		this.player = player;
		this.level = level;
	}
}
