package rpg.kimwig.legends.data.items.weapons.daggers.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ColdHearted {
	
	// ** Cold-Hearted
	
	
	
	// ** Cold-Hearted +1
	public static ItemStack coldHeartedLvl1() {
		
		// ** Variables
		int level = 1;
		String weaponClass = "Assassin";
		int attackPower = 99;
		String attackSpeed = "Fast";
		int glacierDamage = 60;
		int dexterityBonus = 2;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +2
	public static ItemStack coldHeartedLvl2() {
		
		// ** Variables
		int level = 2;
		String weaponClass = "Assassin";
		int attackPower = 110;
		String attackSpeed = "Fast";
		int glacierDamage = 79;
		int dexterityBonus = 3;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +3
	public static ItemStack coldHeartedLvl3() {
		
		// ** Variables
		int level = 3;
		String weaponClass = "Assassin";
		int attackPower = 121;
		String attackSpeed = "Fast";
		int glacierDamage = 98;
		int dexterityBonus = 4;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +4
	public static ItemStack coldHeartedLvl4() {
		
		// ** Variables
		int level = 4;
		String weaponClass = "Assassin";
		int attackPower = 132;
		String attackSpeed = "Fast";
		int glacierDamage = 117;
		int dexterityBonus = 5;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +5
	public static ItemStack coldHeartedLvl5() {
		
		// ** Variables
		int level = 5;
		String weaponClass = "Assassin";
		int attackPower = 143;
		String attackSpeed = "Fast";
		int glacierDamage = 136;
		int dexterityBonus = 6;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +6
	public static ItemStack coldHeartedLvl6() {
		
		// ** Variables
		int level = 6;
		String weaponClass = "Assassin";
		int attackPower = 154;
		String attackSpeed = "Fast";
		int glacierDamage = 155;
		int dexterityBonus = 8;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +7
	public static ItemStack coldHeartedLvl7() {
		
		// ** Variables
		int level = 7;
		String weaponClass = "Assassin";
		int attackPower = 167;
		String attackSpeed = "Fast";
		int glacierDamage = 177;
		int dexterityBonus = 10;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +8
	public static ItemStack coldHeartedLvl8() {
		
		// ** Variables
		int level = 8;
		String weaponClass = "Assassin";
		int attackPower = 179;
		String attackSpeed = "Fast";
		int glacierDamage = 197;
		int dexterityBonus = 11;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +9
	public static ItemStack coldHeartedLvl9() {
		
		// ** Variables
		int level = 9;
		String weaponClass = "Assassin";
		int attackPower = 189;
		String attackSpeed = "Fast";
		int glacierDamage = 219;
		int dexterityBonus = 12;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Cold-Hearted +10
	public static ItemStack coldHeartedLvl10() {
		
		// ** Variables
		int level = 10;
		String weaponClass = "Assassin";
		int attackPower = 201;
		String attackSpeed = "Fast";
		int glacierDamage = 248;
		int dexterityBonus = 15;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Cold-Hearted (+" + level + ")");
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
		lore.add(ChatColor.AQUA + "Glacier Damage: " + glacierDamage);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*" + ChatColor.AQUA + "" + ChatColor.ITALIC + 
				" You have no heart. " + ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "*");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
}
