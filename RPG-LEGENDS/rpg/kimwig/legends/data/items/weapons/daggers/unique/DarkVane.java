package rpg.kimwig.legends.data.items.weapons.daggers.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class DarkVane {
	
	// ** Dark Vane
	
	
	
	// ** Dark Vane +1
	public static ItemStack darkVaneLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Assassin";
		int attackPower = 99;
		String attackSpeed = "Fast";
		int thunderDamage = 45;
		int dexterityBonus = 8;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +2
	public static ItemStack darkVaneLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Assassin";
		int attackPower = 110;
		String attackSpeed = "Fast";
		int thunderDamage = 60;
		int dexterityBonus = 9;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +3
	public static ItemStack darkVaneLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Assassin";
		int attackPower = 121;
		String attackSpeed = "Fast";
		int thunderDamage = 75;
		int dexterityBonus = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +4
	public static ItemStack darkVaneLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Assassin";
		int attackPower = 132;
		String attackSpeed = "Fast";
		int thunderDamage = 90;
		int dexterityBonus = 11;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +5
	public static ItemStack darkVaneLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Assassin";
		int attackPower = 143;
		String attackSpeed = "Fast";
		int thunderDamage = 105;
		int dexterityBonus = 12;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +6
	public static ItemStack darkVaneLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Assassin";
		int attackPower = 154;
		String attackSpeed = "Fast";
		int thunderDamage = 120;
		int dexterityBonus = 13;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +7
	public static ItemStack darkVaneLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Assassin";
		int attackPower = 167;
		String attackSpeed = "Fast";
		int thunderDamage = 135;
		int dexterityBonus = 15;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +8
	public static ItemStack darkVaneLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Assassin";
		int attackPower = 179;
		String attackSpeed = "Fast";
		int thunderDamage = 150;
		int dexterityBonus = 17;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +9
	public static ItemStack darkVaneLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Assassin";
		int attackPower = 190;
		String attackSpeed = "Fast";
		int thunderDamage = 165;
		int dexterityBonus = 19;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dark Vane +10
	public static ItemStack darkVaneLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Assassin";
		int attackPower = 201;
		String attackSpeed = "Fast";
		int thunderDamage = 185;
		int dexterityBonus = 23;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Dark Vane (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.BLUE + "Thunder Damage: " + thunderDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Made by dark elves," );
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "said to kill in one hit. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + " *" );
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
