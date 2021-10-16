package rpg.kimwig.legends.events.block;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import rpg.kimwig.legends.Main;
import rpg.kimwig.legends.sql.SQLGetter;
import rpg.kimwig.legends.utils.Utils;

public class PlayerInteract {
	
	// ** onEvent
	public static void onEvent(PlayerInteractEvent event) {
		
		// ** Player object
		Player player = event.getPlayer();
		
		// ** Action object
		Action action = event.getAction();
		
		// ** Block object
		Block block = event.getClickedBlock();
		
		// ** Data object
		SQLGetter data = Main.data;
		
		// ** MySQL object
		//MySQL sql = new MySQL();
		
		//boolean sqlBool = sql.isConnected();
		
		// ** Checks if a oak sign was right clicked
		if (action.equals(Action.RIGHT_CLICK_BLOCK) && (block.getType() == Material.OAK_SIGN || block.getType() == Material.OAK_WALL_SIGN)) {
			
			//if (sql.isConnected()) {
				//player.sendMessage(" Bool = " + sqlBool);
				// ** Casts blockstate to sign
				Sign sign = (Sign) block.getState();
				
				// ** Sign Chunk
				Chunk signChunk = sign.getChunk();
				int signChunkX = signChunk.getX();
				int signChunkZ = signChunk.getZ();
				
				// ** Sign lines
				boolean blankLine0 = sign.getLine(0).equalsIgnoreCase("");
				boolean blankLine3 = sign.getLine(3).equalsIgnoreCase("");
				
				// ** Nations
				boolean joinNation = sign.getLine(1).equalsIgnoreCase(Utils.colorTranslate("&lJoin Nation"));
				boolean tarus = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lTarus"));
				boolean humana = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lHumana"));
				
				boolean clickedTarusNationJoinSign = blankLine0 && joinNation && tarus && blankLine3;
				boolean clickedHumanaNationJoinSign = blankLine0 && joinNation && humana && blankLine3;
				
				// ** Classes
				boolean tarusClickedSelectClass = (sign.getLine(1).equalsIgnoreCase(Utils.colorTranslate("&lSelect class")) && signChunkX == 0 && signChunkZ == 9);
				boolean humanaClickedSelectClass = (sign.getLine(1).equalsIgnoreCase(Utils.colorTranslate("&lSelect class")) && signChunkX == -1 && signChunkZ == 9);
				boolean changeFrom = sign.getLine(0).equalsIgnoreCase(Utils.colorTranslate("&lChange from"));
				boolean to = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&lto"));
				//boolean flame = sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&6&lFlame"));
				//boolean glacier = sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&b&lGlacier"));
				//boolean thunder = sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&1&lThunder"));
				//boolean humanaThunder = sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&9&lThunder"));
				//boolean tarusMage = sign.getLine(1).equalsIgnoreCase(Utils.colorTranslate("&4&lMage"));
				//boolean humanaMage = sign.getLine(1).equalsIgnoreCase(Utils.colorTranslate("&9&lMage"));
				
				
				
				// ** Tarus Classes
				boolean tarusWarrior = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lWarrior"));
				boolean tarusAssassin = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lAssassin"));
				boolean tarusArcher = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lArcher"));
				boolean tarusFlameMage = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lWarrior")) && sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&6&lFlame"));
				boolean tarusGlacierMage = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lWarrior")) && sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&b&lGlacier"));
				boolean tarusThunderMage = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lWarrior")) && sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&1&lThunder"));
				boolean tarusPriest = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&4&lPriest"));
				
				boolean clickedTarusWarriorSign = blankLine0 && tarusClickedSelectClass && tarusWarrior && blankLine3;
				boolean clickedTarusAssassinSign = blankLine0 && tarusClickedSelectClass && tarusAssassin && blankLine3;
				boolean clickedTarusArcherSign = blankLine0 && tarusClickedSelectClass && tarusArcher && blankLine3;
				boolean clickedTarusFlameMageSign = blankLine0 && tarusClickedSelectClass && tarusFlameMage;
				boolean clickedTarusGlacierMageSign = blankLine0 && tarusClickedSelectClass && tarusGlacierMage;
				boolean clickedTarusThunderMageSign = blankLine0 && tarusClickedSelectClass && tarusThunderMage;
				boolean clickedTarusPriestSign = blankLine0 && tarusClickedSelectClass && tarusPriest && blankLine3;
				
				boolean clickedTarusChangeFromArcherToAssassin = changeFrom && tarusArcher && to && tarusAssassin;
				//boolean clickedTarusChangeFromAssassinToArcher = changeFrom && tarusAssassin && to && tarusArcher;
				//boolean clickedTarusChangeFromMageToFlame = changeFrom && tarusMage && to && flame;
				//boolean clickedTarusChangeFromMageToGlacier = changeFrom && tarusMage && to && glacier;
				//boolean clickedTarusChangeFromMageToThunder = changeFrom && tarusMage && to && thunder;
				
				
				
				// ** Humana Classes
				boolean humanaWarrior = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lWarrior"));
				boolean humanaAssassin = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lAssassin"));
				boolean humanaArcher = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lArcher"));
				boolean humanaFlameMage = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lMage")) && sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&6&lFlame"));
				boolean humanaGlacierMage = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lMage")) && sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&b&lGlacier"));
				boolean humanaThunderMage = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lMage")) && sign.getLine(3).equalsIgnoreCase(Utils.colorTranslate("&9&lThunder"));
				boolean humanaPriest = sign.getLine(2).equalsIgnoreCase(Utils.colorTranslate("&1&lPriest"));
				
				boolean clickedHumanaWarriorSign = blankLine0 && humanaClickedSelectClass && humanaWarrior && blankLine3;
				boolean clickedHumanaAssassinSign = blankLine0 && humanaClickedSelectClass && humanaAssassin && blankLine3;
				boolean clickedHumanaArcherSign = blankLine0 && humanaClickedSelectClass && humanaArcher && blankLine3;
				boolean clickedHumanaFlameMageSign = blankLine0 && humanaClickedSelectClass && humanaFlameMage;
				boolean clickedHumanaGlacierMageSign = blankLine0 && humanaClickedSelectClass && humanaGlacierMage;
				boolean clickedHumanaThunderMageSign = blankLine0 && humanaClickedSelectClass && humanaThunderMage;
				boolean clickedHumanaPriestSign = blankLine0 && humanaClickedSelectClass && humanaPriest && blankLine3;
				
				boolean clickedHumanaChangeFromArcherToAssassin = changeFrom && humanaArcher && to && humanaAssassin;
				//boolean clickedHumanaChangeFromAssassinToArcher = changeFrom && humanaAssassin && to && humanaArcher;
				//boolean clickedHumanaChangeFromMageToFlame = changeFrom && humanaMage && to && flame;
				//boolean clickedHumanaChangeFromMageToGlacier = changeFrom && humanaMage && to && glacier;
				//boolean clickedHumanaChangeFromMageToThunder = changeFrom && humanaMage && to && thunder;
				
				
				
				// ** Tarus
				// ** If player is OP
				if (clickedTarusNationJoinSign && player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't join a nation as operator!"));
					// ** If player is in tarus and not OP
				} else if (clickedTarusNationJoinSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou are already in &c&oTarus &7&onation!"));
					// ** If player is in humana and not OP
				} else if (clickedTarusNationJoinSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Ask if they wanna change and tell how much is cost
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou can't change nations right now, contact server admin if this is a problem."));
					// ** If player is not in tarus or humana and they are not OP
				} else if (clickedTarusNationJoinSign && data.playerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Add to tarus and remove from players
					data.addTarusPlayer(player.getUniqueId(), player.getDisplayName());
					data.removePlayer(player.getUniqueId());
					Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ohas joined the &c&oTarus &e&onation.");
					// ** If player clicked a select class sign and is OP
				} else if (tarusClickedSelectClass && player.isOp()) {
					// ** Player is OP error
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't select class as operator!"));
					// ** If player clicked a select class sign and is not part of a nation
				} else if (tarusClickedSelectClass && data.playerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou need to select a nation before you can select a class!"));
					// ** If player clicked a change from class sign and is in tarus
				} else if (changeFrom && data.playerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou need to select a nation before you can select a class!"));
					
					// ** If player clicked a select class sign and is in tarus
				} else if (tarusClickedSelectClass && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
					
					
					// ** Determine which class sign player clicked
					
					// ** If clicked tarus warrior sign and is part of tarus
					if (clickedTarusWarriorSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						
						// ** Check if player is another class
						if (player.isOp()) {
							
						}
						// ** Set player as Warrior class
						data.addTarusPlayerClass(player.getUniqueId(), "warrior");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &c&oWarrior");
						
						// ** If clicked tarus assassin sign and is part of tarus
					} else if ((clickedTarusAssassinSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp())) {
						// ** Set player as Assassin class
						data.addTarusPlayerClass(player.getUniqueId(), "assassin");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &c&oAssassin");
						
						// ** If clicked tarus archer sign and is part of tarus
					} else if (clickedTarusArcherSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Archer class
						data.addTarusPlayerClass(player.getUniqueId(), "archer");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &c&oArcher");
						
						// ** If clicked tarus priest sign and is part of tarus
					} else if (clickedTarusPriestSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Priest class
						data.addTarusPlayerClass(player.getUniqueId(), "priest");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &c&oPriest");
						
						// ** If clicked tarus flame mage sign and is part of tarus
					} else if (clickedTarusFlameMageSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Flame Mage class
						data.addTarusPlayerClass(player.getUniqueId(), "flameMage");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &6&oFlame &c&oMage");
						
						// ** If clicked tarus glacier mage sign and is part of tarus
					} else if (clickedTarusGlacierMageSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Glacier Mage class
						data.addTarusPlayerClass(player.getUniqueId(), "glacierMage");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &b&oGlacier &c&oMage");
						
						// ** If clicked tarus thunder mage sign and is part of tarus
					} else if (clickedTarusThunderMageSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Thunder Mage class
						data.addTarusPlayerClass(player.getUniqueId(), "thunderMage");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &9&oThunder &c&oMage");
						
						// ** If wanted to change from tarus archer to assassin and is part of tarus
					} else if (clickedTarusChangeFromArcherToAssassin && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Ask if they want to change and tell what is lost
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou can't change classes right now, contact server admin if this is a problem."));
					}
				}
				
				
				
				
				
				// ** Humana
				// ** If player is OP
				if (clickedHumanaNationJoinSign && player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't join a nation as operator!"));
					// ** If player is in humana and not OP
				} else if (clickedHumanaNationJoinSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou are already in &9&oHumana &7&onation!"));
					// ** If player is in tarus and not OP
				} else if (clickedTarusNationJoinSign && data.tarusPlayerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Ask if they wanna change and tell how much is cost
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou can't change nations right now, contact server admin if this is a problem."));
					// ** If player is not in tarus or humana and they are not OP
				} else if (clickedHumanaNationJoinSign && data.playerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Add to humana and remove from players
					data.addHumanaPlayer(player.getUniqueId(), player.getDisplayName());
					data.removePlayer(player.getUniqueId());
					Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ohas joined the &9&oHumana &e&onation.");
					// ** If player clicked a select class sign and is OP
				} else if (humanaClickedSelectClass && player.isOp()) {
					// ** Player is OP error
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't select class as operator!"));
					// ** If player clicked a select class sign and is not part of a nation
				} else if (humanaClickedSelectClass && data.playerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou need to select a nation before you can select a class!"));
					// ** If player clicked a change from class sign and is in humana
				} else if (changeFrom && data.playerExists(player.getUniqueId()) && !player.isOp()) {
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou need to select a nation before you can select a class!"));
					
					// ** If player clicked a select class sign and is in humana
				} else if (humanaClickedSelectClass && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
					
					
					// ** Determine which class sign player clicked
					
					// ** If clicked humana warrior sign and is part of humana
					if (clickedHumanaWarriorSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Warrior class
						data.addHumanaPlayerClass(player.getUniqueId(), "warrior");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &9&oWarrior");
						
						// ** If clicked humana assassin sign and is part of humana
					} else if ((clickedHumanaAssassinSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp())) {
						// ** Set player as Assassin class
						data.addHumanaPlayerClass(player.getUniqueId(), "assassin");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &9&oAssassin");
						
						// ** If clicked humana archer sign and is part of humana
					} else if (clickedHumanaArcherSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Archer class
						data.addHumanaPlayerClass(player.getUniqueId(), "archer");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &9&oArcher");
						
						// ** If clicked humana priest sign and is part of humana
					} else if (clickedHumanaPriestSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Priest class
						data.addHumanaPlayerClass(player.getUniqueId(), "priest");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &9&oPriest");
						
						// ** If clicked humana flame mage sign and is part of humana
					} else if (clickedHumanaFlameMageSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Flame Mage class
						data.addHumanaPlayerClass(player.getUniqueId(), "flameMage");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &6&oFlame &9&oMage");
						
						// ** If clicked humana glacier mage sign and is part of humana
					} else if (clickedHumanaGlacierMageSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Glacier Mage class
						data.addHumanaPlayerClass(player.getUniqueId(), "glacierMage");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &b&oGlacier &9&oMage");
						
						// ** If clicked humana thunder mage sign and is part of humana
					} else if (clickedHumanaThunderMageSign && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Set player as Thunder Mage class
						data.addHumanaPlayerClass(player.getUniqueId(), "thunderMage");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &9&oHumana &9&oThunder &9&oMage");
						
						// ** If wanted to change from humana archer to assassin and is part of humana
					} else if (clickedHumanaChangeFromArcherToAssassin && data.humanaPlayerExists(player.getUniqueId()) && !player.isOp()) {
						// ** Ask if they want to change and tell what is lost
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou can't change classes right now, contact server admin if this is a problem."));
					}
				}
				
				
				
				
				
				
				
				
				
				/*if (clickedTarusNationJoinSign && !player.isOp()) {
					
					// ** Checks if the player is already in tarus or humana
					if (Main.data.tarusPlayerExists(player.getUniqueId()) || Main.data.humanaPlayerExists(player.getUniqueId())) {
						
						// ** Sends error message
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou are already in a nation!"));
						
					} else {
						
						// ** If they are not in a nation add to tarusplayers table
						Main.data.addTarusPlayer(player.getUniqueId(), player.getName());
						Main.data.removePlayer(player.getUniqueId());
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ohas joined the &c&oTarus &e&onation.");
						
					}
					
					// ** If player is op and clicked tarus nation sign
				} else if (clickedTarusNationJoinSign && player.isOp()) {
					
					// ** Sends error message
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't join &c&oTarus &7&onation as operator!"));
					
					// ** Player Class Select
				} else if (clickedSelectClass && !player.isOp()) {
					
					if (!Main.data.tarusPlayerExists(player.getUniqueId()) || !Main.data.humanaPlayerExists(player.getUniqueId())) {
						
						// ** Sends error message
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou need to select a nation before you can select a class!"));
						
					} else if (clickedTarusWarriorSign && Main.data.tarusPlayerExists(player.getUniqueId())) {
						
						// ** Set player as Warrior class
						Main.data.addTarusPlayerClass(player.getUniqueId(), player.getName(), "warrior");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &7&oWarrior");
						
					} else if (clickedTarusAssassinSign && Main.data.tarusPlayerExists(player.getUniqueId())) {
						
						// ** Set player as Assassin class
						Main.data.addTarusPlayerClass(player.getUniqueId(), player.getName(), "assassin");
						Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ois now a &c&oTarus &7&oAssassin");
						
					} else if (!Main.data.tarusPlayerExists(player.getUniqueId())) {
						// ** Error message if player is not in tarus nation
						player.sendMessage("&7&l> &7&oYou need to select a &9&oHumana &7&oclass!");
					}
					
				} else if (player.isOp()) {
					// ** Player is OP error
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't select class as operator!"));
				}*/
				
				
				
				/*
				
				// ** Humana
				// ** Checks if the player clicked Humana nation join sign and if player is op
				if (clickedHumanaNationJoinSign && !player.isOp()) {
							
							// ** Checks if the player is already in tarus or humana
							if (Main.data.tarusPlayerExists(player.getUniqueId()) || Main.data.humanaPlayerExists(player.getUniqueId())) {
								
								// ** Sends error message
								player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou are already in a nation!"));
							} else {
								
								// ** If they are not in a nation remove from default players table and add to tarusplayerstable
								Main.data.addHumanaPlayer(player.getUniqueId(), player.getName());
								Utils.broadcastMessage("&e&l> &e&o" + player.getName() + " &e&ohas joined the &9&oHumana &e&onation.");
							}
							
							// ** If player is op and clicked humana nation sign
						} else if (sign.getLine(2).equalsIgnoreCase(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Humana") && sign.getLine(1).equalsIgnoreCase(ChatColor.BOLD + "Join Nation")) {
							
							// ** Sends error message
							player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't join &9&oHumana &7&onation as operator!"));
						}*/
			
				// ** Leave nation
				if (sign.getLine(0).equalsIgnoreCase("leave nation") && !player.isOp()) {
					
					if (Main.data.tarusPlayerExists(player.getUniqueId())) {
						Main.data.removeTarusPlayer(player.getUniqueId());
						Main.data.addPlayer(player.getUniqueId(), player.getDisplayName());
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou left &c&oTarus &7&onation"));
					} else if (Main.data.humanaPlayerExists(player.getUniqueId())){
						Main.data.removeHumanaPlayer(player.getUniqueId());
						Main.data.addPlayer(player.getUniqueId(), player.getDisplayName());
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou left &9&oHumana &7&onation"));
					} else {
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oYou are not part of a nation!"));
					}
					
				} else if (sign.getLine(0).equalsIgnoreCase("leave nation")){
					player.sendMessage(Utils.colorTranslate("&7&l> &7&oCan't leave nations as operator!"));
				}
				
			} //else {
				//player.sendMessage("Bool = " + sqlBool);
				// ** Sends error message
				//player.sendMessage(Utils.colorTranslate("&7&l> &7&oSomething went wrong please contact server admin!"));
			
			//}
				
		//}
	}
}
