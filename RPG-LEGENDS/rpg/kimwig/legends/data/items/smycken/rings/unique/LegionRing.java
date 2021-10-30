package rpg.kimwig.legends.data.items.smycken.rings.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class LegionRing {
	
	// ** Legion Ring
	
	
	
	// ** Legion Ring +1
	public static ItemStack legionRingLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 50;
		int healthBonus = 7;
		int dexterityBonus = 7;
		int HPBonus = 100;
		int flameResistance = 20;
		int glacierResistance = 20;
		int thunderResistance = 20;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +2
	public static ItemStack legionRingLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 54;
		int healthBonus = 10;
		int dexterityBonus = 10;
		int HPBonus = 150;
		int flameResistance = 22;
		int glacierResistance = 22;
		int thunderResistance = 22;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +3
	public static ItemStack legionRingLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 58;
		int healthBonus = 13;
		int dexterityBonus = 13;
		int HPBonus = 200;
		int flameResistance = 24;
		int glacierResistance = 24;
		int thunderResistance = 24;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +4
	public static ItemStack legionRingLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 62;
		int healthBonus = 16;
		int dexterityBonus = 16;
		int HPBonus = 250;
		int flameResistance = 26;
		int glacierResistance = 26;
		int thunderResistance = 26;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +5
	public static ItemStack legionRingLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 66;
		int healthBonus = 19;
		int dexterityBonus = 19;
		int HPBonus = 300;
		int flameResistance = 28;
		int glacierResistance = 28;
		int thunderResistance = 28;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +6
	public static ItemStack legionRingLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 70;
		int healthBonus = 22;
		int dexterityBonus = 22;
		int HPBonus = 350;
		int flameResistance = 30;
		int glacierResistance = 30;
		int thunderResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +7
	public static ItemStack legionRingLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 76;
		int healthBonus = 25;
		int dexterityBonus = 25;
		int HPBonus = 400;
		int flameResistance = 32;
		int glacierResistance = 32;
		int thunderResistance = 32;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +8
	public static ItemStack legionRingLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 82;
		int healthBonus = 28;
		int dexterityBonus = 28;
		int HPBonus = 450;
		int flameResistance = 34;
		int glacierResistance = 34;
		int thunderResistance = 34;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +9
	public static ItemStack legionRingLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 88;
		int healthBonus = 31;
		int dexterityBonus = 31;
		int HPBonus = 500;
		int flameResistance = 36;
		int glacierResistance = 36;
		int thunderResistance = 36;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Legion Ring +10
	public static ItemStack legionRingLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 99;
		int healthBonus = 35;
		int dexterityBonus = 35;
		int HPBonus = 600;
		int flameResistance = 39;
		int glacierResistance = 39;
		int thunderResistance = 39;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legion Ring (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
