package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class Potions {
	
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

}
