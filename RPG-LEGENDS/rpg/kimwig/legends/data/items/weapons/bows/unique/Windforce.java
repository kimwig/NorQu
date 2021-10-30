package rpg.kimwig.legends.data.items.weapons.bows.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Windforce {
	
	// ** Windforce
	
	
	
	// ** Windforce +1
	public static ItemStack windforceLvl1() {
		
		// ** Variables
		int level = 1;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 95;
		String attackSpeed = "Slow";
		int flameDamage = 25;
		int dexterityBonus = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +2
	public static ItemStack windforceLvl2() {
		
		// ** Variables
		int level = 2;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 104;
		String attackSpeed = "Slow";
		int flameDamage = 40;
		int dexterityBonus = 12;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +3
	public static ItemStack windforceLvl3() {
		
		// ** Variables
		int level = 3;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 112;
		String attackSpeed = "Slow";
		int flameDamage = 55;
		int dexterityBonus = 14;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +4
	public static ItemStack windforceLvl4() {
		
		// ** Variables
		int level = 4;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 120;
		String attackSpeed = "Slow";
		int flameDamage = 70;
		int dexterityBonus = 16;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +5
	public static ItemStack windforceLvl5() {
		
		// ** Variables
		int level = 5;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 128;
		String attackSpeed = "Slow";
		int flameDamage = 85;
		int dexterityBonus = 18;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +6
	public static ItemStack windforceLvl6() {
		
		// ** Variables
		int level = 6;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 136;
		String attackSpeed = "Slow";
		int flameDamage = 100;
		int dexterityBonus = 20;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +7
	public static ItemStack windforceLvl7() {
		
		// ** Variables
		int level = 7;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 146;
		String attackSpeed = "Slow";
		int flameDamage = 115;
		int dexterityBonus = 23;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +8
	public static ItemStack windforceLvl8() {
		
		// ** Variables
		int level = 8;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 156;
		String attackSpeed = "Slow";
		int flameDamage = 130;
		int dexterityBonus = 26;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +9
	public static ItemStack windforceLvl9() {
		
		// ** Variables
		int level = 9;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 166;
		String attackSpeed = "Slow";
		int flameDamage = 145;
		int dexterityBonus = 29;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Windforce +10
	public static ItemStack windforceLvl10() {
		
		// ** Variables
		int level = 10;
		int levelRequired = 70;
		String weaponClass = "Archer";
		int attackPower = 179;
		String attackSpeed = "Slow";
		int flameDamage = 165;
		int dexterityBonus = 34;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Windforce (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000051);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Bow");
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
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Shoot with your mind,");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "shoot with your heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
