package rpg.kimwig.legends.events.inventory;

import org.bukkit.Material;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import rpg.kimwig.legends.data.items.Items;
import rpg.kimwig.legends.data.items.armor.DivineArmor;
import rpg.kimwig.legends.utils.Utils;

public class PrepareItemCraft {

	// ** Event
	public static void onEvent(PrepareItemCraftEvent event) {
		
	// ** Gets the crafting inventory
	CraftingInventory inventory = event.getInventory();
	
	// ** Try Catch
	try {
		
		// ** Coal Block Disable
		if ( (inventory.contains(Material.COAL, 9)) && (inventory.getResult().getType().equals(Material.COAL_BLOCK)) ) {
			
			// ** Disables result
			inventory.setResult(new ItemStack(Material.AIR));
			
		}
	// ** Catch NullPointerException
	} catch (NullPointerException e) {
		
		// ** Send console a message
		Utils.consonleMessage("ERROR: " + inventory.getHolder() + " tried to create coal blocks but failed!");
				
	}

	// ** Try Catch Statement
	try {
		
			// ** Divine Helmets
		
		
		
			// ** Divine Helmet +2
		
		
			// ** Checks contents of workbench
			if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl1(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
				
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl2());
				
			}
			
			// ** Divine Helmet +3
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl2(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
				
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl3());
				
			}
			
			// ** Divine Helmet +4
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl3(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
				
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl4());
				
			}
			
			// ** Divine Helmet +5
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl4(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
						
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl5());
						
			}
			
			// ** Divine Helmet +6
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl5(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
						
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl6());
						
			}
			
			// ** Divine Helmet +7
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl6(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
						
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl7());
						
			}
			
			// ** Divine Helmet +8
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl7(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
						
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl8());
						
			}
			
			// ** Divine Helmet +9
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl8(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
						
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl9());
						
			}
			
			// ** Divine Helmet +10
			
			// ** Checks contents of workbench
			else if ( (inventory.containsAtLeast(DivineArmor.divineHelmetLvl9(), 1)) 
					&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
					&& (inventory.getResult().getType().equals(Material.CHAINMAIL_HELMET)) ) {
						
				// ** Sets result
				inventory.setResult(DivineArmor.divineHelmetLvl10());
						
			}
			
			
		// ** Catch NullPointerException
	} catch (NullPointerException e) {
		
		// ** Send console a message
		Utils.consonleMessage("ERROR: " + inventory.getHolder() + " tried to place multiple upgrade scrolls in a workbench!");
		
	}
		
	// ** Try Catch Statement
	try {
			
			// ** Divine Pauldrons
		
		
			
			// ** Divine Pauldron +2
			
			// ** Checks contents of workbench
				if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl1(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl2());
					
				}
				
				// ** Divine Pauldron +3
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl2(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl3());
					
				}
				
				// ** Divine Pauldron +4
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl3(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
					
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl4());
					
				}
				
				// ** Divine Pauldron +5
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl4(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
							
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl5());
							
				}
				
				// ** Divine Pauldron +6
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl5(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
							
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl6());
							
				}
				
				// ** Divine Pauldron +7
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl6(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
							
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl7());
							
				}
				
				// ** Divine Pauldron +8
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl7(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
							
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl8());
							
				}
				
				// ** Divine Pauldron +9
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl8(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
							
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl9());
							
				}
				
				// ** Divine Pauldron +10
				
				// ** Checks contents of workbench
				else if ( (inventory.containsAtLeast(DivineArmor.divinePauldronLvl9(), 1)) 
						&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
						&& (inventory.getResult().getType().equals(Material.CHAINMAIL_CHESTPLATE)) ) {
							
					// ** Sets result
					inventory.setResult(DivineArmor.divinePauldronLvl10());
							
				}

				// ** Catch NullPointerException
		} catch (NullPointerException e) {
			
			// ** Send console a message
			Utils.consonleMessage("ERROR: " + inventory.getHolder() + " tried to place multiple upgrade scrolls in a workbench!");
			
		}
			
	// ** Try Catch Statement
	try {
				
				// ** Divine Pads
				
				
				
				// ** Divine Pads +2
				
				// ** Checks contents of workbench
					if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl1(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
						
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl2());
						
					}
					
					// ** Divine Pads +3
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl2(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
						
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl3());
						
					}
					
					// ** Divine Pads +4
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl3(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
						
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl4());
						
					}
					
					// ** Divine Pads +5
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl4(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
								
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl5());
								
					}
					
					// ** Divine Pads +6
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl5(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
								
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl6());
								
					}
					
					// ** Divine Pads +7
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl6(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
								
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl7());
								
					}
					
					// ** Divine Pads +8
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl7(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
								
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl8());
								
					}
					
					// ** Divine Pads +9
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl8(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
								
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl9());
								
					}
					
					// ** Divine Pads +10
					
					// ** Checks contents of workbench
					else if ( (inventory.containsAtLeast(DivineArmor.divinePadsLvl9(), 1)) 
							&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
							&& (inventory.getResult().getType().equals(Material.CHAINMAIL_LEGGINGS)) ) {
								
						// ** Sets result
						inventory.setResult(DivineArmor.divinePadsLvl10());
								
					}
				
	// ** Catch NullPointerException
	} catch (NullPointerException e) {
		
				// ** Send console a message
				Utils.consonleMessage("ERROR: " + inventory.getHolder() + " tried to place multiple upgrade scrolls in a workbench!");
		
	}
	
	// ** Try Catch Statement			
	try {
					
					// ** Divine Boots
					
					
					
					// ** Divine Boots +2
					
					// ** Checks contents of workbench
						if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl1(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
							
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl2());
							
						}
						
						// ** Divine Boots +3
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl2(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
							
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl3());
							
						}
						
						// ** Divine Boots +4
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl3(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
							
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl4());
							
						}
						
						// ** Divine Boots +5
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl4(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
									
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl5());
									
						}
						
						// ** Divine Boots +6
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl5(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
									
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl6());
									
						}
						
						// ** Divine Boots +7
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl6(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
									
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl7());
									
						}
						
						// ** Divine Boots +8
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl7(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
									
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl8());
									
						}
						
						// ** Divine Boots +9
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl8(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
									
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl9());
									
						}
						
						// ** Divine Boots +10
						
						// ** Checks contents of workbench
						else if ( (inventory.containsAtLeast(DivineArmor.divineBootsLvl9(), 1)) 
								&& (inventory.containsAtLeast(Items.highScroll(), 1) || inventory.containsAtLeast(Items.blessedScroll(), 1)) 
								&& (inventory.getResult().getType().equals(Material.CHAINMAIL_BOOTS)) ) {
									
							// ** Sets result
							inventory.setResult(DivineArmor.divineBootsLvl10());
									
						}
			
	// ** Catch NullPointerException
	} catch (NullPointerException e) {
		
				// ** Send console a message
				Utils.consonleMessage("ERROR: " + inventory.getHolder() + " tried to place multiple upgrade scrolls in a workbench!");
				
	}
		
		// ** Return
		return;
	}

}
