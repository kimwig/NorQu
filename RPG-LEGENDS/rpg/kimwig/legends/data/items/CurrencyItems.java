package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class CurrencyItems {
	
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

}
