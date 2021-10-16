package rpg.kimwig.legends.events.entity;

import org.bukkit.entity.Player;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChange {
	
	// ** Event
	public static void onEvent(FoodLevelChangeEvent event) {
		
		// ** Player
		Player player = (Player) event.getEntity();
		
		// ** Reset Exhaustion and Saturation
		player.setExhaustion(0);
		player.setSaturation(20);
		
		// ** Cancel Event
		event.setCancelled(true);
		
		// ** Return
		return;
	}

}
