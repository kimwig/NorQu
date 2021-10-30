package rpg.kimwig.legends.data.items.smycken.necklaces.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class IronNecklace {
	
	// ** Iron Necklace
	
	
	
	// ** Iron Necklace +1
	public static ItemStack ironNecklaceLvl1() {
		
		// ** Variables
		int level = 1;
		int damageResistance = 10;
		int healthBonus = 20;
		int strengthBonus = 5;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +2
	public static ItemStack ironNecklaceLvl2() {
		
		// ** Variables
		int level = 2;
		int damageResistance = 11;
		int healthBonus = 22;
		int strengthBonus = 7;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +3
	public static ItemStack ironNecklaceLvl3() {
		
		// ** Variables
		int level = 3;
		int damageResistance = 12;
		int healthBonus = 24;
		int strengthBonus = 9;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +4
	public static ItemStack ironNecklaceLvl4() {
		
		// ** Variables
		int level = 4;
		int damageResistance = 13;
		int healthBonus = 26;
		int strengthBonus = 11;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +5
	public static ItemStack ironNecklaceLvl5() {
		
		// ** Variables
		int level = 5;
		int damageResistance = 14;
		int healthBonus = 28;
		int strengthBonus = 13;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +6
	public static ItemStack ironNecklaceLvl6() {
		
		// ** Variables
		int level = 6;
		int damageResistance = 15;
		int healthBonus = 30;
		int strengthBonus = 15;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +7
	public static ItemStack ironNecklaceLvl7() {
		
		// ** Variables
		int level = 7;
		int damageResistance = 16;
		int healthBonus = 32;
		int strengthBonus = 17;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +8
	public static ItemStack ironNecklaceLvl8() {
		
		// ** Variables
		int level = 8;
		int damageResistance = 17;
		int healthBonus = 34;
		int strengthBonus = 19;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +9
	public static ItemStack ironNecklaceLvl9() {
		
		// ** Variables
		int level = 9;
		int damageResistance = 18;
		int healthBonus = 36;
		int strengthBonus = 21;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Iron Necklace +10
	public static ItemStack ironNecklaceLvl10() {
		
		// ** Variables
		int level = 10;
		int damageResistance = 20;
		int healthBonus = 40;
		int strengthBonus = 25;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Iron Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GOLD + "(Unique Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Damage Resistance: " + damageResistance + "%");
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
