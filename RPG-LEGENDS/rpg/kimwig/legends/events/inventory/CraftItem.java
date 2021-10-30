package rpg.kimwig.legends.events.inventory;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Firework;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;

import net.md_5.bungee.api.ChatColor;
import rpg.kimwig.legends.data.items.Scrolls;
import rpg.kimwig.legends.data.items.armor.divine.DivineArmor;
import rpg.kimwig.legends.utils.Utils;

public class CraftItem {

	// ** Event
	public static void onEvent(CraftItemEvent event) {
		
		// ** Random to set upgrade chance
		Random random = new Random();
		
		// ** Gets the crafting inventory
		CraftingInventory inventory = event.getInventory();
		
		// ** Sets location for firework
		Location fwLocation = new Location(Bukkit.getWorld("world"), 0.000, 23.000, 88.000);
		
		// ** Get who crafted
		HumanEntity player = event.getWhoClicked();
		
		// ** Gets a random int from 1000 to 0
		int randomInt = (random.nextInt(1000 + 0) - 0);
		
		// ** Upgrading chance = lvl Int / randomInt max aka 1000
		
		// ** High, Middle and Low Scrolls
		
		// ** +2
		int lvl2 = 10;
		
		// ** +3
		int lvl3 = 150;
		
		// ** +4
		int lvl4 = 400;
		
		// ** +5
		int lvl5 = 500;
		
		// ** +6
		int lvl6 = 650;
		
		// ** +7
		int lvl7 = 850;
		
		// ** +8
		int lvl8 = 900;
		
		// ** +9
		int lvl9 = 950;
		
		// ** +10
		int lvl10 = 975;
		
		// ** +11 *NOT POSSIBLE*
		int lvl11 = -1;
		
		// ** Blessed Scrolls
		
		// ** +2
		int blessedLvl2 = 5;
		
		// ** +3
		int blessedLvl3 = 100;
		
		// ** +4
		int blessedLvl4 = 350;
		
		// ** +5
		int blessedLvl5 = 450;
		
		// ** +6
		int blessedLvl6 = 600;
		
		// ** +7
		int blessedLvl7 = 800;
		
		// ** +8
		int blessedLvl8 = 850;
		
		// ** +9
		int blessedLvl9 = 900;
		
		// ** +10
		int blessedLvl10 = 950;
		
		// ** +11 *NOT POSSIBLE*
		int blessedLvl11 = -1;
		
		
		
		// ** Rightclick boolean
		boolean rightClick = event.getClick().isRightClick();
		
		// ** Shiftclick boolean
		boolean shiftClick = event.getClick().isShiftClick();

		// ** Try statement to find NullPointerException
		try {
		
			// ** Checks if clickedinventory is a workbench
			if (event.getClickedInventory().getType().equals(InventoryType.WORKBENCH)) {
				
				// ** Cancels rightclicks, shiftclicks and middleclicks
				if (rightClick == true || shiftClick == true || event.getClick() == ClickType.MIDDLE) { event.setCancelled(true); inventory.setResult(new ItemStack(Material.AIR)); } else {
					
				// ** Divine Helmets
					
				// ** Divine Helmet +2
					
				// ** Checks contents of workbench
				if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl1(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl2());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl2) {
							inventory.setResult(DivineArmor.divineHelmetLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl2) {
							inventory.setResult(DivineArmor.divineHelmetLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +3
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl2(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl3());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl3) {
							inventory.setResult(DivineArmor.divineHelmetLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl3);
	
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl3) {
							inventory.setResult(DivineArmor.divineHelmetLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +4
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl3(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl4());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl4) {
							inventory.setResult(DivineArmor.divineHelmetLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl4) {
							inventory.setResult(DivineArmor.divineHelmetLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +5
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl4(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl5());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl5) {
							inventory.setResult(DivineArmor.divineHelmetLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl5) {
							inventory.setResult(DivineArmor.divineHelmetLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +6
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl5(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl6());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl6) {
							inventory.setResult(DivineArmor.divineHelmetLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl6) {
							inventory.setResult(DivineArmor.divineHelmetLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +7
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl6(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl7());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 7);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl7) {
							inventory.setResult(DivineArmor.divineHelmetLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl7) {
							inventory.setResult(DivineArmor.divineHelmetLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +8
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl7(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl8());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 8);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl8) {
							inventory.setResult(DivineArmor.divineHelmetLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl8) {
							inventory.setResult(DivineArmor.divineHelmetLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +9
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl8(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl9());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 9);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl9) {
							inventory.setResult(DivineArmor.divineHelmetLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl9) {
							inventory.setResult(DivineArmor.divineHelmetLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +10
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl9(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineHelmetLvl10());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 10);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl10) {
							inventory.setResult(DivineArmor.divineHelmetLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl10) {
							inventory.setResult(DivineArmor.divineHelmetLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Helmet +11
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl10(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
					
					// ** OP Fail +11
					if (player.isOp()) {
						inventory.setResult(new ItemStack(Material.COAL));
						player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
						Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 11);
						
						// ** Failed Firework
						Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta failedMeta = failed.getFireworkMeta();
						failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
						failedMeta.setPower(1);
						failed.setFireworkMeta(failedMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Failed
						if (randomInt > lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Failed
						if (randomInt > blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Helmet", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Helmet", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldrons
				
				// ** Divine Pauldron +2
					
				// ** Checks contents of workbench
				if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl1(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl2());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl2) {
							inventory.setResult(DivineArmor.divinePauldronLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl2) {
							inventory.setResult(DivineArmor.divinePauldronLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +3
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl2(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl3());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl3) {
							inventory.setResult(DivineArmor.divinePauldronLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl3) {
							inventory.setResult(DivineArmor.divinePauldronLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +4
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl3(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl4());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl4) {
							inventory.setResult(DivineArmor.divinePauldronLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl4) {
							inventory.setResult(DivineArmor.divinePauldronLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +5
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl4(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl5());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl5) {
							inventory.setResult(DivineArmor.divinePauldronLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl5) {
							inventory.setResult(DivineArmor.divinePauldronLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +6
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl5(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl6());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl6) {
							inventory.setResult(DivineArmor.divinePauldronLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl6) {
							inventory.setResult(DivineArmor.divinePauldronLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +7
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl6(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl7());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 7);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl7) {
							inventory.setResult(DivineArmor.divinePauldronLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl7) {
							inventory.setResult(DivineArmor.divinePauldronLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +8
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl7(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl8());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 8);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl8) {
							inventory.setResult(DivineArmor.divinePauldronLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl8) {
							inventory.setResult(DivineArmor.divinePauldronLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +9
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl8(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl9());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 9);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl9) {
							inventory.setResult(DivineArmor.divinePauldronLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl9) {
							inventory.setResult(DivineArmor.divinePauldronLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +10
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl9(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePauldronLvl10());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 10);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl10) {
							inventory.setResult(DivineArmor.divinePauldronLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl10) {
							inventory.setResult(DivineArmor.divinePauldronLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pauldron +11
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl10(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** OP Fail +11
					if (player.isOp()) {
						inventory.setResult(new ItemStack(Material.COAL));
						player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
						Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 11);
						
						// ** Failed Firework
						Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta failedMeta = failed.getFireworkMeta();
						failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
						failedMeta.setPower(1);
						failed.setFireworkMeta(failedMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Failed
						if (randomInt > lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Failed
						if (randomInt > blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pauldron", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pauldron", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads
				
				// ** Divine Pads +2
					
				// ** Checks contents of workbench
				if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl1(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl2());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl2) {
							inventory.setResult(DivineArmor.divinePadsLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl2) {
							inventory.setResult(DivineArmor.divinePadsLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +3
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl2(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl3());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl3) {
							inventory.setResult(DivineArmor.divinePadsLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl3) {
							inventory.setResult(DivineArmor.divinePadsLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +4
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl3(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl4());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl4) {
							inventory.setResult(DivineArmor.divinePadsLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl4) {
							inventory.setResult(DivineArmor.divinePadsLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +5
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl4(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl5());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl5) {
							inventory.setResult(DivineArmor.divinePadsLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl5) {
							inventory.setResult(DivineArmor.divinePadsLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +6
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl5(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl6());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl6) {
							inventory.setResult(DivineArmor.divinePadsLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl6) {
							inventory.setResult(DivineArmor.divinePadsLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +7
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl6(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl7());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 7);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl7) {
							inventory.setResult(DivineArmor.divinePadsLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl7) {
							inventory.setResult(DivineArmor.divinePadsLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +8
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl7(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl8());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 8);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl8) {
							inventory.setResult(DivineArmor.divinePadsLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl8) {
							inventory.setResult(DivineArmor.divinePadsLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +9
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl8(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl9());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 9);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl9) {
							inventory.setResult(DivineArmor.divinePadsLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl9) {
							inventory.setResult(DivineArmor.divinePadsLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +10
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl9(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divinePadsLvl10());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 10);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl10) {
							inventory.setResult(DivineArmor.divinePadsLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl10) {
							inventory.setResult(DivineArmor.divinePadsLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Pads +11
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl10(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
					
					// ** OP Fail +11
					if (player.isOp()) {
						inventory.setResult(new ItemStack(Material.COAL));
						player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
						Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 11);
						
						// ** Failed Firework
						Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta failedMeta = failed.getFireworkMeta();
						failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
						failedMeta.setPower(1);
						failed.setFireworkMeta(failedMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Failed
						if (randomInt > lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Failed
						if (randomInt > blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Pads", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Pads", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots
				
				// ** Divine Boots +2
					
				// ** Checks contents of workbench
				if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl1(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl2());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl2) {
							inventory.setResult(DivineArmor.divineBootsLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl2);
							// REMOVE test message
							Utils.broadcastMessage(ChatColor.LIGHT_PURPLE + player.getName() + " rolled: " + randomInt + " < " + lvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl2) {
							inventory.setResult(DivineArmor.divineBootsLvl2());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl2);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl2) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl2);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +3
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl2(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl3());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl3) {
							inventory.setResult(DivineArmor.divineBootsLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl3) {
							inventory.setResult(DivineArmor.divineBootsLvl3());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl3);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl3) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl3);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +4
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl3(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl4());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl4) {
							inventory.setResult(DivineArmor.divineBootsLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl4) {
							inventory.setResult(DivineArmor.divineBootsLvl4());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl4);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl4) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl4);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +5
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl4(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl5());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl5) {
							inventory.setResult(DivineArmor.divineBootsLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl5) {
							inventory.setResult(DivineArmor.divineBootsLvl5());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl5);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl5) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl5);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +6
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl5(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl6());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl6) {
							inventory.setResult(DivineArmor.divineBootsLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl6) {
							inventory.setResult(DivineArmor.divineBootsLvl6());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl6);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl6) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl6);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +7
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl6(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl7());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 7);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl7) {
							inventory.setResult(DivineArmor.divineBootsLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl7) {
							inventory.setResult(DivineArmor.divineBootsLvl7());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl7);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl7) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 7);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl7);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +8
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl7(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl8());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 8);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl8) {
							inventory.setResult(DivineArmor.divineBootsLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl8) {
							inventory.setResult(DivineArmor.divineBootsLvl8());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl8);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl8) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 8);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl8);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +9
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl8(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl9());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 9);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl9) {
							inventory.setResult(DivineArmor.divineBootsLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl9) {
							inventory.setResult(DivineArmor.divineBootsLvl9());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl9);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl9) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 9);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl9);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +10
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl9(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** 100% chance if player is OP
					if (player.isOp()) {
						inventory.setResult(DivineArmor.divineBootsLvl10());
						player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
						Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 10);
						
						// ** Success Firework
						Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta successMeta = success.getFireworkMeta();
						successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
						successMeta.setPower(1);
						success.setFireworkMeta(successMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Success
						if (randomInt > lvl10) {
							inventory.setResult(DivineArmor.divineBootsLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Success
						if (randomInt > blessedLvl10) {
							inventory.setResult(DivineArmor.divineBootsLvl10());
							player.sendMessage(Utils.colorTranslate("&a&l > &a&oSuccess!"));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl10);
							
							// ** Success Firework
							Firework success = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta successMeta = success.getFireworkMeta();
							successMeta.addEffects(FireworkEffect.builder().withColor(Color.LIME).with(Type.BALL).withTrail().build());
							successMeta.setPower(1);
							success.setFireworkMeta(successMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl10) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 10);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl10);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				// ** Divine Boots +11
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl10(), 1)) 
						&& (inventory.containsAtLeast(Scrolls.blessedScroll(), 1) || inventory.containsAtLeast(Scrolls.highScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
					
					// ** OP Fail +11
					if (player.isOp()) {
						inventory.setResult(new ItemStack(Material.COAL));
						player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
						Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 11);
						
						// ** Failed Firework
						Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
						FireworkMeta failedMeta = failed.getFireworkMeta();
						failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
						failedMeta.setPower(1);
						failed.setFireworkMeta(failedMeta);
					} 
					
					// ** High scroll being used
					else if (inventory.containsAtLeast(Scrolls.highScroll(), 1)) {
						
						// ** Failed
						if (randomInt > lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
						// ** Failed
						else if (randomInt < lvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + lvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
					} 
					
					// ** Blessed scroll being used
					else if (inventory.containsAtLeast(Scrolls.blessedScroll(), 1)) {
						
						// ** Failed
						if (randomInt > blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgrade(player.getName(), "Divine Boots", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " > " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						} 
						
						// ** Failed
						else if (randomInt < blessedLvl11) {
							inventory.setResult(new ItemStack(Material.COAL));
							player.sendMessage(Utils.colorTranslate("&c&l > &c&oFailed."));
							Utils.broadcastUniqueUpgradeFail(player.getName(), "Divine Boots", 11);
							Utils.consonleMessage(player.getName() + " rolled: " + randomInt + " < " + blessedLvl11);
							
							// ** Failed Firework
							Firework failed = event.getWhoClicked().getWorld().spawn(fwLocation, Firework.class);
							FireworkMeta failedMeta = failed.getFireworkMeta();
							failedMeta.addEffects(FireworkEffect.builder().withColor(Color.RED).with(Type.BALL).withTrail().build());
							failedMeta.setPower(1);
							failed.setFireworkMeta(failedMeta);
						}
						
					}
					
				}
				
				}
				
			} else {
				
				// ** If player is in their inventory cancel the event
				inventory.setResult(new ItemStack(Material.AIR));
				event.setCancelled(true);
				
			}
			
		// ** Catch NullPointerException and send message to console
		} catch (NullPointerException e) {
			
			Utils.consonleMessage(player.getName() + " triggered a NullPointerException!");
			
		}
		
		// ** Return
		return;
	}

}
