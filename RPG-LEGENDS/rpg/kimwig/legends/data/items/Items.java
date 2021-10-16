package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class Items {
	
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
	
	
	
	// ** Abyss
	
	// ** Abyss Key
	public static ItemStack abyssKey() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lAbyss Key"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Key"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Used in Abyss. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Abyss Gem
	public static ItemStack abyssGem() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.DIAMOND);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lAbyss Gem"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Seems to glow in the dark.. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	
	
	// ** Mining
	
	// ** Pickaxe
	public static ItemStack miningPickaxe() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.WOODEN_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPickaxe"));
		meta.setUnbreakable(true);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Tool"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Used for mining. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Mysterious Ore
	public static ItemStack mysteriousOre() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.QUARTZ);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lMysterious Ore"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Earned from mining. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Dreaming Ore
	public static ItemStack dreamingOre() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.QUARTZ);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&9&lDreaming Ore"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Treasure"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Earned from mining. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	
	
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
	
	
	
	// ** Currency Items
	
	// ** Item Currency
	
	// ** Gold Bar
	public static ItemStack goldBar() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLD_INGOT);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lGold Bar"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 100,000,000 coins. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Silver Bar
	public static ItemStack silverBar() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_INGOT);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lSilver Bar"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 10,000,000 coins. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	// ** Gold Coin
	public static ItemStack goldCoin() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lGold Coin"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 1,000,000 coins. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Silver Coin
	public static ItemStack silverCoin() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GUNPOWDER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lSilver Coin"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 100,000 coins. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	// ** Bronze Coin
	public static ItemStack bronzeCoin() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.BRICK);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lBronze Coin"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 10,000 coins. *"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}

	// ** Currency Items in Shop
	
	// ** Gold Bar
	public static ItemStack shopGoldBar() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLD_INGOT);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lGold Bar"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 100,000,000 coins. *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 100,000,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}

	// ** Silver Bar
	public static ItemStack shopSilverBar() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.IRON_INGOT);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lSilver Bar"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 10,000,000 coins. *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 10,000,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	// ** Gold Coin
	public static ItemStack shopGoldCoin() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GLOWSTONE_DUST);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lGold Coin"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 1,000,000 coins. *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 1,000,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		return item;
	}
	
	// ** Silver Coin
	public static ItemStack shopSilverCoin() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GUNPOWDER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lSilver Coin"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 100,000 coins. *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 100,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	// ** Bronze Coin
	public static ItemStack shopBronzeCoin() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.BRICK);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&e&lBronze Coin"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Value"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 10,000 coins. *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 10,000 coins"));
		
		// ** Set lore and meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	
	
	
	// ** Potions
	
	// ** Mana Potions
	
	// ** Potion of Soul
	public static ItemStack potionOfSoulManaPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Soul"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 20 Mana *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Wisdon
	public static ItemStack potionOfWisdomManaPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Wisdom"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 16 Mana *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Saga
	public static ItemStack potionOfSagaManaPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Saga"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 12 Mana *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Magic
	public static ItemStack potionOfMagicManaPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Magic"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 8 Mana *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Spirit
	public static ItemStack potionOfSpiritManaPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Spirit"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 4 Mana *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Health Potions
	
	// ** Water of Favors
	public static ItemStack waterOfFavorsHealthPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Favors"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 720 HP *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Grace
	public static ItemStack waterOfGraceHealthPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Grace"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 360 HP *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Love
	public static ItemStack waterOfLoveHealthPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Love"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 180 HP *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Life
	public static ItemStack waterOfLifeHealthPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Life"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 90 HP *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Holy
	public static ItemStack waterOfHolyHealthPotion() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Holy"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 30 HP *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potions in Shop
	
	// ** Mana Potions x1
	
	// ** Potion of Soul x1
	public static ItemStack shopPotionOfSoulManaPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Soul"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 20 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 10,500 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Wisdon x1
	public static ItemStack shopPotionOfWisdomManaPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Wisdom"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 16 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 4,900 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Saga x1
	public static ItemStack shopPotionOfSagaManaPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Saga"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 12 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 1,400 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Magic x1
	public static ItemStack shopPotionOfMagicManaPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Magic"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 8 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 420 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Spirit x1
	public static ItemStack shopPotionOfSpiritManaPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Spirit"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 4 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 110 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Health Potions x1
	
	// ** Water of Favors x1
	public static ItemStack shopWaterOfFavorsHealthPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Favors"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 720 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 4,900 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Grace x1
	public static ItemStack shopWaterOfGraceHealthPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Grace"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 360 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 1,400 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Love x1
	public static ItemStack shopWaterOfLoveHealthPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Love"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 180 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 420 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Life x1
	public static ItemStack shopWaterOfLifeHealthPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Life"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 90 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 110 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Water of Holy x1
	public static ItemStack shopWaterOfHolyHealthPotionX1() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Holy"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 30 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 70 coins"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Mana Potions x10
	
	// ** Potion of Soul x10
	public static ItemStack shopPotionOfSoulManaPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Soul"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 20 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 105,000 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Wisdon x10
	public static ItemStack shopPotionOfWisdomManaPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Wisdom"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 16 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 49,000 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Saga x10
	public static ItemStack shopPotionOfSagaManaPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Saga"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 12 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 14,000 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Magic x10
	public static ItemStack shopPotionOfMagicManaPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Magic"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 8 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 4,200 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Spirit x10
	public static ItemStack shopPotionOfSpiritManaPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Spirit"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 4 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 1,100 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Health Potions x10
	
	// ** Water of Favors x10
	public static ItemStack shopWaterOfFavorsHealthPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Favors"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 720 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 49,000 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Water of Grace x10
	public static ItemStack shopWaterOfGraceHealthPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Grace"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 360 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 14,000 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Water of Love x10
	public static ItemStack shopWaterOfLoveHealthPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Love"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 180 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 4,200 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Water of Life x10
	public static ItemStack shopWaterOfLifeHealthPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Life"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 90 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 1,100 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Water of Holy x10
	public static ItemStack shopWaterOfHolyHealthPotionX10() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Holy"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 30 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 700 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(10);
		
		// ** Return
		return item;
	}
	
	// ** Mana Potions x64
	
	// ** Potion of Soul x64
	public static ItemStack shopPotionOfSoulManaPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Soul"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 20 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 672,000 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Wisdon x64
	public static ItemStack shopPotionOfWisdomManaPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Wisdom"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 16 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 313,600 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Saga x64
	public static ItemStack shopPotionOfSagaManaPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Saga"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 12 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 89,600 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Magic x64
	public static ItemStack shopPotionOfMagicManaPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Magic"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 8 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 26,880 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Potion of Spirit x64
	public static ItemStack shopPotionOfSpiritManaPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CYAN_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lPotion of Spirit"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Mana Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Restore 4 Mana *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 7,040 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Health Potions x64
	
	// ** Water of Favors x64
	public static ItemStack shopWaterOfFavorsHealthPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Favors"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 720 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 313,600 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Water of Grace x64
	public static ItemStack shopWaterOfGraceHealthPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Grace"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 360 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 89,600 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Water of Love x64
	public static ItemStack shopWaterOfLoveHealthPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Love"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 180 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 26,880 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Water of Life x64
	public static ItemStack shopWaterOfLifeHealthPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Life"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 90 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 7,040 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	// ** Water of Holy x64
	public static ItemStack shopWaterOfHolyHealthPotionX64() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.PURPLE_DYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&f&lWater of Holy"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Health Potion"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* Heal 30 HP *"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&3Price: 4,480 coins"));
		
		// ** Set Lore, Meta and Amount
		meta.setLore(lore);
		item.setItemMeta(meta);
		item.setAmount(64);
		
		// ** Return
		return item;
	}
	
	
	
	// ** Quest Items
	
	// ** Giga Ball
	public static ItemStack gigaBall() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lGiga Ball"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 50,000 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Rock
	public static ItemStack rock() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.CLAY_BALL);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lRock"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 50,000 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Villager Heart
	public static ItemStack villagerHeart() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.FERMENTED_SPIDER_EYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lVillager Heart"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 3,000 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Villager Flesh
	public static ItemStack villagerFlesh() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.ROTTEN_FLESH);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lVillager Flesh"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 120,000 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Spider Eye
	public static ItemStack spiderEye() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.SPIDER_EYE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lSpider Eye"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 30,000 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Skeleton Bone
	public static ItemStack skeletonBone() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.BONE);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lSkeleton Bone"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 75,000 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** Villager Tooth
	public static ItemStack villagerTooth() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GOLD_NUGGET);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lVillager Tooth"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 10,000 Exp. *"));
		
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
