package rpg.kimwig.legends.data.items.smycken.belts.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class SkeletonBelt {
	
	// ** Skeleton Belt
	
	
	
	// ** Skeleton Belt +1
	public static ItemStack skeletonBeltLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 29;
		int damageResistance = 10;
		int glacierResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +2
	public static ItemStack skeletonBeltLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 32;
		int damageResistance = 11;
		int glacierResistance = 33;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +3
	public static ItemStack skeletonBeltLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 35;
		int damageResistance = 12;
		int glacierResistance = 36;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +4
	public static ItemStack skeletonBeltLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 38;
		int damageResistance = 13;
		int glacierResistance = 39;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +5
	public static ItemStack skeletonBeltLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 41;
		int damageResistance = 14;
		int glacierResistance = 42;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +6
	public static ItemStack skeletonBeltLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 44;
		int damageResistance = 15;
		int glacierResistance = 45;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +7
	public static ItemStack skeletonBeltLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 47;
		int damageResistance = 16;
		int glacierResistance = 48;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +8
	public static ItemStack skeletonBeltLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 50;
		int damageResistance = 17;
		int glacierResistance = 51;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +9
	public static ItemStack skeletonBeltLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 53;
		int damageResistance = 19;
		int glacierResistance = 54;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Skeleton Belt +10
	public static ItemStack skeletonBeltLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 59;
		int damageResistance = 22;
		int glacierResistance = 58;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Skeleton Belt (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
