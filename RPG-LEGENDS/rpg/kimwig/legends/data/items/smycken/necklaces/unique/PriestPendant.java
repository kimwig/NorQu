package rpg.kimwig.legends.data.items.smycken.necklaces.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class PriestPendant {
	
	// ** Priest Pendant
	
	
	
	// ** Priest Pendant +1
	public static ItemStack priestPendantLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 20;
		int strengthBonus = 5;
		int dexterityBonus = 10;
		int intelligenceBonus = 10;
		int magicPowerBonus = 5;
		int healthBonus = 150;
		int poisonResistance = 15;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +2
	public static ItemStack priestPendantLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 23;
		int strengthBonus = 7;
		int dexterityBonus = 12;
		int intelligenceBonus = 12;
		int magicPowerBonus = 7;
		int healthBonus = 170;
		int poisonResistance = 18;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +3
	public static ItemStack priestPendantLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 26;
		int strengthBonus = 9;
		int dexterityBonus = 14;
		int intelligenceBonus = 14;
		int magicPowerBonus = 9;
		int healthBonus = 190;
		int poisonResistance = 21;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +4
	public static ItemStack priestPendantLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 29;
		int strengthBonus = 11;
		int dexterityBonus = 16;
		int intelligenceBonus = 16;
		int magicPowerBonus = 11;
		int healthBonus = 210;
		int poisonResistance = 24;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +5
	public static ItemStack priestPendantLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 32;
		int strengthBonus = 13;
		int dexterityBonus = 18;
		int intelligenceBonus = 18;
		int magicPowerBonus = 13;
		int healthBonus = 230;
		int poisonResistance = 27;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +6
	public static ItemStack priestPendantLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 35;
		int strengthBonus = 15;
		int dexterityBonus = 20;
		int intelligenceBonus = 20;
		int magicPowerBonus = 15;
		int healthBonus = 250;
		int poisonResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +7
	public static ItemStack priestPendantLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 38;
		int strengthBonus = 17;
		int dexterityBonus = 22;
		int intelligenceBonus = 22;
		int magicPowerBonus = 17;
		int healthBonus = 270;
		int poisonResistance = 33;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +8
	public static ItemStack priestPendantLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 41;
		int strengthBonus = 19;
		int dexterityBonus = 24;
		int intelligenceBonus = 24;
		int magicPowerBonus = 19;
		int healthBonus = 290;
		int poisonResistance = 36;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +9
	public static ItemStack priestPendantLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 44;
		int strengthBonus = 21;
		int dexterityBonus = 26;
		int intelligenceBonus = 26;
		int magicPowerBonus = 21;
		int healthBonus = 310;
		int poisonResistance = 39;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** Priest Pendant +10
	public static ItemStack priestPendantLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 49;
		int strengthBonus = 25;
		int dexterityBonus = 30;
		int intelligenceBonus = 30;
		int magicPowerBonus = 25;
		int healthBonus = 350;
		int poisonResistance = 44;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Priest Pendant (+" + level + ")");
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
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.GREEN + "Dexterity Bonus: " + dexterityBonus);
		lore.add(ChatColor.GREEN + "Intelligence Bonus: " + intelligenceBonus);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(ChatColor.RED + "HP Bonus: " + healthBonus);
		lore.add(ChatColor.DARK_GREEN + "Poison Resistance: " + poisonResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
