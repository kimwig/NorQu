package rpg.kimwig.legends.data.items.armor.iron.fullplate;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class StrengthBonusFullPlateArmor {
	
	// ** Strength Bonus Iron Full Plate Armor
	
	// ** Strength Bonus Iron Full Plate Helmets
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 57;
		int strengthBonus = 2;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 60;
		int strengthBonus = 3;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 63;
		int strengthBonus = 4;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 66;
		int strengthBonus = 5;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 69;
		int strengthBonus = 6;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 72;
		int strengthBonus = 7;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 76;
		int strengthBonus = 9;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 80;
		int strengthBonus = 11;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 84;
		int strengthBonus = 13;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Helmet
	public static ItemStack strengthFullPlateHelmetLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 89;
		int strengthBonus = 16;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** StrengthBonus Full Plate Pauldrons
	
	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 98;
		int strengthBonus = 2;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 102;
		int strengthBonus = 3;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 106;
		int strengthBonus = 4;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 110;
		int strengthBonus = 5;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 114;
		int strengthBonus = 6;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 118;
		int strengthBonus = 7;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 123;
		int strengthBonus = 9;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 128;
		int strengthBonus = 11;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 133;
		int strengthBonus = 13;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** STR Iron Full Plate Pauldron
	public static ItemStack strengthFullPlatePauldronLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 139;
		int strengthBonus = 16;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** StrengthBonus Full Plate Pads
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 76;
		int strengthBonus = 2;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 79;
		int strengthBonus = 3;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 82;
		int strengthBonus = 4;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 85;
		int strengthBonus = 5;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 88;
		int strengthBonus = 6;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 91;
		int strengthBonus = 7;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 95;
		int strengthBonus = 9;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 99;
		int strengthBonus = 11;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 103;
		int strengthBonus = 13;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Iron Full Plate Pads
	public static ItemStack strengthFullPlatePadsLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 108;
		int strengthBonus = 16;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** StrengthBonus Full Plate Boots
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 38;
		int strengthBonus = 2;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 41;
		int strengthBonus = 3;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 44;
		int strengthBonus = 4;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 47;
		int strengthBonus = 5;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 50;
		int strengthBonus = 6;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 53;
		int strengthBonus = 7;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 57;
		int strengthBonus = 9;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 61;
		int strengthBonus = 11;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 65;
		int strengthBonus = 13;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** STR Full Plate Boots
	public static ItemStack strengthFullPlateBootsLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 70;
		int strengthBonus = 16;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Full Plate Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Full Plate armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
}
