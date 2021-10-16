package rpg.kimwig.legends.functions;

import org.bukkit.Chunk;
import org.bukkit.entity.Player;

public class Zones {
	
	// ** Chunk Coordinates
	private static final int SpawnMinX = -69;
	private static final int SpawnMaxX = 68;
	private static final int SpawnMinZ = -88;
	private static final int SpawnMaxZ = 81;
	
	private static final int ArenaRightMinX = -10;
	private static final int ArenaRightMaxX = -8;
	private static final int ArenaRightMinZ = 5;
	private static final int ArenaRightMaxZ = 7;
	
	private static final int ArenaLeftMinX = 7;
	private static final int ArenaLeftMaxX = 9;
	private static final int ArenaLeftMinZ = 5;
	private static final int ArenaLeftMaxZ = 7;

	// ** Chunk ID
	private static final String Spawn_ID = "Spawn";
	private static final String ArenaRight_ID = "Arena";
	private static final String ArenaLeft_ID = "Arena";
	private static final String Unknown_ID = "Unknown";

	// ** Get Zone
	public static String getZone(Player player) {
		
		// ** Player Chunk
		Chunk playerChunk = player.getLocation().getChunk();

		// ** Player X Chunk
		final int playerChunkX = playerChunk.getX();

		// ** Player Z Chunk
		final int playerChunkZ = playerChunk.getZ();

		if (playerChunkX >= ArenaRightMinX && playerChunkX <= ArenaRightMaxX && playerChunkZ >= ArenaRightMinZ && playerChunkZ <= ArenaRightMaxZ) {
        	return ArenaRight_ID;
        } else if (playerChunkX >= ArenaLeftMinX && playerChunkX <= ArenaLeftMaxX && playerChunkZ >= ArenaLeftMinZ && playerChunkZ <= ArenaLeftMaxZ) {
        	return ArenaLeft_ID;
        } else if (playerChunkX >= SpawnMinX && playerChunkX <= SpawnMaxX && playerChunkZ >= SpawnMinZ && playerChunkZ <= SpawnMaxZ) {
        	return Spawn_ID;
        } else {
        	return Unknown_ID;
        }
	}

}
