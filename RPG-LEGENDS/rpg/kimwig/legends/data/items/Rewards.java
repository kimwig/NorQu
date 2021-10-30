package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class Rewards {
	
	// ** Treasure Chests
	
	// ** Elite Treasure Chest
	public static ItemStack eliteTreasureChest() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.MAGENTA_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lElite Treasure Chest"));
		meta.addEnchant(Enchantment.LUCK, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Contains a valuable item. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Treasure Chest
	public static ItemStack treasureChest() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.MAGENTA_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lTreasure Chest"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Contains a valuable item. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	
	
	// ** ESD Gems
	
	// ** Silver Gem
	public static ItemStack silverGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.LIGHT_GRAY_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lSilver Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* &f&oYou deserve something great! &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Blood Gem
	public static ItemStack bloodGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.RED_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lBlood Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯✯✯&7✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* &4&oSatan call's on you.. &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Shine Gem
	public static ItemStack shineGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.YELLOW_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lShine Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯✯&7✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* &e&oShines with a bright"));
		lore.add(Utils.colorTranslate("&e&oyellow light around you. &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Frost Gem
	public static ItemStack frostGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.LAPIS_LAZULI);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lFrost Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯&7✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* &b&oFreezing in your hand. &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Grass Gem
	public static ItemStack grassGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GREEN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lGrass Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯&7✯✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* &2&oGlows in the forest.. &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Dark Gem
	public static ItemStack darkGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.INK_SAC);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lDark Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯&7✯✯✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* &7&oDarkness everywhere.. &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	
	
	// ** Bifrost Fragments
	
	// ** Silver Fragment
	public static ItemStack silverFragment() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.BONE_MEAL);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lShine Fragment"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* I am &f&oGod&8&o.. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Blood Fragment
	public static ItemStack bloodFragment() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PINK_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lBlood Fragment"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯✯✯&7✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* I am &4&oSatan&8&o.. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Shine Fragment
	public static ItemStack shineFragment() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.ORANGE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lShine Fragment"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯✯&7✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* I am &e&oSun&8&o.. *"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Frost Fragment
	public static ItemStack frostFragment() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.LIGHT_BLUE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lFrost Fragment"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯✯&7✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* I am &b&oWinter&8&o.. *"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Grass Fragment
	public static ItemStack grassFragment() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.LIME_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lGrass Fragment"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯✯&7✯✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* I am &2&oSummer&8&o.. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Dark Fragment
	public static ItemStack darkFragment() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GRAY_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lDark Fragment"));
		
		// Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&e✯&7✯✯✯✯✯"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* I am &7&oDarkness&8.. &8&o*"));
		
		// Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}

}
