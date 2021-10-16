package rpg.kimwig.legends.events.player;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import rpg.kimwig.legends.Main;
import rpg.kimwig.legends.functions.Zones;
import rpg.kimwig.legends.utils.Utils;

public class PlayerChat {
	
	@EventHandler
	public static void onEvent(AsyncPlayerChatEvent event) {
		
		Player player = event.getPlayer();
		
		String opPrefix = "&d&l<&f≡&d" + player.getDisplayName() + "&d&l> &f";
		
		String playerPrefix = "&7<" + player.getDisplayName() + "&7> &f";
		
		String spawnPlayerPrefix = "&7<" + player.getDisplayName() + "&7> &7(Spawn) &f";
		
		String tarusPlayerPrefix = "&7<&c" + player.getDisplayName() + "&7> &f";
		
		//String tarusWarriorPrefix = "Â" + " &7" + player.getLevel() + " &7<&c" + player.getDisplayName() + "&7> &f";
		
		String humanaPlayerPrefix = "&7<&9" + player.getDisplayName() + "&7> &f";
		
		String message = event.getMessage();

		if (player.isOp()) {
			Utils.colorTranslate(message);
			event.setMessage(message);
		}
		
		if (player.isOp()) {
			event.setFormat(Utils.colorTranslate(opPrefix) + event.getMessage());
		} else if (Main.data.playerExists(player.getUniqueId())) {
			
			if (Zones.getZone(player) == "Spawn") {
				event.setFormat(Utils.colorTranslate(spawnPlayerPrefix + event.getMessage()));
			} else {
				event.setFormat(Utils.colorTranslate(playerPrefix + event.getMessage()));
			}
			
		} else if (Main.data.tarusPlayerExists(player.getUniqueId())) {
			event.setFormat(Utils.colorTranslate(tarusPlayerPrefix + event.getMessage()));
		} else if (Main.data.humanaPlayerExists(player.getUniqueId())) {
			event.setFormat(Utils.colorTranslate(humanaPlayerPrefix + event.getMessage()));
		}
		
	}

}
