package rpg.kimwig.legends.events.block;

import org.bukkit.event.block.SignChangeEvent;

import net.md_5.bungee.api.ChatColor;

public class SignChange {
	
	// ** Event
	// ** Sign Colors
	public static void onEvent(SignChangeEvent event) {
		
		// ** Loops through all lines on sign
		for (int i = 0; i < 4; i++) {
			String line = event.getLine(i);
			
			// ** If there is a "&" symbol before any text it colortranslates it
			if (line != null && !line.equals("")) {
				event.setLine(i, ChatColor.translateAlternateColorCodes('&', line));
			}
		}
	}
}
