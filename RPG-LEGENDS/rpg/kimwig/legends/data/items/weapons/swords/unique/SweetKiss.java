package rpg.kimwig.legends.data.items.weapons.swords.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class SweetKiss {
	
	// ** Sweet Kiss
	
	// ** Sweet Kiss +1
	public static ItemStack sweetKissLvl1() {
		
		// ** Variables
		int level = 1;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 141;
		String attackSpeed = "Slow";
		int thunderDamage = 40;
		int strengthBonus = 1;
		int intelligenceBonus = 1;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +2
	public static ItemStack sweetKissLvl2() {
		
		// ** Variables
		int level = 2;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 149;
		String attackSpeed = "Slow";
		int thunderDamage = 55;
		int strengthBonus = 3;
		int intelligenceBonus = 3;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +3
	public static ItemStack sweetKissLvl3() {
		
		// ** Variables
		int level = 3;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 157;
		String attackSpeed = "Slow";
		int thunderDamage = 70;
		int strengthBonus = 5;
		int intelligenceBonus = 5;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +4
	public static ItemStack sweetKissLvl4() {
		
		// ** Variables
		int level = 4;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 165;
		String attackSpeed = "Slow";
		int thunderDamage = 85;
		int strengthBonus = 7;
		int intelligenceBonus = 7;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +5
	public static ItemStack sweetKissLvl5() {
		
		// ** Variables
		int level = 5;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 173;
		String attackSpeed = "Slow";
		int thunderDamage = 100;
		int strengthBonus = 9;
		int intelligenceBonus = 9;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +6
	public static ItemStack sweetKissLvl6() {
		
		// ** Variables
		int level = 6;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 181;
		String attackSpeed = "Slow";
		int thunderDamage = 115;
		int strengthBonus = 11;
		int intelligenceBonus = 11;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +7
	public static ItemStack sweetKissLvl7() {
		
		// ** Variables
		int level = 7;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 191;
		String attackSpeed = "Slow";
		int thunderDamage = 130;
		int strengthBonus = 14;
		int intelligenceBonus = 14;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +8
	public static ItemStack sweetKissLvl8() {
		
		// ** Variables
		int level = 8;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 201;
		String attackSpeed = "Slow";
		int thunderDamage = 145;
		int strengthBonus = 17;
		int intelligenceBonus = 17;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +9
	public static ItemStack sweetKissLvl9() {
		
		// ** Variables
		int level = 9;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 211;
		String attackSpeed = "Slow";
		int thunderDamage = 160;
		int strengthBonus = 20;
		int intelligenceBonus = 20;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Sweet Kiss +10
	public static ItemStack sweetKissLvl10() {
		
		// ** Variables
		int level = 10;
		int levelRequired = 70;
		String weaponClass = "Warrior & Priest";
		int attackPower = 223;
		String attackSpeed = "Slow";
		int thunderDamage = 180;
		int strengthBonus = 25;
		int intelligenceBonus = 25;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Sweet Kiss (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000010);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.RED + "" + ChatColor.ITALIC + " Kiss. "
				+ ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
