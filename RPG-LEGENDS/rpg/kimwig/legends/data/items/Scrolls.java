package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class Scrolls {
	
	// ** Scrolls
	
	// ** Blessed Scroll
	public static ItemStack blessedScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (Blessed)"));
		meta.addEnchant(Enchantment.LUCK, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aIncreased upgrade chance"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Upgrade any class items. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** High Scroll
	public static ItemStack highScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (High)"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Upgrade high class items. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Middle Scroll
	public static ItemStack middleScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (Middle)"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Upgrade middle class items. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Low Scroll
	public static ItemStack lowScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (Low)"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Upgrade low class items. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** Health Scroll
	public static ItemStack healthScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lHealth Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Health Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Health bonus scroll. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Dexterity Scroll
	public static ItemStack dexterityScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lDexterity Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Dexterity Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Dexterity bonus scroll. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Intelligence Scroll
	public static ItemStack intelligenceScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lIntelligence Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Intelligence Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Intelligence bonus scroll. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Magic Power Scroll
	public static ItemStack magicPowerScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lMagic Power Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Magic Power Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Magic Power bonus scroll. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Strength Scroll
	public static ItemStack strengthScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lStrength Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Strength Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Strength bonus scroll. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Scrolls in Shop
	
	// ** Blessed Scroll
	public static ItemStack shopBlessedScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (Blessed)"));
		meta.addEnchant(Enchantment.LUCK, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aIncreased upgrade chance"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 10,000,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** High Scroll
	public static ItemStack shopHighScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (High)"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 1,000,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Middle Scroll
	public static ItemStack shopMiddleScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (Middle)"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 100,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Low Scroll
	public static ItemStack shopLowScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lUpgrade Scroll (Low)"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 10,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** Health Scroll
	public static ItemStack shopHealthScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lHealth Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Health Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 250,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Dexterity Scroll
	public static ItemStack shopDexterityScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lDexterity Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Dexterity Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 250,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Intelligence Scroll
	public static ItemStack shopIntelligenceScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lIntelligence Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Intelligence Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 250,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Magic Power Scroll
	public static ItemStack shopMagicPowerScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lMagic Power Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Magic Power Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 250,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Strength Scroll
	public static ItemStack shopStrengthScroll() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PAPER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lStrength Bonus Scroll"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Scroll"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&aChange to Strength Bonus"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 250,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

}
