package rpg.kimwig.legends.data;

import java.util.HashMap;
import java.util.UUID;

public class Data {
	
	// ** Player Game
	public static HashMap<UUID, Long> playerCoins = new HashMap<UUID, Long>();
	
	// ** Write
	public static void setPlayerCoins(UUID pUUID, long pCoins) {
		
		// ** Not Less Than 0
		if(pCoins < 0) { pCoins = 0; }
		
		// ** Not Larger Than MAX
		if(pCoins > Long.MAX_VALUE) { pCoins = Long.MAX_VALUE; }
		
		// ** Save
		Data.playerCoins.put(pUUID, pCoins);
	}

}
