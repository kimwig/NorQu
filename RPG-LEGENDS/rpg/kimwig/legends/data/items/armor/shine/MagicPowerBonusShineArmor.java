package rpg.kimwig.legends.data.items.armor.shine;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class MagicPowerBonusShineArmor {
	
	// ** Magic Power Bonus Shine Armor
	
	
	
	// ** Magic Power Bonus Shine Helmets
	
	
	
	// ** MP Shine Helmet +1
	public static ItemStack magicPowerShineHelmetLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 80;
		int magicPowerBonus = 2;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +2
	public static ItemStack magicPowerShineHelmetLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 84;
		int magicPowerBonus = 3;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +3
	public static ItemStack magicPowerShineHelmetLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 88;
		int magicPowerBonus = 4;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +4
	public static ItemStack magicPowerShineHelmetLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 92;
		int magicPowerBonus = 6;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +5
	public static ItemStack magicPowerShineHelmetLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 96;
		int magicPowerBonus = 8;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +6
	public static ItemStack magicPowerShineHelmetLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 100;
		int magicPowerBonus = 10;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +7
	public static ItemStack magicPowerShineHelmetLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 104;
		int magicPowerBonus = 12;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +8
	public static ItemStack magicPowerShineHelmetLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 108;
		int magicPowerBonus = 14;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +9
	public static ItemStack magicPowerShineHelmetLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 112;
		int magicPowerBonus = 16;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Helmet +10
	public static ItemStack magicPowerShineHelmetLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 116;
		int magicPowerBonus = 18;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Helmet (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	
	
	// ** Magic Power Bonus Shine Pauldrons
	
	
	
	// ** MP Shine Pauldron +1
	public static ItemStack magicPowerShinePauldronLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 131;
		int magicPowerBonus = 2;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +2
	public static ItemStack magicPowerShinePauldronLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 135;
		int magicPowerBonus = 3;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +3
	public static ItemStack magicPowerShinePauldronLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 139;
		int magicPowerBonus = 4;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +4
	public static ItemStack magicPowerShinePauldronLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 143;
		int magicPowerBonus = 6;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +5
	public static ItemStack magicPowerShinePauldronLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 147;
		int magicPowerBonus = 8;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +6
	public static ItemStack magicPowerShinePauldronLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 151;
		int magicPowerBonus = 10;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +7
	public static ItemStack magicPowerShinePauldronLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 155;
		int magicPowerBonus = 12;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +8
	public static ItemStack magicPowerShinePauldronLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 159;
		int magicPowerBonus = 14;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +9
	public static ItemStack magicPowerShinePauldronLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 163;
		int magicPowerBonus = 16;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pauldron +10
	public static ItemStack magicPowerShinePauldronLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 167;
		int magicPowerBonus = 18;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pauldron (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	
	
	// ** Magic Power Bonus Shine Pads
	
	
	
	// ** MP Shine Pads +1
	public static ItemStack magicPowerShinePadsLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 100;
		int magicPowerBonus = 2;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +2
	public static ItemStack magicPowerShinePadsLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 104;
		int magicPowerBonus = 3;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +3
	public static ItemStack magicPowerShinePadsLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 108;
		int magicPowerBonus = 4;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +4
	public static ItemStack magicPowerShinePadsLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 112;
		int magicPowerBonus = 6;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +5
	public static ItemStack magicPowerShinePadsLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 116;
		int magicPowerBonus = 8;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +6
	public static ItemStack magicPowerShinePadsLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 120;
		int magicPowerBonus = 10;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +7
	public static ItemStack magicPowerShinePadsLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 124;
		int magicPowerBonus = 12;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +8
	public static ItemStack magicPowerShinePadsLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 128;
		int magicPowerBonus = 14;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +9
	public static ItemStack magicPowerShinePadsLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 132;
		int magicPowerBonus = 16;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Pads +10
	public static ItemStack magicPowerShinePadsLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 136;
		int magicPowerBonus = 18;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Pads (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	
	
	// ** Magic Power Bonus Shine Boots
	
	
	
	// ** MP Shine Boots +1
	public static ItemStack magicPowerShineBootsLvl1() {
		
		// ** Variables
		int level = 1;
		int defenceAbility = 54;
		int magicPowerBonus = 2;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +2
	public static ItemStack magicPowerShineBootsLvl2() {
		
		// ** Variables
		int level = 2;
		int defenceAbility = 58;
		int magicPowerBonus = 3;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +3
	public static ItemStack magicPowerShineBootsLvl3() {
		
		// ** Variables
		int level = 3;
		int defenceAbility = 62;
		int magicPowerBonus = 4;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +4
	public static ItemStack magicPowerShineBootsLvl4() {
		
		// ** Variables
		int level = 4;
		int defenceAbility = 66;
		int magicPowerBonus = 6;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +5
	public static ItemStack magicPowerShineBootsLvl5() {
		
		// ** Variables
		int level = 5;
		int defenceAbility = 70;
		int magicPowerBonus = 8;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +6
	public static ItemStack magicPowerShineBootsLvl6() {
		
		// ** Variables
		int level = 6;
		int defenceAbility = 74;
		int magicPowerBonus = 10;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +7
	public static ItemStack magicPowerShineBootsLvl7() {
		
		// ** Variables
		int level = 7;
		int defenceAbility = 78;
		int magicPowerBonus = 12;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +8
	public static ItemStack magicPowerShineBootsLvl8() {
		
		// ** Variables
		int level = 8;
		int defenceAbility = 82;
		int magicPowerBonus = 14;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +9
	public static ItemStack magicPowerShineBootsLvl9() {
		
		// ** Variables
		int level = 9;
		int defenceAbility = 86;
		int magicPowerBonus = 16;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** MP Shine Boots +10
	public static ItemStack magicPowerShineBootsLvl10() {
		
		// ** Variables
		int level = 10;
		int defenceAbility = 90;
		int magicPowerBonus = 18;
		int levelRequired = 45;
		String itemGrade = "High";
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLDEN_BOOTS, 1);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Shine Boots (+" + level + ")");
		meta.setUnbreakable(true);
		meta.addEnchant(Enchantment.DURABILITY, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.DARK_PURPLE + "(Upgradeable Item)");
		lore.add(ChatColor.GRAY + "Armor");
		lore.add(ChatColor.GRAY + "Level: " + levelRequired + "+");
		lore.add(null);
		lore.add(ChatColor.WHITE + "Defence Ability: " + defenceAbility);
		lore.add(ChatColor.GREEN + "Magic Power Bonus: " + magicPowerBonus);
		lore.add(null);
		lore.add(ChatColor.GREEN + "Item Grade: " + itemGrade + " Class");
		lore.add(null);
		lore.add(ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "* Shine armor. *");
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

}
