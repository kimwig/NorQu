package rpg.kimwig.legends.data.items.weapons.spears.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class MurkyWater {
	
	// ** Murky Water
	
	
	
	// ** Murky Water +1
	public static ItemStack murkyWaterLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Warrior";
		int attackPower = 137;
		String attackSpeed = "Very Slow";
		int flameDamage = 50;
		int strengthBonus = 1;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +2
	public static ItemStack murkyWaterLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Warrior";
		int attackPower = 143;
		String attackSpeed = "Very Slow";
		int flameDamage = 60;
		int strengthBonus = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +3
	public static ItemStack murkyWaterLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Warrior";
		int attackPower = 149;
		String attackSpeed = "Very Slow";
		int flameDamage = 70;
		int strengthBonus = 3;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +4
	public static ItemStack murkyWaterLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Warrior";
		int attackPower = 155;
		String attackSpeed = "Very Slow";
		int flameDamage = 80;
		int strengthBonus = 4;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +5
	public static ItemStack murkyWaterLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Warrior";
		int attackPower = 161;
		String attackSpeed = "Very Slow";
		int flameDamage = 90;
		int strengthBonus = 5;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +6
	public static ItemStack murkyWaterLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Warrior";
		int attackPower = 167;
		String attackSpeed = "Very Slow";
		int flameDamage = 100;
		int strengthBonus = 6;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +7
	public static ItemStack murkyWaterLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Warrior";
		int attackPower = 173;
		String attackSpeed = "Very Slow";
		int flameDamage = 110;
		int strengthBonus = 8;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +8
	public static ItemStack murkyWaterLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Warrior";
		int attackPower = 180;
		String attackSpeed = "Very Slow";
		int flameDamage = 50;
		int strengthBonus = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +9
	public static ItemStack murkyWaterLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Warrior";
		int attackPower = 186;
		String attackSpeed = "Very Slow";
		int flameDamage = 130;
		int strengthBonus = 12;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Murky Water +10
	public static ItemStack murkyWaterLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Warrior";
		int attackPower = 192;
		String attackSpeed = "Very Slow";
		int flameDamage = 140;
		int strengthBonus = 15;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Murky Water (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000019);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.BLUE + "" + ChatColor.ITALIC + " Found in an ancient river,");
		lore.add(ChatColor.BLUE + "" + ChatColor.ITALIC + "somewhere, somehow.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
