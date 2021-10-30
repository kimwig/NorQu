package rpg.kimwig.legends.data.items.smycken.belts.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class JudiciousBelt {
	
	// ** Judicious Belt
	
	
	
	// ** Judicious Belt +1
	public static ItemStack judiciousBeltLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 2;
		int dexterityBonus = 12;
		int HPBonus = 50;
		int glacierResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +2
	public static ItemStack judiciousBeltLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 3;
		int dexterityBonus = 15;
		int HPBonus = 75;
		int glacierResistance = 33;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +3
	public static ItemStack judiciousBeltLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 4;
		int dexterityBonus = 18;
		int HPBonus = 100;
		int glacierResistance = 36;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +4
	public static ItemStack judiciousBeltLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 5;
		int dexterityBonus = 21;
		int HPBonus = 125;
		int glacierResistance = 39;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +5
	public static ItemStack judiciousBeltLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 6;
		int dexterityBonus = 24;
		int HPBonus = 150;
		int glacierResistance = 42;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +6
	public static ItemStack judiciousBeltLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 7;
		int dexterityBonus = 27;
		int HPBonus = 175;
		int glacierResistance = 45;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +7
	public static ItemStack judiciousBeltLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 10;
		int dexterityBonus = 31;
		int HPBonus = 200;
		int glacierResistance = 50;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +8
	public static ItemStack judiciousBeltLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 13;
		int dexterityBonus = 35;
		int HPBonus = 250;
		int glacierResistance = 55;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +9
	public static ItemStack judiciousBeltLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 16;
		int dexterityBonus = 39;
		int HPBonus = 300;
		int glacierResistance = 60;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Judicious Belt +10
	public static ItemStack judiciousBeltLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 20;
		int dexterityBonus = 44;
		int HPBonus = 400;
		int glacierResistance = 70;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Judicious Belt (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000003);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Belt");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + HPBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
