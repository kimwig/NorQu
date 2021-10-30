package rpg.kimwig.legends.data.items.armor.chaos;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ChaosArmor {
	
	// ** Chaos Armor
	
	// ** Chaos Helmets
	
	// ** Chaos Helmet +1
	public static ItemStack divineHelmetLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 100;
		int healthBonus = 2;
		int strengthBonus = 2;
		int dexterityBonus = 2;
		int intelligenceBonus = 2;
		int magicPowerBonus = 2;
		int HPBonus = 100;
		int flameResistance = 2;
		int glacierResistance = 2;
		int thunderResistance = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +2
	public static ItemStack divineHelmetLvl2() {
	
		// ** Variables
		int level = 2;
		int levelRequired = 80;
		int defenceAbility = 102;
		int healthBonus = 2;
		int strengthBonus = 2;
		int dexterityBonus = 2;
		int intelligenceBonus = 2;
		int magicPowerBonus = 2;
		int HPBonus = 150;
		int flameResistance = 4;
		int glacierResistance = 4;
		int thunderResistance = 4;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +3
	public static ItemStack divineHelmetLvl3() {
	
		// ** Variables
		int level = 3;
		int levelRequired = 80;
		int defenceAbility = 104;
		int healthBonus = 4;
		int strengthBonus = 4;
		int dexterityBonus = 4;
		int intelligenceBonus = 4;
		int magicPowerBonus = 4;
		int HPBonus = 200;
		int flameResistance = 6;
		int glacierResistance = 6;
		int thunderResistance = 6;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +4
	public static ItemStack divineHelmetLvl4() {
	
		// ** Variables
		int level = 4;
		int levelRequired = 80;
		int defenceAbility = 106;
		int healthBonus = 6;
		int strengthBonus = 6;
		int dexterityBonus = 6;
		int intelligenceBonus = 6;
		int magicPowerBonus = 6;
		int HPBonus = 250;
		int flameResistance = 8;
		int glacierResistance = 8;
		int thunderResistance = 8;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +5
	public static ItemStack divineHelmetLvl5() {
	
		// ** Variables
		int level = 5;
		int levelRequired = 80;
		int defenceAbility = 108;
		int healthBonus = 8;
		int strengthBonus = 8;
		int dexterityBonus = 8;
		int intelligenceBonus = 8;
		int magicPowerBonus = 8;
		int HPBonus = 300;
		int flameResistance = 10;
		int glacierResistance = 10;
		int thunderResistance = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +6
	public static ItemStack divineHelmetLvl6() {
	
		// ** Variables
		int level = 6;
		int levelRequired = 80;
		int defenceAbility = 110;
		int healthBonus = 10;
		int strengthBonus = 10;
		int dexterityBonus = 10;
		int intelligenceBonus = 10;
		int magicPowerBonus = 10;
		int HPBonus = 350;
		int flameResistance = 12;
		int glacierResistance = 12;
		int thunderResistance = 12;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +7
	public static ItemStack divineHelmetLvl7() {
	
		// ** Variables
		int level = 7;
		int levelRequired = 80;
		int defenceAbility = 112;
		int healthBonus = 12;
		int strengthBonus = 12;
		int dexterityBonus = 12;
		int intelligenceBonus = 12;
		int magicPowerBonus = 12;
		int HPBonus = 400;
		int flameResistance = 14;
		int glacierResistance = 14;
		int thunderResistance = 14;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +8
	public static ItemStack divineHelmetLvl8() {
	
		// ** Variables
		int level = 8;
		int levelRequired = 80;
		int defenceAbility = 114;
		int healthBonus = 14;
		int strengthBonus = 14;
		int dexterityBonus = 14;
		int intelligenceBonus = 14;
		int magicPowerBonus = 14;
		int HPBonus = 450;
		int flameResistance = 16;
		int glacierResistance = 16;
		int thunderResistance = 16;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +9
	public static ItemStack divineHelmetLvl9() {
	
		// ** Variables
		int level = 9;
		int levelRequired = 80;
		int defenceAbility = 116;
		int healthBonus = 16;
		int strengthBonus = 16;
		int dexterityBonus = 16;
		int intelligenceBonus = 16;
		int magicPowerBonus = 16;
		int HPBonus = 500;
		int flameResistance = 18;
		int glacierResistance = 18;
		int thunderResistance = 18;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Helmet +10
	public static ItemStack divineHelmetLvl10() {
	
		// ** Variables
		int level = 10;
		int levelRequired = 80;
		int defenceAbility = 118;
		int healthBonus = 18;
		int strengthBonus = 18;
		int dexterityBonus = 18;
		int intelligenceBonus = 18;
		int magicPowerBonus = 18;
		int HPBonus = 550;
		int flameResistance = 20;
		int glacierResistance = 20;
		int thunderResistance = 20;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Pauldrons
	
	// ** Chaos Pauldron +1
	public static ItemStack divinePauldronLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 179;
		int healthBonus = 2;
		int strengthBonus = 2;
		int dexterityBonus = 2;
		int intelligenceBonus = 2;
		int magicPowerBonus = 2;
		int HPBonus = 100;
		int flameResistance = 2;
		int glacierResistance = 2;
		int thunderResistance = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Pauldron +2
	public static ItemStack divinePauldronLvl2() {
		
			// ** Variables
			int level = 2;
			int levelRequired = 80;
			int defenceAbility = 188;
			int healthBonus = 2;
			int strengthBonus = 2;
			int dexterityBonus = 2;
			int intelligenceBonus = 2;
			int magicPowerBonus = 2;
			int HPBonus = 150;
			int flameResistance = 4;
			int glacierResistance = 4;
			int thunderResistance = 4;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +3
	public static ItemStack divinePauldronLvl3() {
		
			// ** Variables
			int level = 3;
			int levelRequired = 80;
			int defenceAbility = 197;
			int healthBonus = 4;
			int strengthBonus = 4;
			int dexterityBonus = 4;
			int intelligenceBonus = 4;
			int magicPowerBonus = 4;
			int HPBonus = 200;
			int flameResistance = 6;
			int glacierResistance = 6;
			int thunderResistance = 6;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +4
	public static ItemStack divinePauldronLvl4() {
		
			// ** Variables
			int level = 4;
			int levelRequired = 80;
			int defenceAbility = 206;
			int healthBonus = 6;
			int strengthBonus = 6;
			int dexterityBonus = 6;
			int intelligenceBonus = 6;
			int magicPowerBonus = 6;
			int HPBonus = 250;
			int flameResistance = 8;
			int glacierResistance = 8;
			int thunderResistance = 8;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +5
	public static ItemStack divinePauldronLvl5() {
		
			// ** Variables
			int level = 5;
			int levelRequired = 80;
			int defenceAbility = 215;
			int healthBonus = 8;
			int strengthBonus = 8;
			int dexterityBonus = 8;
			int intelligenceBonus = 8;
			int magicPowerBonus = 8;
			int HPBonus = 300;
			int flameResistance = 10;
			int glacierResistance = 10;
			int thunderResistance = 10;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +6
	public static ItemStack divinePauldronLvl6() {
		
			// ** Variables
			int level = 6;
			int levelRequired = 80;
			int defenceAbility = 224;
			int healthBonus = 10;
			int strengthBonus = 10;
			int dexterityBonus = 10;
			int intelligenceBonus = 10;
			int magicPowerBonus = 10;
			int HPBonus = 350;
			int flameResistance = 12;
			int glacierResistance = 12;
			int thunderResistance = 12;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +7
	public static ItemStack divinePauldronLvl7() {
		
			// ** Variables
			int level = 7;
			int levelRequired = 80;
			int defenceAbility = 233;
			int healthBonus = 12;
			int strengthBonus = 12;
			int dexterityBonus = 12;
			int intelligenceBonus = 12;
			int magicPowerBonus = 12;
			int HPBonus = 400;
			int flameResistance = 14;
			int glacierResistance = 14;
			int thunderResistance = 14;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +8
	public static ItemStack divinePauldronLvl8() {
		
			// ** Variables
			int level = 8;
			int levelRequired = 80;
			int defenceAbility = 242;
			int healthBonus = 14;
			int strengthBonus = 14;
			int dexterityBonus = 14;
			int intelligenceBonus = 14;
			int magicPowerBonus = 14;
			int HPBonus = 450;
			int flameResistance = 16;
			int glacierResistance = 16;
			int thunderResistance = 16;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +9
	public static ItemStack divinePauldronLvl9() {
		
			// ** Variables
			int level = 9;
			int levelRequired = 80;
			int defenceAbility = 251;
			int healthBonus = 16;
			int strengthBonus = 16;
			int dexterityBonus = 16;
			int intelligenceBonus = 16;
			int magicPowerBonus = 16;
			int HPBonus = 500;
			int flameResistance = 18;
			int glacierResistance = 18;
			int thunderResistance = 18;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Pauldron +10
	public static ItemStack divinePauldronLvl10() {
		
			// ** Variables
			int level = 10;
			int levelRequired = 80;
			int defenceAbility = 260;
			int healthBonus = 18;
			int strengthBonus = 18;
			int dexterityBonus = 18;
			int intelligenceBonus = 18;
			int magicPowerBonus = 18;
			int HPBonus = 550;
			int flameResistance = 20;
			int glacierResistance = 20;
			int thunderResistance = 20;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pauldron (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads
	
	// ** Chaos Pads +1
	public static ItemStack divinePadsLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 156;
		int healthBonus = 2;
		int strengthBonus = 2;
		int dexterityBonus = 2;
		int intelligenceBonus = 2;
		int magicPowerBonus = 2;
		int HPBonus = 100;
		int flameResistance = 2;
		int glacierResistance = 2;
		int thunderResistance = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Pads +2
	public static ItemStack divinePadsLvl2() {
		
			// ** Variables
			int level = 2;
			int levelRequired = 80;
			int defenceAbility = 160;
			int healthBonus = 2;
			int strengthBonus = 2;
			int dexterityBonus = 2;
			int intelligenceBonus = 2;
			int magicPowerBonus = 2;
			int HPBonus = 150;
			int flameResistance = 4;
			int glacierResistance = 4;
			int thunderResistance = 4;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +3
	public static ItemStack divinePadsLvl3() {
		
			// ** Variables
			int level = 3;
			int levelRequired = 80;
			int defenceAbility = 164;
			int healthBonus = 4;
			int strengthBonus = 4;
			int dexterityBonus = 4;
			int intelligenceBonus = 4;
			int magicPowerBonus = 4;
			int HPBonus = 200;
			int flameResistance = 6;
			int glacierResistance = 6;
			int thunderResistance = 6;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +4
	public static ItemStack divinePadsLvl4() {
		
			// ** Variables
			int level = 4;
			int levelRequired = 80;
			int defenceAbility = 168;
			int healthBonus = 6;
			int strengthBonus = 6;
			int dexterityBonus = 6;
			int intelligenceBonus = 6;
			int magicPowerBonus = 6;
			int HPBonus = 250;
			int flameResistance = 8;
			int glacierResistance = 8;
			int thunderResistance = 8;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +5
	public static ItemStack divinePadsLvl5() {
		
			// ** Variables
			int level = 5;
			int levelRequired = 80;
			int defenceAbility = 172;
			int healthBonus = 8;
			int strengthBonus = 8;
			int dexterityBonus = 8;
			int intelligenceBonus = 8;
			int magicPowerBonus = 8;
			int HPBonus = 300;
			int flameResistance = 10;
			int glacierResistance = 10;
			int thunderResistance = 10;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +6
	public static ItemStack divinePadsLvl6() {
		
			// ** Variables
			int level = 6;
			int levelRequired = 80;
			int defenceAbility = 176;
			int healthBonus = 10;
			int strengthBonus = 10;
			int dexterityBonus = 10;
			int intelligenceBonus = 10;
			int magicPowerBonus = 10;
			int HPBonus = 350;
			int flameResistance = 12;
			int glacierResistance = 12;
			int thunderResistance = 12;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +7
	public static ItemStack divinePadsLvl7() {
		
			// ** Variables
			int level = 7;
			int levelRequired = 80;
			int defenceAbility = 180;
			int healthBonus = 12;
			int strengthBonus = 12;
			int dexterityBonus = 12;
			int intelligenceBonus = 12;
			int magicPowerBonus = 12;
			int HPBonus = 400;
			int flameResistance = 14;
			int glacierResistance = 14;
			int thunderResistance = 14;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +8
	public static ItemStack divinePadsLvl8() {
		
			// ** Variables
			int level = 8;
			int levelRequired = 80;
			int defenceAbility = 184;
			int healthBonus = 14;
			int strengthBonus = 14;
			int dexterityBonus = 14;
			int intelligenceBonus = 14;
			int magicPowerBonus = 14;
			int HPBonus = 450;
			int flameResistance = 16;
			int glacierResistance = 16;
			int thunderResistance = 16;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +9
	public static ItemStack divinePadsLvl9() {
		
			// ** Variables
			int level = 9;
			int levelRequired = 80;
			int defenceAbility = 188;
			int healthBonus = 16;
			int strengthBonus = 16;
			int dexterityBonus = 16;
			int intelligenceBonus = 16;
			int magicPowerBonus = 16;
			int HPBonus = 500;
			int flameResistance = 18;
			int glacierResistance = 18;
			int thunderResistance = 18;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Pads +10
	public static ItemStack divinePadsLvl10() {
		
			// ** Variables
			int level = 10;
			int levelRequired = 80;
			int defenceAbility = 192;
			int healthBonus = 18;
			int strengthBonus = 18;
			int dexterityBonus = 18;
			int intelligenceBonus = 18;
			int magicPowerBonus = 18;
			int HPBonus = 550;
			int flameResistance = 20;
			int glacierResistance = 20;
			int thunderResistance = 20;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Pads (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
	
	// ** Chaos Boots
	
	// ** Chaos Boots +1
	public static ItemStack divineBootsLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 92;
		int healthBonus = 2;
		int strengthBonus = 2;
		int dexterityBonus = 2;
		int intelligenceBonus = 2;
		int magicPowerBonus = 2;
		int HPBonus = 100;
		int flameResistance = 2;
		int glacierResistance = 2;
		int thunderResistance = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
	
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Chaos Boots +2
	public static ItemStack divineBootsLvl2() {
		
			// ** Variables
			int level = 2;
			int levelRequired = 80;
			int defenceAbility = 94;
			int healthBonus = 2;
			int strengthBonus = 2;
			int dexterityBonus = 2;
			int intelligenceBonus = 2;
			int magicPowerBonus = 2;
			int HPBonus = 150;
			int flameResistance = 4;
			int glacierResistance = 4;
			int thunderResistance = 4;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +3
	public static ItemStack divineBootsLvl3() {
		
			// ** Variables
			int level = 3;
			int levelRequired = 80;
			int defenceAbility = 96;
			int healthBonus = 4;
			int strengthBonus = 4;
			int dexterityBonus = 4;
			int intelligenceBonus = 4;
			int magicPowerBonus = 4;
			int HPBonus = 200;
			int flameResistance = 6;
			int glacierResistance = 6;
			int thunderResistance = 6;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +4
	public static ItemStack divineBootsLvl4() {
		
			// ** Variables
			int level = 4;
			int levelRequired = 80;
			int defenceAbility = 98;
			int healthBonus = 6;
			int strengthBonus = 6;
			int dexterityBonus = 6;
			int intelligenceBonus = 6;
			int magicPowerBonus = 6;
			int HPBonus = 250;
			int flameResistance = 8;
			int glacierResistance = 8;
			int thunderResistance = 8;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +5
	public static ItemStack divineBootsLvl5() {
		
			// ** Variables
			int level = 5;
			int levelRequired = 80;
			int defenceAbility = 100;
			int healthBonus = 8;
			int strengthBonus = 8;
			int dexterityBonus = 8;
			int intelligenceBonus = 8;
			int magicPowerBonus = 8;
			int HPBonus = 300;
			int flameResistance = 10;
			int glacierResistance = 10;
			int thunderResistance = 10;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +6
	public static ItemStack divineBootsLvl6() {
		
			// ** Variables
			int level = 6;
			int levelRequired = 80;
			int defenceAbility = 102;
			int healthBonus = 10;
			int strengthBonus = 10;
			int dexterityBonus = 10;
			int intelligenceBonus = 10;
			int magicPowerBonus = 10;
			int HPBonus = 350;
			int flameResistance = 12;
			int glacierResistance = 12;
			int thunderResistance = 12;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +7
	public static ItemStack divineBootsLvl7() {
		
			// ** Variables
			int level = 7;
			int levelRequired = 80;
			int defenceAbility = 104;
			int healthBonus = 12;
			int strengthBonus = 12;
			int dexterityBonus = 12;
			int intelligenceBonus = 12;
			int magicPowerBonus = 12;
			int HPBonus = 400;
			int flameResistance = 14;
			int glacierResistance = 14;
			int thunderResistance = 14;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +8
	public static ItemStack divineBootsLvl8() {
		
			// ** Variables
			int level = 8;
			int levelRequired = 80;
			int defenceAbility = 106;
			int healthBonus = 14;
			int strengthBonus = 14;
			int dexterityBonus = 14;
			int intelligenceBonus = 14;
			int magicPowerBonus = 14;
			int HPBonus = 450;
			int flameResistance = 16;
			int glacierResistance = 16;
			int thunderResistance = 16;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +9
	public static ItemStack divineBootsLvl9() {
		
			// ** Variables
			int level = 9;
			int levelRequired = 80;
			int defenceAbility = 108;
			int healthBonus = 16;
			int strengthBonus = 16;
			int dexterityBonus = 16;
			int intelligenceBonus = 16;
			int magicPowerBonus = 16;
			int HPBonus = 500;
			int flameResistance = 18;
			int glacierResistance = 18;
			int thunderResistance = 18;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	// ** Chaos Boots +10
	public static ItemStack divineBootsLvl10() {
		
			// ** Variables
			int level = 10;
			int levelRequired = 80;
			int defenceAbility = 110;
			int healthBonus = 18;
			int strengthBonus = 18;
			int dexterityBonus = 18;
			int intelligenceBonus = 18;
			int magicPowerBonus = 18;
			int HPBonus = 550;
			int flameResistance = 20;
			int glacierResistance = 20;
			int thunderResistance = 20;
			String itemGrade = "High";
			
			// ** Item
			ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Chaos Boots (+" + level + ")");
			meta.setUnbreakable(true);
			meta.addEnchant(Enchantment.DURABILITY, 1, false);
			meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(ChatColor.LIGHT_PURPLE + "(Legendary Item)");
			lore.add(ChatColor.GRAY + "Armor");
			lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
			lore.add(null);
			lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
			lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
			lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
			lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
			lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
			lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
			lore.add(ChatColor.GOLD + "Flame Resistance: " + flameResistance);
			lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
			lore.add(ChatColor.BLUE + "Thunder Resistance: " + thunderResistance);
			lore.add(null);
			lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
			lore.add(null);
			lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Chaos armor. *");
		
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
		
			return item;
		}
		
	

}
