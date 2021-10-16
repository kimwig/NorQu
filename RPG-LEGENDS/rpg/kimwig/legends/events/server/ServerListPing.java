package rpg.kimwig.legends.events.server;

import org.bukkit.event.server.ServerListPingEvent;

import rpg.kimwig.legends.data.Texts;
import rpg.kimwig.legends.utils.Utils;

public class ServerListPing {
	
	// ** onEvent
	public static void onEvent(ServerListPingEvent event) {
		
		// ** Motd
		event.setMotd(Utils.colorTranslate(Texts.server_motd));
		
		// ** Return
		return;
	}

}
