package me.braunly.ponymagic.api.interfaces;

import me.braunly.ponymagic.api.enums.EnumStaminaType;
import net.minecraft.entity.player.EntityPlayerMP;

public interface IStaminaStorage {
	/**
	 * Check if player has enough stamina points and remove it.
	 * @param value amount of stamina to consume
	 * @return is stamina removed
	 */
	boolean consume(Double value);

	/**
	 * Add stamina points.
	 * @param value amount (can be negative)
	 */
	void add(Double value);

	/**
	 * Set stamina to some level.
	 * @param type stamina type {@link EnumStaminaType}
	 * @param value amount
	 */
	void set(EnumStaminaType type, Double value);

	/**
	 * Set current stamina to maximum level.
	 */
	void fill();

	/**
	 * Remove all current stamina points.
	 */
	void zero();

	/**
	 * Get stamina level.
	 * @param type stamina type {@link EnumStaminaType}
	 * @return amount
	 */
	Double getStamina(EnumStaminaType type);

	/**
	 * Sync stamina level with client side.
	 * @param player player entity
	 */
	void sync(EntityPlayerMP player);
}