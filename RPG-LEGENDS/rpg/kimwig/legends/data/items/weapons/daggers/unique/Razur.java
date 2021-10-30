package rpg.kimwig.legends.data.items.weapons.daggers.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Razur {
	
	// ** Razur
	
	
	
	// ** Razur +1
	public static ItemStack razurLvl1() {
		
		// ** Variables
		int level = 1;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 105;
		String attackSpeed = "Fast";
		int flameDamage = 15;
		int dexterityBonus = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +2
	public static ItemStack razurLvl2() {
		
		// ** Variables
		int level = 2;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 119;
		String attackSpeed = "Fast";
		int flameDamage = 25;
		int dexterityBonus = 3;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +3
	public static ItemStack razurLvl3() {
		
		// ** Variables
		int level = 3;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 133;
		String attackSpeed = "Fast";
		int flameDamage = 35;
		int dexterityBonus = 4;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +4
	public static ItemStack razurLvl4() {
		
		// ** Variables
		int level = 4;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 147;
		String attackSpeed = "Fast";
		int flameDamage = 45;
		int dexterityBonus = 5;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +5
	public static ItemStack razurLvl5() {
		
		// ** Variables
		int level = 5;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 161;
		String attackSpeed = "Fast";
		int flameDamage = 55;
		int dexterityBonus = 7;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +6
	public static ItemStack razurLvl6() {
		
		// ** Variables
		int level = 6;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 175;
		String attackSpeed = "Fast";
		int flameDamage = 65;
		int dexterityBonus = 9;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +7
	public static ItemStack razurLvl7() {
		
		// ** Variables
		int level = 7;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 192;
		String attackSpeed = "Fast";
		int flameDamage = 80;
		int dexterityBonus = 12;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +8
	public static ItemStack razurLvl8() {
		
		// ** Variables
		int level = 8;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 209;
		String attackSpeed = "Fast";
		int flameDamage = 95;
		int dexterityBonus = 15;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +9
	public static ItemStack razurLvl9() {
		
		// ** Variables
		int level = 9;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 226;
		String attackSpeed = "Fast";
		int flameDamage = 110;
		int dexterityBonus = 18;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Razur +10
	public static ItemStack razurLvl10() {
		
		// ** Variables
		int level = 10;
		int levelRequired = 70;
		String weaponClass = "Assassin";
		int attackPower = 246;
		String attackSpeed = "Fast";
		int flameDamage = 130;
		int dexterityBonus = 23;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Razur (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000039);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Dagger");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed dagger,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "bound to kill.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
