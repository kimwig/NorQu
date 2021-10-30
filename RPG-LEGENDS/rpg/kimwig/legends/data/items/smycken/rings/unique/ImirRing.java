package rpg.kimwig.legends.data.items.smycken.rings.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ImirRing {
	
	// ** Imir Ring
	
	
	
	// ** Imir Ring +1
	public static ItemStack imirRingLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 20;
		int thunderDamage = 30;
		int healthBonus = 5;
		int intelligenceBonus = 5;
		int magicPowerBonus = 5;
		int flameResistance = 5;
		int glacierResistance = 5;
		int thunderResistance = 20;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +2
	public static ItemStack imirRingLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 24;
		int thunderDamage = 45;
		int healthBonus = 7;
		int intelligenceBonus = 7;
		int magicPowerBonus = 7;
		int flameResistance = 7;
		int glacierResistance = 7;
		int thunderResistance = 22;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +3
	public static ItemStack imirRingLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 28;
		int thunderDamage = 60;
		int healthBonus = 9;
		int intelligenceBonus = 9;
		int magicPowerBonus = 9;
		int flameResistance = 9;
		int glacierResistance = 9;
		int thunderResistance = 24;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +4
	public static ItemStack imirRingLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 32;
		int thunderDamage = 75;
		int healthBonus = 11;
		int intelligenceBonus = 11;
		int magicPowerBonus = 11;
		int flameResistance = 11;
		int glacierResistance = 11;
		int thunderResistance = 26;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +5
	public static ItemStack imirRingLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 36;
		int thunderDamage = 90;
		int healthBonus = 13;
		int intelligenceBonus = 13;
		int magicPowerBonus = 13;
		int flameResistance = 13;
		int glacierResistance = 13;
		int thunderResistance = 28;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +6
	public static ItemStack imirRingLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 40;
		int thunderDamage = 105;
		int healthBonus = 15;
		int intelligenceBonus = 15;
		int magicPowerBonus = 15;
		int flameResistance = 15;
		int glacierResistance = 15;
		int thunderResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +7
	public static ItemStack imirRingLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 44;
		int thunderDamage = 120;
		int healthBonus = 17;
		int intelligenceBonus = 17;
		int magicPowerBonus = 17;
		int flameResistance = 17;
		int glacierResistance = 17;
		int thunderResistance = 32;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +8
	public static ItemStack imirRingLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 48;
		int thunderDamage = 135;
		int healthBonus = 19;
		int intelligenceBonus = 19;
		int magicPowerBonus = 19;
		int flameResistance = 19;
		int glacierResistance = 19;
		int thunderResistance = 34;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +9
	public static ItemStack imirRingLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 52;
		int thunderDamage = 150;
		int healthBonus = 21;
		int intelligenceBonus = 21;
		int magicPowerBonus = 21;
		int flameResistance = 21;
		int glacierResistance = 21;
		int thunderResistance = 36;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Imir Ring +10
	public static ItemStack imirRingLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 57;
		int thunderDamage = 170;
		int healthBonus = 24;
		int intelligenceBonus = 24;
		int magicPowerBonus = 24;
		int flameResistance = 24;
		int glacierResistance = 24;
		int thunderResistance = 40;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Imir Ring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000004);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Ring");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
