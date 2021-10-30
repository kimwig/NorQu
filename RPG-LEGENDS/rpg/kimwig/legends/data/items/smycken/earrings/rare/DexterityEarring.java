package rpg.kimwig.legends.data.items.smycken.earrings.rare;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class DexterityEarring {
	
	// ** Dexterity Earring
	
	
	
	// ** Dexterity Earring +1
	public static ItemStack dexterityEarringLvl1() {
		
		// ** Variables
		int level = 1;
		int dexterityBonus = 1;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +2
	public static ItemStack dexterityEarringLvl2() {
		
		// ** Variables
		int level = 2;
		int dexterityBonus = 2;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +3
	public static ItemStack dexterityEarringLvl3() {
		
		// ** Variables
		int level = 3;
		int dexterityBonus = 3;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +4
	public static ItemStack dexterityEarringLvl4() {
		
		// ** Variables
		int level = 4;
		int dexterityBonus = 4;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +5
	public static ItemStack dexterityEarringLvl5() {
		
		// ** Variables
		int level = 5;
		int dexterityBonus = 5;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +6
	public static ItemStack dexterityEarringLvl6() {
		
		// ** Variables
		int level = 6;
		int dexterityBonus = 6;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +7
	public static ItemStack dexterityEarringLvl7() {
		
		// ** Variables
		int level = 7;
		int dexterityBonus = 7;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +8
	public static ItemStack dexterityEarringLvl8() {
		
		// ** Variables
		int level = 8;
		int dexterityBonus = 8;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +9
	public static ItemStack dexterityEarringLvl9() {
		
		// ** Variables
		int level = 9;
		int dexterityBonus = 9;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Dexterity Earring +10
	public static ItemStack dexterityEarringLvl10() {
		
		// ** Variables
		int level = 10;
		int dexterityBonus = 10;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Dexterity Earring (+" + level + ")");
		meta.setUnbreakable(true);
		meta.setCustomModelData(1000001);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Earring");
		lore.add(null);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
