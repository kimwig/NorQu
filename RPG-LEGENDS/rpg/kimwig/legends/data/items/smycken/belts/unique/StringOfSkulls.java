package rpg.kimwig.legends.data.items.smycken.belts.unique;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class StringOfSkulls {
	
	// ** String Of Skulls
	
	
	
	// ** String Of Skulls +1
	public static ItemStack stringOfSkullsLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 10;
		int damageResistance = 5;
		int healthBonus = 5;
		int strengthBonus = 5;
		int glacierResistance = 30;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +2
	public static ItemStack stringOfSkullsLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 14;
		int damageResistance = 6;
		int healthBonus = 7;
		int strengthBonus = 7;
		int glacierResistance = 33;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +3
	public static ItemStack stringOfSkullsLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 18;
		int damageResistance = 7;
		int healthBonus = 9;
		int strengthBonus = 9;
		int glacierResistance = 36;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +4
	public static ItemStack stringOfSkullsLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 22;
		int damageResistance = 8;
		int healthBonus = 11;
		int strengthBonus = 11;
		int glacierResistance = 39;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +5
	public static ItemStack stringOfSkullsLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 26;
		int damageResistance = 9;
		int healthBonus = 13;
		int strengthBonus = 13;
		int glacierResistance = 42;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +6
	public static ItemStack stringOfSkullsLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 30;
		int damageResistance = 10;
		int healthBonus = 15;
		int strengthBonus = 15;
		int glacierResistance = 45;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +7
	public static ItemStack stringOfSkullsLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 34;
		int damageResistance = 11;
		int healthBonus = 17;
		int strengthBonus = 17;
		int glacierResistance = 48;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +8
	public static ItemStack stringOfSkullsLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 38;
		int damageResistance = 12;
		int healthBonus = 19;
		int strengthBonus = 19;
		int glacierResistance = 51;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +9
	public static ItemStack stringOfSkullsLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 42;
		int damageResistance = 13;
		int healthBonus = 21;
		int strengthBonus = 21;
		int glacierResistance = 54;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}
	
	// ** String Of Skulls +10
	public static ItemStack stringOfSkullsLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 48;
		int damageResistance = 15;
		int healthBonus = 25;
		int strengthBonus = 25;
		int glacierResistance = 58;
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "String of Skulls (+" + level + ")");
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
		lore.add(ChatColor.GREEN + "Health Bonus: " + healthBonus);
		lore.add(ChatColor.GREEN + "Strength Bonus: " + strengthBonus);
		lore.add(ChatColor.AQUA + "Glacier Resistance: " + glacierResistance);
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
	
		return item;
	}

}
