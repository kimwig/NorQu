package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class Items {
	

	
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
	
	
	
	// ** Clan Items
	
	// ** Clan Banner
	public static ItemStack clanBanner() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.GRAY_BANNER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lClan Banner"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&8&o* Decoration Helmet. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}
	
	// ** King Items
	
	// ** Tarus King Banner
		public static ItemStack tarusKingBanner() {
			
			// ** Item
			ItemStack item = new ItemStack(Material.GRAY_BANNER);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(Utils.colorTranslate("&c&lTarus King Banner"));
			
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(Utils.colorTranslate("&8&o* Decoration Helmet. *"));
			
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
			
			// ** Return
			return item;
		}
		
		// ** Humana King Banner
		public static ItemStack humanaKingBanner() {
			
			// ** Item
			ItemStack item = new ItemStack(Material.GRAY_BANNER);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(Utils.colorTranslate("&1&lHumana King Banner"));
			
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(Utils.colorTranslate("&8&o* Decoration Helmet. *"));
			
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
			
			// ** Return
			return item;
		}
		
		// ** VIP Items
		
		// ** Silver VIP Banner
		public static ItemStack silverVIPBanner() {
			
			// ** Item
			ItemStack item = new ItemStack(Material.GRAY_BANNER);
			ItemMeta meta = item.getItemMeta();
			
			// ** Attributes and Name
			meta.setDisplayName(Utils.colorTranslate("&2&lSilver Banner"));
			
			// ** Lore
			List<String> lore = new ArrayList<>();
			lore.add(Utils.colorTranslate("&8&o* Decoration Helmet. *"));
			
			// ** Set Lore and Meta
			meta.setLore(lore);
			item.setItemMeta(meta);
			
			// ** Return
			return item;
		}
		
		// ** Gold VIP Banner
				public static ItemStack goldVIPBanner() {
					
					// ** Item
					ItemStack item = new ItemStack(Material.GRAY_BANNER);
					ItemMeta meta = item.getItemMeta();
					
					// ** Attributes and Name
					meta.setDisplayName(Utils.colorTranslate("&2&lGold Banner"));
					
					// ** Lore
					List<String> lore = new ArrayList<>();
					lore.add(Utils.colorTranslate("&8&o* Decoration Helmet. *"));
					
					// ** Set Lore and Meta
					meta.setLore(lore);
					item.setItemMeta(meta);
					
					// ** Return
					return item;
				}
				
				// ** Diamond VIP Banner
				public static ItemStack diamondVIPBanner() {
					
					// ** Item
					ItemStack item = new ItemStack(Material.GRAY_BANNER);
					ItemMeta meta = item.getItemMeta();
					
					// ** Attributes and Name
					meta.setDisplayName(Utils.colorTranslate("&2&lDiamond Banner"));
					
					// ** Lore
					List<String> lore = new ArrayList<>();
					lore.add(Utils.colorTranslate("&8&o* Decoration Helmet. *"));
					
					// ** Set Lore and Meta
					meta.setLore(lore);
					item.setItemMeta(meta);
					
					// ** Return
					return item;
				}
	
}
