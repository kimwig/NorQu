package rpg.kimwig.legends.events.block;

import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;

import rpg.kimwig.legends.functions.Zones;

public class BlockPlace {
	
	// ** Event
	public static void onEvent(BlockPlaceEvent event) {
		
		// ** Player
		Player player = event.getPlayer();
		
		// ** Not Allowed
		if(player.isOp() == false) { event.setCancelled(true); }
		
		if (player.isOp()) {
			String zone = Zones.getZone(player);
			player.sendMessage(zone);
		}
		
		// ** Return
		return;

	}
}
