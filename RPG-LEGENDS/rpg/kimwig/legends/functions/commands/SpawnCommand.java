package rpg.kimwig.legends.functions.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import rpg.kimwig.legends.utils.Utils;

public class SpawnCommand implements CommandExecutor {
	
	// ** onCommand Method
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		// ** Check for command
		if (label.equalsIgnoreCase("spawn")) {
			
			// ** Check if command sender is a player
			if (sender instanceof Player) {
				
				// ** Cast sender to Player
				Player player = (Player) sender;
				
				// ** Spawn location
				Location spawn = new Location(Bukkit.getWorld("world"), 0.000, 15.0000, 0.000, 0, 0);
				
				// ** Teleports player to spawn
				player.teleport(spawn);
				
				// ** Sends teleport message to player
				player.sendMessage(Utils.colorTranslate("&7&l> &7&oTraveling to Spawn"));
				
			} else {
				
				// ** Send sender message
				sender.sendMessage("You are not a player!");
			}
		}
		
		return true;
	}

}
