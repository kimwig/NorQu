package rpg.kimwig.legends.events.block;

//import java.util.Random;

//import org.bukkit.Material;
//import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;

//import rpg.kimwig.legends.data.items.Items;
//import rpg.kimwig.legends.utils.Utils;

public class BlockBreak {
	
	// ** Event
	//@SuppressWarnings("deprecation")
	public static void onEvent(BlockBreakEvent event) {
		
		// ** Player
		Player player = event.getPlayer();
		
		// ** Not Allowed
		if(player.isOp() == false) { event.setCancelled(true); }
		
		/*Block block = event.getBlock();
		Random random = new Random();
		
		if (block.getBlockData().getMaterial().equals(Material.COAL_ORE)) {
			
			int randomInt = random.nextInt(10 - 0) - 0;
			
			if (player.getInventory().contains(Items.miningPickaxe())) {
				
				if (player.getItemInHand().equals(Items.miningPickaxe())) {
					
					if (randomInt < 2) {
						player.getInventory().addItem(Items.mysteriousOre());
						player.sendMessage(Utils.colorTranslate("&l&3> &r&3Picked up Mysterious Ore"));
						player.giveExp(5);
						player.sendMessage(Utils.colorTranslate("&l&3> &r&3Recieved 5 exp"));
						event.setCancelled(true);
					} else {
						player.giveExp(5);
						player.sendMessage(Utils.colorTranslate("&l&3> &r&3Recieved 5 exp"));
						event.setCancelled(true);
					}
				} else {
					event.setCancelled(true);
				}
				
			} else {
				player.getInventory().addItem(Items.miningPickaxe());
				player.giveExp(5);
				player.sendMessage(Utils.colorTranslate("&l&3> &r&3Recieved 5 exp"));
				event.setCancelled(true);
			}
			
		}*/
		
		
		
		
		
		// ** Return
		return;
	}

}
