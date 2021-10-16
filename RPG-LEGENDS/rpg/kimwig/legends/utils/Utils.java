package rpg.kimwig.legends.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;

import rpg.kimwig.legends.Main;

public class Utils {
	
	// ** Color Translate
	public static final String colorTranslate(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	// ** Number Format
	public static final String format(double value) {
		DecimalFormat formatter = new DecimalFormat("#, ###");
		DecimalFormatSymbols symbol = new DecimalFormatSymbols();
		symbol.setGroupingSeparator(',');
		formatter.setDecimalFormatSymbols(symbol);
		return formatter.format(value);
	}
	
	// ** Broadcast Message
	public static void broadcastMessage(String message) {
		
		// ** Message
		if (message == null || message.isEmpty()) { return; }
		
		// ** Color
		message = Utils.colorTranslate(message);
		
		// ** Broadcast
		Main.server.broadcastMessage(message);
		
		// ** Return
		return;
	}
	
	// ** Broadcast unique item pickup
	public static void broadcastUniqueItemPickup(String player, String item, int level) {
		
		// ** Unique message
		String message = Utils.colorTranslate("&6&l > &6&o" + player + " picked up " + item + " (+" + level + ")");
		
		// ** Message
		if (item == null || item.isEmpty()) { return; }
		
		// ** Broadcast
		Main.server.broadcastMessage(message);
		
		// ** Return
		return;
		
	}
	
	// ** Broadcast rare, uncommon and common item pickup under level 7
	public static String broadcastItemPickupUnderLvl7(String item, int level) {
		
		// ** Unique message
		String message = Utils.colorTranslate("&5&l > &5&oPicked up " + item + " (+" + level + ")");
		
		// ** Return
		return message;
		
	}
	
	// ** Broadcast rare, uncommon and common item pickup above level 7
	public static void broadcastItemPickupAboveLvl7(String player, String item, int level) {
			
		// ** Unique message
		String message = Utils.colorTranslate("&5&l > &5&o" + player + " picked up "+ item + " (+" + level + ")");
			
		// ** Message
		if (item == null || item.isEmpty()) { return; }
			
		// ** Broadcast
		Main.server.broadcastMessage(message);
			
		// ** Return
		return;
		
		}
	
	// ** Broadcast unique upgrade
	public static void broadcastUniqueUpgrade(String player, String item, int level) {
		
		// ** Unique message
		String message = Utils.colorTranslate("&6&l > &6&o" + player + " upgraded " + item + " (+" + level + ")");
		
		// ** Message
		if (item == null || item.isEmpty()) { return; }
		
		// ** Broadcast
		Main.server.broadcastMessage(message);
		
		// ** Return
		return;
		
	}
	
	// ** Broadcast unique upgrade fail
	public static void broadcastUniqueUpgradeFail(String player, String item, int level) {
			
		// ** Unique message
		String message = Utils.colorTranslate("&6&l > &6&o" + player + " destroyed " + item + " (+" + level + ")");
			
		// ** Message
		if (item == null || item.isEmpty()) { return; }
			
		// ** Broadcast
		Main.server.broadcastMessage(message);
			
		// ** Return
		return;
			
		}
	
	
	// ** Console Message
	public static void consonleMessage(String message) {
		
		// ** Gets consolesender
		ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		
		// ** Message
		if (message == null || message.isEmpty()) { return; }
		
		// ** Send console message
		console.sendMessage(Utils.colorTranslate("&a[&fNor&2Qu&a] &b" + message));
		
		// ** Return
		return;
	}

}
