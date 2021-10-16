package rpg.kimwig.legends.events.entity;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import rpg.kimwig.legends.functions.Zones;

public class EntityDamageByEntity {
	
	// ** Event
	public static void onEvent(EntityDamageByEntityEvent event) {
		
		if (event.getEntity() instanceof Player) {
					
					Player player = (Player) event.getEntity();
					
					if (Zones.getZone(player) == "Spawn") {
						event.setCancelled(true);
					}
					
				}
		
	}

}
