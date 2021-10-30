package rpg.kimwig.legends.data.items.weapons.axes.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class Avedon {
	
	// ** Avedon
	
	
	
	// ** Avedon +1
	public static ItemStack avedonLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Warrior";
		int attackPower = 124;
		String attackSpeed = "Slow";
		int glacierDamage = 20;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +2
	public static ItemStack avedonLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Warrior";
		int attackPower = 131;
		String attackSpeed = "Slow";
		int glacierDamage = 25;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +3
	public static ItemStack avedonLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Warrior";
		int attackPower = 138;
		String attackSpeed = "Slow";
		int glacierDamage = 30;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +4
	public static ItemStack avedonLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Warrior";
		int attackPower = 145;
		String attackSpeed = "Slow";
		int glacierDamage = 35;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +5
	public static ItemStack avedonLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Warrior";
		int attackPower = 152;
		String attackSpeed = "Slow";
		int glacierDamage = 40;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +6
	public static ItemStack avedonLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Warrior";
		int attackPower = 159;
		String attackSpeed = "Slow";
		int glacierDamage = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +7
	public static ItemStack avedonLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Warrior";
		int attackPower = 167;
		String attackSpeed = "Slow";
		int glacierDamage = 50;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +8
	public static ItemStack avedonLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Warrior";
		int attackPower = 174;
		String attackSpeed = "Slow";
		int glacierDamage = 55;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +9
	public static ItemStack avedonLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Warrior";
		int attackPower = 181;
		String attackSpeed = "Slow";
		int glacierDamage = 60;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Avedon +10
	public static ItemStack avedonLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Warrior";
		int attackPower = 189;
		String attackSpeed = "Slow";
		int glacierDamage = 65;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Avedon (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000027);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Two-handed Axe");
		lore.add(ChatColor.DARK_GRAY + weaponClass);
		lore.add(null);
		lore.add(ChatColor.WHITE + "Attack Power: " + attackPower);
		lore.add(ChatColor.WHITE + "Attack Speed: " + attackSpeed);
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.DARK_AQUA + "" + ChatColor.ITALIC +  " Crafted to create");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "destruction in the world. " + ChatColor.DARK_GRAY + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
