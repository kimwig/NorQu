package rpg.kimwig.legends.data.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import rpg.kimwig.legends.utils.Utils;

public class QuestItems {
	
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
	
	// ** Chicken Feather
	public static ItemStack chickenFeather() {
		
		// ** Item
		ItemStack item = new ItemStack(Material.FEATHER);
		ItemMeta meta = item.getItemMeta();
		
		// ** Attributes and Name
		meta.setDisplayName(Utils.colorTranslate("&2&lChicken Feather"));
		
		// ** Lore
		List<String> lore = new ArrayList<>();
		lore.add(Utils.colorTranslate("&7Quest Item"));
		lore.add(null);
		lore.add(Utils.colorTranslate("&8&o* 30 Exp. *"));
		
		// ** Set Lore and Meta
		meta.setLore(lore);
		item.setItemMeta(meta);
		
		// ** Return
		return item;
	}

}
