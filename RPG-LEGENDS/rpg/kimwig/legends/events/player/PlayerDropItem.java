package rpg.kimwig.legends.events.player;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerDropItemEvent;

public class PlayerDropItem {
	
	// ** Event
	public static void onEvent(PlayerDropItemEvent event) {
		
		// ** Player
		Player player = event.getPlayer();
		
		// ** Item drop
		Item itemDrop = event.getItemDrop();
		
		// ** Not Allowed
		if(player.isOp() == false) {
			
			// ** If coal is being dropped
			if (itemDrop.getItemStack().getType().equals(Material.COAL)) {
				
				// ** Remove coal
				itemDrop.remove();
				
			} else {
				
				// ** Else cancel event
				event.setCancelled(true);
			}
			
		}
		
		// ** Return
		return;
	}
}
