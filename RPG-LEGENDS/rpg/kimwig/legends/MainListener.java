package rpg.kimwig.legends;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.server.ServerListPingEvent;

import rpg.kimwig.legends.events.block.BlockBreak;
import rpg.kimwig.legends.events.block.BlockPlace;
import rpg.kimwig.legends.events.block.LeavesDecay;
import rpg.kimwig.legends.events.block.PlayerInteract;
import rpg.kimwig.legends.events.block.SignChange;
import rpg.kimwig.legends.events.entity.EntityCombust;
import rpg.kimwig.legends.events.entity.EntityDamage;
import rpg.kimwig.legends.events.entity.EntityDamageByEntity;
import rpg.kimwig.legends.events.entity.FoodLevelChange;
import rpg.kimwig.legends.events.inventory.CraftItem;
import rpg.kimwig.legends.events.inventory.InventoryDrag;
import rpg.kimwig.legends.events.inventory.PrepareItemCraft;
import rpg.kimwig.legends.events.player.PlayerChat;
import rpg.kimwig.legends.events.player.PlayerDeath;
import rpg.kimwig.legends.events.player.PlayerDropItem;
import rpg.kimwig.legends.events.player.PlayerJoin;
import rpg.kimwig.legends.events.player.PlayerQuit;
import rpg.kimwig.legends.events.player.PlayerVelocity;
import rpg.kimwig.legends.events.server.ServerListPing;

public class MainListener implements Listener {
	
	//**Block
	
	@EventHandler
	void onEvent(BlockBreakEvent event) { BlockBreak.onEvent(event); }
	
	@EventHandler
	void onEvent(BlockPlaceEvent event) { BlockPlace.onEvent(event); }
	
	@EventHandler
	void onEvent(LeavesDecayEvent event) { LeavesDecay.onEvent(event); }
	
	@EventHandler
	void onEvent(SignChangeEvent event) { SignChange.onEvent(event); }
	
	//**Entity
	
	@EventHandler
	void onEvent(EntityCombustEvent event) { EntityCombust.onEvent(event); }
	
	@EventHandler
	void onEvent(EntityDamageEvent event) { EntityDamage.onEvent(event); }
	
	@EventHandler
	void onEvent(FoodLevelChangeEvent event) { FoodLevelChange.onEvent(event); }
	
	@EventHandler
	void onEvent(EntityDamageByEntityEvent event) { EntityDamageByEntity.onEvent(event); }
	
	// ** Inventory
	
	@EventHandler
	void onEvent(InventoryDragEvent event) { InventoryDrag.onEvent(event); }
	
	@EventHandler
	void onEvent(CraftItemEvent event) { CraftItem.onEvent(event); }
	
	@EventHandler
	void onEvent(PrepareItemCraftEvent event) { PrepareItemCraft.onEvent(event); }
	
	// ** Player
	
	@EventHandler
	void onEvent(PlayerDropItemEvent event) { PlayerDropItem.onEvent(event); }
	
	@EventHandler
	void onEvent(PlayerJoinEvent event) { PlayerJoin.onEvent(event); }
	
	@EventHandler
	void onEvent(PlayerQuitEvent event) { PlayerQuit.onEvent(event); }
	
	@EventHandler
	void onEvent(PlayerVelocityEvent event) { PlayerVelocity.onEvent(event); }
	
	@EventHandler
	void onEvent(AsyncPlayerChatEvent event) { PlayerChat.onEvent(event); }
	
	@EventHandler
	void onEvent(PlayerInteractEvent event) { PlayerInteract.onEvent(event); }
	
	@EventHandler
	void onEvent(PlayerDeathEvent event) { PlayerDeath.onEvent(event); }
	
	// ** Server
	
	@EventHandler
	void onEvent(ServerListPingEvent event) { ServerListPing.onEvent(event); }
}
