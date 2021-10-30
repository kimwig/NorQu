package rpg.kimwig.legends.data.items.smycken.rings.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class FlameRing {
	
	// ** Flame Ring
	
	
	
	// ** Flame Ring +1
	public static ItemStack flameRingLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 20;
		int flameDamage = 30;
		int healthBonus = 5;
		int intelligenceBonus = 5;
		int magicPowerBonus = 5;
		int flameResistance = 20;
		int glacierResistance = 5;
		int thunderResistance = 5;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +2
	public static ItemStack flameRingLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 24;
		int flameDamage = 45;
		int healthBonus = 7;
		int intelligenceBonus = 7;
		int magicPowerBonus = 7;
		int flameResistance = 22;
		int glacierResistance = 7;
		int thunderResistance = 7;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +3
	public static ItemStack flameRingLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 28;
		int flameDamage = 60;
		int healthBonus = 9;
		int intelligenceBonus = 9;
		int magicPowerBonus = 9;
		int flameResistance = 24;
		int glacierResistance = 9;
		int thunderResistance = 9;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +4
	public static ItemStack flameRingLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 32;
		int flameDamage = 75;
		int healthBonus = 11;
		int intelligenceBonus = 11;
		int magicPowerBonus = 11;
		int flameResistance = 26;
		int glacierResistance = 11;
		int thunderResistance = 11;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +5
	public static ItemStack flameRingLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 36;
		int flameDamage = 90;
		int healthBonus = 13;
		int intelligenceBonus = 13;
		int magicPowerBonus = 13;
		int flameResistance = 28;
		int glacierResistance = 13;
		int thunderResistance = 13;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +6
	public static ItemStack flameRingLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 40;
		int flameDamage = 105;
		int healthBonus = 15;
		int intelligenceBonus = 15;
		int magicPowerBonus = 15;
		int flameResistance = 30;
		int glacierResistance = 15;
		int thunderResistance = 15;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +7
	public static ItemStack flameRingLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 44;
		int flameDamage = 120;
		int healthBonus = 17;
		int intelligenceBonus = 17;
		int magicPowerBonus = 17;
		int flameResistance = 32;
		int glacierResistance = 17;
		int thunderResistance = 17;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +8
	public static ItemStack flameRingLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 48;
		int flameDamage = 135;
		int healthBonus = 19;
		int intelligenceBonus = 19;
		int magicPowerBonus = 19;
		int flameResistance = 34;
		int glacierResistance = 19;
		int thunderResistance = 19;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +9
	public static ItemStack flameRingLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 52;
		int flameDamage = 150;
		int healthBonus = 21;
		int intelligenceBonus = 21;
		int magicPowerBonus = 21;
		int flameResistance = 36;
		int glacierResistance = 21;
		int thunderResistance = 21;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
	
	// ** Flame Ring +10
	public static ItemStack flameRingLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 57;
		int flameDamage = 170;
		int healthBonus = 25;
		int intelligenceBonus = 25;
		int magicPowerBonus = 25;
		int flameResistance = 40;
		int glacierResistance = 25;
		int thunderResistance = 25;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Flame Ring (+" + level + ")");
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
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
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
