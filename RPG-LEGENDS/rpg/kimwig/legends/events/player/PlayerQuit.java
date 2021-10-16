package rpg.kimwig.legends.events.player;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerQuitEvent;

import rpg.kimwig.legends.data.Texts;
import rpg.kimwig.legends.utils.Utils;

public class PlayerQuit {
	
	// ** Event
	public static void onEvent(PlayerQuitEvent event) {
		
		// ** Player
		Player player = event.getPlayer();
		
		// ** Quit Message
		PlayerQuit.sendQuitMessage(player, event);
		
		// ** Return
		return;
	}
	
	// ** send Quit Message
	public static void sendQuitMessage(Player player, PlayerQuitEvent event) {
		
		// ** Null Message, Broadcasting by ourself
		event.setQuitMessage(null);
		
		// ** Name
		String pName = player.getName();
		
		// ** Op Quit
		if(player.isOp()) { Utils.broadcastMessage(Texts.player_quit_message_op.replace("%player%", pName)); }
		
		// ** Player Quit
		else { Utils.broadcastMessage(Texts.player_quit_message.replace("%player%", pName)); }
		
		// ** Return
		return;
	}

}
