package rpg.kimwig.legends.data.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

import rpg.kimwig.legends.Main;

public class DivineRecipes {
	
	// ** Recipe for Divine Helmets
	public static ShapelessRecipe divineHelmetRecipes() {
		
		// ** NameSpace key and recipe
		NamespacedKey key = new NamespacedKey(Main.plugin, "divine_helmet");
		ShapelessRecipe recipe = new ShapelessRecipe(key, new ItemStack(Material.CHAINMAIL_HELMET));
		
		// ** Adds ingredients
		recipe.addIngredient(Material.CHAINMAIL_HELMET);
		recipe.addIngredient(Material.PAPER);
		
		// ** Return
		return recipe;
	}
	
	// ** Recipe for Divine Pauldrons
	public static ShapelessRecipe divinePauldronRecipes() {
			
		// ** Namespace key and recipe
		NamespacedKey key = new NamespacedKey(Main.plugin, "divine_pauldron");
		ShapelessRecipe recipe = new ShapelessRecipe(key, new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		
		// ** Adds ingredients
		recipe.addIngredient(Material.CHAINMAIL_CHESTPLATE);
		recipe.addIngredient(Material.PAPER);
			
		// ** Return
		return recipe;
	}
	
	// ** Recipe for Divine Pads
	public static ShapelessRecipe divinePadsRecipes() {
		
		// ** NameSpace key and recipe
		NamespacedKey key = new NamespacedKey(Main.plugin, "divine_pads");
		ShapelessRecipe recipe = new ShapelessRecipe(key, new ItemStack(Material.CHAINMAIL_LEGGINGS));
		
		// ** Adds ingredients
		recipe.addIngredient(Material.CHAINMAIL_LEGGINGS);
		recipe.addIngredient(Material.PAPER);
		
		// ** Return
		return recipe;
	}
	
	// ** Recipe for Divine Boots
	public static ShapelessRecipe divineBootsRecipes() {
		
		// ** NameSpace key and recipe
		NamespacedKey key = new NamespacedKey(Main.plugin, "divine_boots");
		ShapelessRecipe recipe = new ShapelessRecipe(key, new ItemStack(Material.CHAINMAIL_BOOTS));
		
		// ** Adds ingredients
		recipe.addIngredient(Material.CHAINMAIL_BOOTS);
		recipe.addIngredient(Material.PAPER);
		
		// ** Return
		return recipe;
	}

}
