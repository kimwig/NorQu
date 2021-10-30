package rpg.kimwig.legends.data.items.smycken.necklaces.rare;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class HealthNecklace {
	
	// ** Health Necklace
	
	
	
	// ** Health Necklace +1
	public static ItemStack healthNecklaceLvl1() {
		
		// ** Variables
		int level = 1;
		int healthBonus = 1;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +2
	public static ItemStack healthNecklaceLvl2() {
		
		// ** Variables
		int level = 2;
		int healthBonus = 2;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +3
	public static ItemStack healthNecklaceLvl3() {
		
		// ** Variables
		int level = 3;
		int healthBonus = 3;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +4
	public static ItemStack healthNecklaceLvl4() {
		
		// ** Variables
		int level = 4;
		int healthBonus = 4;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +5
	public static ItemStack healthNecklaceLvl5() {
		
		// ** Variables
		int level = 5;
		int healthBonus = 5;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +6
	public static ItemStack healthNecklaceLvl6() {
		
		// ** Variables
		int level = 6;
		int healthBonus = 6;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +7
	public static ItemStack healthNecklaceLvl7() {
		
		// ** Variables
		int level = 7;
		int healthBonus = 7;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +8
	public static ItemStack healthNecklaceLvl8() {
		
		// ** Variables
		int level = 8;
		int healthBonus = 8;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +9
	public static ItemStack healthNecklaceLvl9() {
		
		// ** Variables
		int level = 9;
		int healthBonus = 9;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Health Necklace +10
	public static ItemStack healthNecklaceLvl10() {
		
		// ** Variables
		int level = 10;
		int healthBonus = 10;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Health Necklace (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000002);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Necklace");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
