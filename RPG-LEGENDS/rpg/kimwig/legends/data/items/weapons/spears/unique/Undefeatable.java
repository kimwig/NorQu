package rpg.kimwig.legends.data.items.weapons.spears.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Undefeatable {
	
	// ** Undefeatable
	
	
	
	// ** Undefeatable +1
	public static ItemStack undefeatableLvl1() {
		
		// ** Variables
		int level = 1;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 137;
		String attackSpeed = "Slow";
		int flameDamage = 30;
		int strengthBonus = 15;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +2
	public static ItemStack undefeatableLvl2() {
		
		// ** Variables
		int level = 2;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 145;
		String attackSpeed = "Slow";
		int flameDamage = 45;
		int strengthBonus = 17;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +3
	public static ItemStack undefeatableLvl3() {
		
		// ** Variables
		int level = 3;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 153;
		String attackSpeed = "Slow";
		int flameDamage = 60;
		int strengthBonus = 19;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +4
	public static ItemStack undefeatableLvl4() {
		
		// ** Variables
		int level = 4;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 161;
		String attackSpeed = "Slow";
		int flameDamage = 75;
		int strengthBonus = 21;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +5
	public static ItemStack undefeatableLvl5() {
		
		// ** Variables
		int level = 5;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 169;
		String attackSpeed = "Slow";
		int flameDamage = 90;
		int strengthBonus = 23;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +6
	public static ItemStack undefeatableLvl6() {
		
		// ** Variables
		int level = 6;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 177;
		String attackSpeed = "Slow";
		int flameDamage = 105;
		int strengthBonus = 25;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +7
	public static ItemStack undefeatableLvl7() {
		
		// ** Variables
		int level = 7;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 187;
		String attackSpeed = "Slow";
		int flameDamage = 120;
		int strengthBonus = 28;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +8
	public static ItemStack undefeatableLvl8() {
		
		// ** Variables
		int level = 8;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 195;
		String attackSpeed = "Slow";
		int flameDamage = 135;
		int strengthBonus = 30;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +9
	public static ItemStack undefeatableLvl9() {
		
		// ** Variables
		int level = 9;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 203;
		String attackSpeed = "Slow";
		int flameDamage = 150;
		int strengthBonus = 32;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Undefeatable +10
	public static ItemStack undefeatableLvl10() {
		
		// ** Variables
		int level = 10;
		int levelRequired = 70;
		String weaponClass = "Warrior";
		int attackPower = 214;
		String attackSpeed = "Slow";
		int flameDamage = 170;
		int strengthBonus = 35;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Undefeatable (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000020);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Spear");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.GOLD + "Flame Damage: " + flameDamage);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.GOLD + "" + ChatColor.ITALIC + " Cursed illusion makes");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "them think they are");
		lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "undefeatable.. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
}
