package rpg.kimwig.legends.events.inventory;

import org.bukkit.event.inventory.InventoryDragEvent;

public class InventoryDrag {
	
	// ** Event
	public static void onEvent(InventoryDragEvent event) {
		
		// ** Cancel Event
		event.setCancelled(true);
		
		// ** Return
		return;
	}

}
