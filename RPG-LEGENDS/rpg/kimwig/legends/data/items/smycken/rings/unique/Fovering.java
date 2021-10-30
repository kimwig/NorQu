package rpg.kimwig.legends.data.items.smycken.rings.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Fovering {
	
	// ** Fovering
	
	
	
	// ** Fovering +1
	public static ItemStack foveringLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 40;
		int healthBonus = 5;
		int strengthBonus = 5;
		int dexterityBonus = 5;
		int flameResistance = 5;
		int glacierResistance = 5;
		int thunderResistance = 5;
		int poisonResistance = 20;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +2
	public static ItemStack foveringLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 43;
		int healthBonus = 7;
		int strengthBonus = 7;
		int dexterityBonus = 7;
		int flameResistance = 7;
		int glacierResistance = 7;
		int thunderResistance = 7;
		int poisonResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +3
	public static ItemStack foveringLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 46;
		int healthBonus = 9;
		int strengthBonus = 9;
		int dexterityBonus = 9;
		int flameResistance = 9;
		int glacierResistance = 9;
		int thunderResistance = 9;
		int poisonResistance = 40;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +4
	public static ItemStack foveringLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 49;
		int healthBonus = 11;
		int strengthBonus = 11;
		int dexterityBonus = 11;
		int flameResistance = 11;
		int glacierResistance = 11;
		int thunderResistance = 11;
		int poisonResistance = 50;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +5
	public static ItemStack foveringLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 52;
		int healthBonus = 13;
		int strengthBonus = 13;
		int dexterityBonus = 13;
		int flameResistance = 13;
		int glacierResistance = 13;
		int thunderResistance = 13;
		int poisonResistance = 60;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +6
	public static ItemStack foveringLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 55;
		int healthBonus = 15;
		int strengthBonus = 15;
		int dexterityBonus = 15;
		int flameResistance = 15;
		int glacierResistance = 15;
		int thunderResistance = 15;
		int poisonResistance = 70;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +7
	public static ItemStack foveringLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 59;
		int healthBonus = 17;
		int strengthBonus = 17;
		int dexterityBonus = 17;
		int flameResistance = 17;
		int glacierResistance = 17;
		int thunderResistance = 17;
		int poisonResistance = 80;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +8
	public static ItemStack foveringLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 62;
		int healthBonus = 19;
		int strengthBonus = 19;
		int dexterityBonus = 19;
		int flameResistance = 19;
		int glacierResistance = 19;
		int thunderResistance = 19;
		int poisonResistance = 90;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +9
	public static ItemStack foveringLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 75;
		int healthBonus = 21;
		int strengthBonus = 21;
		int dexterityBonus = 21;
		int flameResistance = 21;
		int glacierResistance = 21;
		int thunderResistance = 21;
		int poisonResistance = 100;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Fovering +10
	public static ItemStack foveringLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 79;
		int healthBonus = 24;
		int strengthBonus = 24;
		int dexterityBonus = 24;
		int flameResistance = 24;
		int glacierResistance = 24;
		int thunderResistance = 24;
		int poisonResistance = 120;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Fovering (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
