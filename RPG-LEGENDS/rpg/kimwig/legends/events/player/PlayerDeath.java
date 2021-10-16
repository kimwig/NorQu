package rpg.kimwig.legends.events.player;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.PlayerDeathEvent;

import rpg.kimwig.legends.data.Texts;
import rpg.kimwig.legends.functions.Zones;
import rpg.kimwig.legends.utils.Utils;

public class PlayerDeath {
	
	// ** Event
	public static void onEvent(PlayerDeathEvent event) {
		
		Player player = event.getEntity();
		
		Player killer = player.getKiller();
		
		if (Zones.getZone(player) == "Arena") {
			sendDeathMessage(player, killer, event);
		}
	}
	
	public static void sendDeathMessage(Player player, Player killer, PlayerDeathEvent event) {
		
		event.setDeathMessage(null);
		
		String playerName = player.getName();
		
		String killerName = killer.getName();
		
		Utils.broadcastMessage(Texts.player_death_message_arena.replace("%player%", playerName).replace("%killer%", killerName));
		
	}

}
