package rpg.kimwig.legends.data.items.armor.chaos;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class DexterityBonusChaosArmor {
	
	// ** Chaos Armor
	
	// ** Chaos Helmets
	
	// ** Chaos Helmet +1
	public static ItemStack chaosHelmetLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 100;
		int dexterityBonus = 2;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl2() {
	
		// ** Variables
		int level = 2;
		int levelRequired = 80;
		int defenceAbility = 102;
		int dexterityBonus = 4;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl3() {
	
		// ** Variables
		int level = 3;
		int levelRequired = 80;
		int defenceAbility = 104;
		int dexterityBonus = 8;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl4() {
	
		// ** Variables
		int level = 4;
		int levelRequired = 80;
		int defenceAbility = 106;
		int dexterityBonus = 12;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl5() {
	
		// ** Variables
		int level = 5;
		int levelRequired = 80;
		int defenceAbility = 108;
		int dexterityBonus = 16;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl6() {
	
		// ** Variables
		int level = 6;
		int levelRequired = 80;
		int defenceAbility = 110;
		int dexterityBonus = 20;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl7() {
	
		// ** Variables
		int level = 7;
		int levelRequired = 80;
		int defenceAbility = 226;
		int dexterityBonus = 24;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl8() {
	
		// ** Variables
		int level = 8;
		int levelRequired = 80;
		int defenceAbility = 114;
		int dexterityBonus = 28;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl9() {
	
		// ** Variables
		int level = 9;
		int levelRequired = 80;
		int defenceAbility = 116;
		int dexterityBonus = 32;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosHelmetLvl10() {
	
		// ** Variables
		int level = 10;
		int levelRequired = 80;
		int defenceAbility = 118;
		int dexterityBonus = 40;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 179;
		int dexterityBonus = 2;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl2() {
		
			// ** Variables
			int level = 2;
			int levelRequired = 80;
			int defenceAbility = 188;
			int dexterityBonus = 4;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl3() {
		
			// ** Variables
			int level = 3;
			int levelRequired = 80;
			int defenceAbility = 197;
			int dexterityBonus = 8;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl4() {
		
			// ** Variables
			int level = 4;
			int levelRequired = 80;
			int defenceAbility = 206;
			int dexterityBonus = 12;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl5() {
		
			// ** Variables
			int level = 5;
			int levelRequired = 80;
			int defenceAbility = 215;
			int dexterityBonus = 16;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl6() {
		
			// ** Variables
			int level = 6;
			int levelRequired = 80;
			int defenceAbility = 224;
			int dexterityBonus = 20;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl7() {
		
			// ** Variables
			int level = 7;
			int levelRequired = 80;
			int defenceAbility = 315;
			int dexterityBonus = 24;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl8() {
		
			// ** Variables
			int level = 8;
			int levelRequired = 80;
			int defenceAbility = 242;
			int dexterityBonus = 28;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl9() {
		
			// ** Variables
			int level = 9;
			int levelRequired = 80;
			int defenceAbility = 251;
			int dexterityBonus = 32;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPauldronLvl10() {
		
			// ** Variables
			int level = 10;
			int levelRequired = 80;
			int defenceAbility = 260;
			int dexterityBonus = 40;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 156;
		int dexterityBonus = 2;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl2() {
		
			// ** Variables
			int level = 2;
			int levelRequired = 80;
			int defenceAbility = 160;
			int dexterityBonus = 4;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl3() {
		
			// ** Variables
			int level = 3;
			int levelRequired = 80;
			int defenceAbility = 164;
			int dexterityBonus = 8;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl4() {
		
			// ** Variables
			int level = 4;
			int levelRequired = 80;
			int defenceAbility = 168;
			int dexterityBonus = 12;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl5() {
		
			// ** Variables
			int level = 5;
			int levelRequired = 80;
			int defenceAbility = 172;
			int dexterityBonus = 16;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl6() {
		
			// ** Variables
			int level = 6;
			int levelRequired = 80;
			int defenceAbility = 176;
			int dexterityBonus = 20;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl7() {
		
			// ** Variables
			int level = 7;
			int levelRequired = 80;
			int defenceAbility = 282;
			int dexterityBonus = 24;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl8() {
		
			// ** Variables
			int level = 8;
			int levelRequired = 80;
			int defenceAbility = 184;
			int dexterityBonus = 28;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl9() {
		
			// ** Variables
			int level = 9;
			int levelRequired = 80;
			int defenceAbility = 188;
			int dexterityBonus = 32;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosPadsLvl10() {
		
			// ** Variables
			int level = 10;
			int levelRequired = 80;
			int defenceAbility = 192;
			int dexterityBonus = 40;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl1() {
	
		// ** Variables
		int level = 1;
		int levelRequired = 80;
		int defenceAbility = 92;
		int dexterityBonus = 2;
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
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl2() {
		
			// ** Variables
			int level = 2;
			int levelRequired = 80;
			int defenceAbility = 94;
			int dexterityBonus = 4;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl3() {
		
			// ** Variables
			int level = 3;
			int levelRequired = 80;
			int defenceAbility = 96;
			int dexterityBonus = 8;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl4() {
		
			// ** Variables
			int level = 4;
			int levelRequired = 80;
			int defenceAbility = 98;
			int dexterityBonus = 12;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl5() {
		
			// ** Variables
			int level = 5;
			int levelRequired = 80;
			int defenceAbility = 100;
			int dexterityBonus = 16;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl6() {
		
			// ** Variables
			int level = 6;
			int levelRequired = 80;
			int defenceAbility = 102;
			int dexterityBonus = 20;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl7() {
		
			// ** Variables
			int level = 7;
			int levelRequired = 80;
			int defenceAbility = 205;
			int dexterityBonus = 24;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl8() {
		
			// ** Variables
			int level = 8;
			int levelRequired = 80;
			int defenceAbility = 106;
			int dexterityBonus = 28;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl9() {
		
			// ** Variables
			int level = 9;
			int levelRequired = 80;
			int defenceAbility = 108;
			int dexterityBonus = 32;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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
	public static ItemStack chaosBootsLvl10() {
		
			// ** Variables
			int level = 10;
			int levelRequired = 80;
			int defenceAbility = 110;
			int dexterityBonus = 40;
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
			lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
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