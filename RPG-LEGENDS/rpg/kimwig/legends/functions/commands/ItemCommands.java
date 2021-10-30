package rpg.kimwig.legends.functions.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import rpg.kimwig.legends.data.items.Scrolls;
import rpg.kimwig.legends.data.items.armor.divine.DivineArmor;
import rpg.kimwig.legends.data.items.armor.shell.DexterityBonusShellArmor;
import rpg.kimwig.legends.data.items.armor.shell.HealthBonusShellArmor;
import rpg.kimwig.legends.data.items.armor.shell.IntelligenceBonusShellArmor;
import rpg.kimwig.legends.data.items.armor.shell.MagicPowerBonusShellArmor;
import rpg.kimwig.legends.data.items.armor.shell.StrengthBonusShellArmor;
import rpg.kimwig.legends.utils.Utils;

public class ItemCommands implements CommandExecutor {
	
	// ** onCommand Method
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		// ** If sender is op and writes "item"
		if (sender.isOp() && label.equalsIgnoreCase("item")) {
			
			// ** If sender is a player
			if (sender instanceof Player) {
				
				// ** Cast sender to player
				Player player = (Player) sender;
				
				// ** If player only writes "item" send error message and return true
				if (args.length == 0) {
					sender.sendMessage(ChatColor.RED + "You must select an item with /item <item>");
					
					return true;
					
					// ** If player specifies right item it gives it to them and sends a message to the player or broadcast's it
				} else if (args.length <= 1) {
					
					// ** Magic Power Shell Armor
					
					// ** MP Shell Helmet +1 to +10
					if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+1)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+2)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+3)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+4)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+5)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+6)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+7)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+8)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+9)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Helmet_(+10)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellHelmetLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 10);
						
						return true;
						
					} 
					
					// ** MP Shell Pauldrons +1 to +10
					else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+1)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+2)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+3)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+4)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+5)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+6)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+7)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+8)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+9)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pauldron_(+10)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPauldronLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 10);
						
						return true;
						
					}
					
					// ** MP Shell Pads +1 to +10
					if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+1)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+2)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+3)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+4)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+5)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+6)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+7)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+8)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+9)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Pads_(+10)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellPadsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 10);
						
						return true;
						
					} 
					
					// ** MP Shell Boots +1 to +10
					else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+1)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+2)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+3)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+4)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+5)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+6)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+7)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+8)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+9)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Magic_Power_Shell_Boots_(+10)")) {
						
						player.getInventory().addItem(MagicPowerBonusShellArmor.magicPowerShellBootsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 10);
						
						return true;
						
					}
					
					
					
					
					
					// ** Strength Shell Armor
					
					
					
					
					
					// ** STR Shell Helmet +1 to +10
					if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+1)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+2)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+3)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+4)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+5)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+6)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+7)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+8)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+9)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Helmet_(+10)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellHelmetLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 10);
						
						return true;
						
					} 
					
					// ** STR Shell Pauldrons +1 to +10
					else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+1)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+2)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+3)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+4)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+5)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+6)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+7)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+8)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+9)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pauldron_(+10)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPauldronLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 10);
						
						return true;
						
					}
					
					// ** STR Shell Pads +1 to +10
					if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+1)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+2)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+3)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+4)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+5)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+6)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+7)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+8)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+9)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Pads_(+10)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellPadsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 10);
						
						return true;
						
					} 
					
					// ** STR Shell Boots +1 to +10
					else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+1)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+2)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+3)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+4)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+5)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+6)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+7)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+8)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+9)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Strength_Shell_Boots_(+10)")) {
						
						player.getInventory().addItem(StrengthBonusShellArmor.strengthShellBootsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 10);
						
						return true;
						
					}
					
					
					
					
					
					// ** Intelligence Shell Armor
					
					
					
					
					
					// ** int Shell Helmet +1 to +10
					if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+1)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+2)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+3)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+4)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+5)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+6)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+7)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+8)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+9)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Helmet_(+10)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellHelmetLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 10);
						
						return true;
						
					} 
					
					// ** int Shell Pauldrons +1 to +10
					else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+1)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+2)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+3)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+4)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+5)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+6)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+7)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+8)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+9)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pauldron_(+10)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPauldronLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 10);
						
						return true;
						
					}
					
					// ** int Shell Pads +1 to +10
					if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+1)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+2)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+3)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+4)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+5)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+6)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+7)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+8)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+9)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Pads_(+10)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellPadsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 10);
						
						return true;
						
					} 
					
					// ** int Shell Boots +1 to +10
					else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+1)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+2)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+3)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+4)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+5)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+6)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+7)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+8)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+9)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Intelligence_Shell_Boots_(+10)")) {
						
						player.getInventory().addItem(IntelligenceBonusShellArmor.intelligenceShellBootsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 10);
						
						return true;
						
					}
					
					
					
					
					
					// ** Dexterity Shell Armor
					
					
					
					
					
					// ** DEX Shell Helmet +1 to +10
					if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+1)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+2)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+3)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+4)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+5)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+6)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+7)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+8)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+9)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Helmet_(+10)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellHelmetLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 10);
						
						return true;
						
					} 
					
					// ** DEX Shell Pauldrons +1 to +10
					else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+1)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+2)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+3)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+4)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+5)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+6)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+7)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+8)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+9)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pauldron_(+10)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPauldronLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 10);
						
						return true;
						
					}
					
					// ** DEX Shell Pads +1 to +10
					if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+1)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+2)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+3)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+4)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+5)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+6)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+7)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+8)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+9)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Pads_(+10)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellPadsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 10);
						
						return true;
						
					} 
					
					// ** DEX Shell Boots +1 to +10
					else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+1)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+2)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+3)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+4)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+5)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+6)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+7)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+8)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+9)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Dexterity_Shell_Boots_(+10)")) {
						
						player.getInventory().addItem(DexterityBonusShellArmor.dexterityShellBootsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 10);
						
						return true;
						
					}
					
					
					
					
					// ** Health Shell Armor
					
					
					
					
					
					// ** HP Shell Helmet +1 to +10
					if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+1)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+2)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+3)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+4)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+5)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+6)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Helmet", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+7)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+8)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+9)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Helmet_(+10)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellHelmetLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Helmet", 10);
						
						return true;
						
					} 
					
					// ** HP Shell Pauldrons +1 to +10
					else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+1)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+2)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+3)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+4)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+5)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+6)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pauldron", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+7)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+8)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+9)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pauldron_(+10)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPauldronLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pauldron", 10);
						
						return true;
						
					}
					
					// ** HP Shell Pads +1 to +10
					if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+1)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+2)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+3)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+4)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+5)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+6)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Pads", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+7)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+8)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+9)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Pads_(+10)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellPadsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Pads", 10);
						
						return true;
						
					} 
					
					// ** HP Shell Boots +1 to +10
					else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+1)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl1());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 1));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+2)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl2());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 2));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+3)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl3());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 3));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+4)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl4());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 4));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+5)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl5());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 5));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+6)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl6());
						player.sendMessage(Utils.broadcastItemPickupUnderLvl7("Shell Boots", 6));
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+7)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl7());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+8)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl8());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+9)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl9());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Health_Shell_Boots_(+10)")) {
						
						player.getInventory().addItem(HealthBonusShellArmor.healthShellBootsLvl10());
						Utils.broadcastItemPickupAboveLvl7(player.getName(), "Shell Boots", 10);
						
						return true;
						
					}
					
					
					
					
					
					// ** Divine Armor
					
					
					
					
					
					// **  Divine Helmet +1 to +10
					if (args[0].equalsIgnoreCase("Divine_Helmet_(+1)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl1());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 1);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+2)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl2());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 2);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+3)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl3());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 3);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+4)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl4());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 4);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+5)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl5());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 5);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+6)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl6());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 6);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+7)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl7());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+8)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl8());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+9)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl9());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Helmet_(+10)")) {
						
						player.getInventory().addItem(DivineArmor.divineHelmetLvl10());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Helmet", 10);
						
						return true;
						
					} 
					
					// **  Divine Pauldrons +1 to +10
					else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+1)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl1());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 1);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+2)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl2());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 2);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+3)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl3());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 3);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+4)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl4());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 4);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+5)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl5());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 5);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+6)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl6());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 6);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+7)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl7());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+8)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl8());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+9)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl9());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pauldron_(+10)")) {
						
						player.getInventory().addItem(DivineArmor.divinePauldronLvl10());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pauldron", 10);
						
						return true;
						
					}
					
					// **  Divine Pads +1 to +10
					if (args[0].equalsIgnoreCase("Divine_Pads_(+1)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl1());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 1);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+2)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl2());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 2);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+3)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl3());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 3);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+4)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl4());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 4);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+5)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl5());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 5);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+6)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl6());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 6);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+7)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl7());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+8)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl8());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+9)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl9());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Pads_(+10)")) {
						
						player.getInventory().addItem(DivineArmor.divinePadsLvl10());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Pads", 10);
						
						return true;
						
					} 
					
					// **  Divine Boots +1 to +10
					else if (args[0].equalsIgnoreCase("Divine_Boots_(+1)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl1());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 1);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+2)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl2());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 2);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+3)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl3());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 3);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+4)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl4());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 4);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+5)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl5());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 5);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+6)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl6());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 6);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+7)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl7());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 7);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+8)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl8());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 8);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+9)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl9());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 9);
						
						return true;
						
					} else if (args[0].equalsIgnoreCase("Divine_Boots_(+10)")) {
						
						player.getInventory().addItem(DivineArmor.divineBootsLvl10());
						Utils.broadcastUniqueItemPickup(player.getName(), "Divine Boots", 10);
						
						return true;
						
					}
					
					
					
					
					
					// ** Scrolls
					
					
					
					
					
					// ** Blessed Scroll
					if (args[0].equalsIgnoreCase("Blessed_Scroll")) {
						player.getInventory().addItem(Scrolls.blessedScroll());
						player.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + " > " + ChatColor.RESET + "" + ChatColor.DARK_PURPLE + "Picked up Scroll (Blessed)");
						return true;
					}
					
					// ** High Scroll
					if (args[0].equalsIgnoreCase("High_Scroll")) {
						player.getInventory().addItem(Scrolls.highScroll());
						player.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + " > " + ChatColor.RESET + "" + ChatColor.DARK_PURPLE + "Picked up Scroll (High)");
						return true;
					}
					
					// ** Middle Scroll
					if (args[0].equalsIgnoreCase("Middle_Scroll")) {
						player.getInventory().addItem(Scrolls.middleScroll());
						player.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + " > " + ChatColor.RESET + "" + ChatColor.DARK_PURPLE + "Picked up Scroll (Middle)");
						return true;
					}
					
					// ** Low Scroll
					if (args[0].equalsIgnoreCase("Low_Scroll")) {
						player.getInventory().addItem(Scrolls.lowScroll());
						player.sendMessage(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + " > " + ChatColor.RESET + "" + ChatColor.DARK_PURPLE + "Picked up Scroll (Low)");
						
						return true;
					}
					
					
					
				}
				
			} else {
				sender.sendMessage(ChatColor.RED + "Consoles can't get items");
				
				return true;
			}
			
		} else {
			
			return true;
		}
		
		
		return false;
	}

}
