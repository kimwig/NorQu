package rpg.kimwig.legends.data.items.weapons.daggers.middlegrade;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class MirageDagger {
	
	// ** Mirage Dagger
	
	
	
	// ** Mirage Dagger +1
	public static ItemStack mirageDaggerLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Assassin";
		int attackPower = 92;
		String attackSpeed = "Fast";
		int poisonDamage = 15;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +2
	public static ItemStack mirageDaggerLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Assassin";
		int attackPower = 97;
		String attackSpeed = "Fast";
		int poisonDamage = 25;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +3
	public static ItemStack mirageDaggerLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Assassin";
		int attackPower = 102;
		String attackSpeed = "Fast";
		int poisonDamage = 35;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +4
	public static ItemStack mirageDaggerLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Assassin";
		int attackPower = 107;
		String attackSpeed = "Fast";
		int poisonDamage = 45;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +5
	public static ItemStack mirageDaggerLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Assassin";
		int attackPower = 112;
		String attackSpeed = "Fast";
		int poisonDamage = 55;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +6
	public static ItemStack mirageDaggerLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Assassin";
		int attackPower = 117;
		String attackSpeed = "Fast";
		int poisonDamage = 65;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +7
	public static ItemStack mirageDaggerLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Assassin";
		int attackPower = 123;
		String attackSpeed = "Fast";
		int poisonDamage = 75;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +8
	public static ItemStack mirageDaggerLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Assassin";
		int attackPower = 129;
		String attackSpeed = "Fast";
		int poisonDamage = 85;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +9
	public static ItemStack mirageDaggerLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Assassin";
		int attackPower = 135;
		String attackSpeed = "Fast";
		int poisonDamage = 95;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Mirage Dagger +10
	public static ItemStack mirageDaggerLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Assassin";
		int attackPower = 143;
		String attackSpeed = "Fast";
		int poisonDamage = 110;
		String itemGrade = "Middle";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Mirage Dagger (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000035);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.DARK_GREEN + "Poison Damage: " + poisonDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Dagger made out of");
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "mirror fragments. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
