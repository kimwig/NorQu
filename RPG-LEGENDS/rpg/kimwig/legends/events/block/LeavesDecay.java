package rpg.kimwig.legends.events.block;

import org.bukkit.event.block.LeavesDecayEvent;

public class LeavesDecay {
	
	// ** Event
	public static void onEvent(LeavesDecayEvent event) {
		
		// ** Cancel Event
		event.setCancelled(true);
		
		// ** Return
		return;
	}

}
