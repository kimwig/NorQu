package rpg.kimwig.legends.events.player;

import org.bukkit.Bukkit;
import org.bukkit.Location;
//import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import rpg.kimwig.legends.Main;
import rpg.kimwig.legends.data.Texts;
//import rpg.kimwig.legends.data.items.weapons.WeaponClubs;
import rpg.kimwig.legends.utils.Utils;

public class PlayerJoin {
	
	// ** Event
	public static void onEvent(PlayerJoinEvent event) {

		// ** Player
		Player player = event.getPlayer();
		
		// ** Join Message
		PlayerJoin.sendJoinMessage(player, event);
		
		if (Main.data.tarusPlayerExists(player.getUniqueId())) {
			player.sendMessage("Class = " + Main.data.getTarusPlayerClass(player.getUniqueId()));
			player.sendMessage("Player = " + Main.data.getTarusPlayer(player.getUniqueId()));
		} else if (Main.data.humanaPlayerExists(player.getUniqueId())) {
			player.sendMessage("Class = " + Main.data.getHumanaPlayerClass(player.getUniqueId()));
			player.sendMessage("Player = " + Main.data.getHumanaPlayer(player.getUniqueId()));
		}
		
		// ** Header & Footer
		sendHeaderFooter(player, Utils.colorTranslate(Texts.tablist_header), Utils.colorTranslate(Texts.tablist_footer));
		
		// ** Spawn Teleport
		if(!player.isOp() && (Main.data.tarusPlayerExists(player.getUniqueId()) || Main.data.humanaPlayerExists(player.getUniqueId()))) {
			Location location = new Location(Bukkit.getWorld("world"), 0.0, 15.0, 0.0, 0, 0);
			player.teleport(location);
		} else if (!player.isOp()) {
			Main.data.addPlayer(player.getUniqueId(), player.getDisplayName());
			Location newPlayerSpawn = new Location(Bukkit.getWorld("world"), 0.0, 28.0, 154.0, 0, 0);
			player.teleport(newPlayerSpawn);
		}
		
		// ** Scoreboard
		ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
		Scoreboard scoreboard = scoreboardManager.getMainScoreboard();
				
		// ** If the player is not in the noCollide team add them on join
		if (!scoreboard.getTeam("noCollide").hasEntry(player.getName())) {
			scoreboard.getTeam("noCollide").addEntry(player.getName());
		}
		
		/*// ** TESTING
		if (player.isOp()) {
			
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl1());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl2());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl3());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl4());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl5());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl6());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl7());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl8());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl9());
			player.getInventory().addItem(WeaponClubs.meanLionarmLvl10());
			
			player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(1024);
			
		}*/
		
		if (!player.hasPlayedBefore()) {
			Main.data.addPlayer(player.getUniqueId(), player.getName());
		}
		
	}
	
	// ** Send Join Message
	public static void sendJoinMessage(Player player, PlayerJoinEvent event) {
		
		// ** Null Message, Broadcasting by Ourself
		event.setJoinMessage(null);
		
		// ** Name
		String pName = player.getName();
		
		// ** Op Join
		if(player.isOp()) { Utils.broadcastMessage(Texts.player_join_message_op.replace("%player%", pName)); }
		
		// ** Player Join
		else { Utils.broadcastMessage(Texts.player_join_message.replace("%player%", pName)); }
	}
	
	// ** Send Header Footer
	public static void sendHeaderFooter(Player player, String header, String footer) {
		
		// ** Set The Player List Display for header and footer
		player.setPlayerListHeaderFooter(header, footer);
	}
}
