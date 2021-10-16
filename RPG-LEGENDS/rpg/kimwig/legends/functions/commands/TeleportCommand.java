package rpg.kimwig.legends.functions.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import rpg.kimwig.legends.utils.Utils;

public class TeleportCommand implements CommandExecutor {
	
	// ** onCommand Method
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		// ** Check for command and if sender is OP
		if (sender.isOp() && label.equalsIgnoreCase("areatp")) {
			
			// ** Check if sender is a player or not
			if (sender instanceof Player) {
				
				// ** Cast sender to player
				Player player = (Player) sender;
				
				// ** If args are 0 send error message
				if (args.length == 0) {
					
					// ** Send message
					player.sendMessage(Utils.colorTranslate("&4You need to specify a location to teleport to!"));
					
					// ** Return
					return true;
					
					// ** If args are more than 0
				} else if (args.length >= 1) {
					
					// ** If player specifies right command
					if (args[0].equalsIgnoreCase("folken")) {
						
						// ** Folken location
						Location folken = new Location(Bukkit.getWorld("world"), -48.000, 11.000, -304.000, -90, 0);
						
						// ** Teleports player to folken
						player.teleport(folken);
						
						// ** Sends message to player
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Folken"));
						
						// ** If player specifies right command
					} else if (args[0].equalsIgnoreCase("humanadreamen")) {
						
						// ** Humana Dreamen Spawn Location
						Location humanaDreamen = new Location(Bukkit.getWorld("world"), 1768.000, 17.000, 216.000, 180, 0);
						
						// ** Teleports player to Humana Dreamen Spawn
						player.teleport(humanaDreamen);
						
						// ** Sends message to player
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Dreamen"));
						
					} else if (args[0].equalsIgnoreCase("tarusdreamen")) {
						
						// ** Tarus Dreamen Spawn Location
						Location tarusDreamen = new Location(Bukkit.getWorld("world"), 1464.000, 17.000, -216.000, 0, 0);
						
						// ** Teleports player to Tarus Dreamen Spawn
						player.teleport(tarusDreamen);
						
						// ** Sends message to player
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Dreamen"));
						
					} else if (args[0].equalsIgnoreCase("dreamen")) {
						
						// ** Dreamen Middle Spawn Location
						Location dreamen = new Location(Bukkit.getWorld("world"), 1616.000, 25.000, 0.000, 90, 0);
						
						// ** Teleports player to Dreamen Middle
						player.teleport(dreamen);
						
						// ** Sends message to player
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Dreamen"));
						
					} else if (args[0].equalsIgnoreCase("secrettemple")) {
						
						// ** Secret Temple Spawn Location
						Location st = new Location(Bukkit.getWorld("world"), 0.000, 15.000, 1552.000, 180, 0);
						
						// ** Teleports player to Secret Temple
						player.teleport(st);
						
						// ** Sends message to player
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Secret Temple"));
						
					} else if (args[0].equalsIgnoreCase("clanquest")) {
						
						// ** Clan Quest Spawn Location
						Location cq = new Location(Bukkit.getWorld("world"), -500.000, 15.000, 1552.000, 180, 0);
						
						// ** Teleports player to Clan Quest Temple
						player.teleport(cq);
						
						// ** Sends message to player
						player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Clan Quest Temple"));
						
					}
					
				}
				
			}
		}
		
		// ** Return
		return true;
	}

}
