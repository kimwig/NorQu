package rpg.kimwig.legends.data.items.weapons.bows.highgrade;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class IronBow {
	
	// ** Iron Bow
	
	
	
	// ** Iron Bow +1
	public static ItemStack ironBowLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Archer";
		int attackPower = 93;
		String attackSpeed = "Slow";
		int poisonDamage = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +2
	public static ItemStack ironBowLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Archer";
		int attackPower = 97;
		String attackSpeed = "Slow";
		int poisonDamage = 20;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +3
	public static ItemStack ironBowLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Archer";
		int attackPower = 101;
		String attackSpeed = "Slow";
		int poisonDamage = 30;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +4
	public static ItemStack ironBowLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Archer";
		int attackPower = 105;
		String attackSpeed = "Slow";
		int poisonDamage = 40;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +5
	public static ItemStack ironBowLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Archer";
		int attackPower = 109;
		String attackSpeed = "Slow";
		int poisonDamage = 50;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +6
	public static ItemStack ironBowLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Archer";
		int attackPower = 113;
		String attackSpeed = "Slow";
		int poisonDamage = 60;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +7
	public static ItemStack ironBowLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Archer";
		int attackPower = 118;
		String attackSpeed = "Slow";
		int poisonDamage = 70;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +8
	public static ItemStack ironBowLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Archer";
		int attackPower = 122;
		String attackSpeed = "Slow";
		int poisonDamage = 80;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +9
	public static ItemStack ironBowLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Archer";
		int attackPower = 126;
		String attackSpeed = "Slow";
		int poisonDamage = 90;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Bow +10
	public static ItemStack ironBowLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Archer";
		int attackPower = 131;
		String attackSpeed = "Slow";
		int poisonDamage = 100;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Iron Bow (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000042);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);

		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Bow");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Powerful bow. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
