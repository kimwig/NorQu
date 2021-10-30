package rpg.kimwig.legends.data.items.weapons.swords.highgrade;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class MirageSword {
	
	// ** Mirage Sword
	
	
	
	// ** Mirage Sword +1
	public static ItemStack mirageSwordLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Warrior & Priest";
		int attackPower = 123;
		String attackSpeed = "Slow";
		int flameDamage = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +2
	public static ItemStack mirageSwordLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Warrior & Priest";
		int attackPower = 129;
		String attackSpeed = "Slow";
		int flameDamage = 20;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +3
	public static ItemStack mirageSwordLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Warrior & Priest";
		int attackPower = 135;
		String attackSpeed = "Slow";
		int flameDamage = 30;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +4
	public static ItemStack mirageSwordLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Warrior & Priest";
		int attackPower = 141;
		String attackSpeed = "Slow";
		int flameDamage = 40;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +5
	public static ItemStack mirageSwordLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Warrior & Priest";
		int attackPower = 147;
		String attackSpeed = "Slow";
		int flameDamage = 50;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +6
	public static ItemStack mirageSwordLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Warrior & Priest";
		int attackPower = 153;
		String attackSpeed = "Slow";
		int flameDamage = 60;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +7
	public static ItemStack mirageSwordLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Warrior & Priest";
		int attackPower = 161;
		String attackSpeed = "Slow";
		int flameDamage = 70;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +8
	public static ItemStack mirageSwordLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Warrior & Priest";
		int attackPower = 169;
		String attackSpeed = "Slow";
		int flameDamage = 80;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +9
	public static ItemStack mirageSwordLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Warrior & Priest";
		int attackPower = 177;
		String attackSpeed = "Slow";
		int flameDamage = 90;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Sword +10
	public static ItemStack mirageSwordLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Warrior & Priest";
		int attackPower = 187;
		String attackSpeed = "Slow";
		int flameDamage = 105;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Sword (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000005);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Two-handed Sword");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Deadly mirror blade. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
