package rpg.kimwig.legends;

import java.sql.SQLException;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

import rpg.kimwig.legends.data.Config;
import rpg.kimwig.legends.data.recipes.DivineRecipes;
import rpg.kimwig.legends.functions.Timers;
import rpg.kimwig.legends.functions.commands.ItemCommands;
import rpg.kimwig.legends.functions.commands.SpawnCommand;
import rpg.kimwig.legends.functions.commands.TeleportCommand;
import rpg.kimwig.legends.sql.MySQL;
import rpg.kimwig.legends.sql.SQLGetter;
import rpg.kimwig.legends.utils.Utils;

public class Main extends JavaPlugin {
	
	// ** Plugin
	public static Plugin plugin;
	public static Server server;
	public static PluginManager pluginManager;
	public static BukkitScheduler scheduler;
	
	public static MySQL SQL;
	public static SQLGetter data;
	
	// ** onEnable
	public void onEnable() {
		
		// ** Plugin
		plugin = this;
		
		// ** Server
		server = plugin.getServer();
		
		// ** Plugin Manager
		pluginManager = server.getPluginManager();
		
		// ** Scheduler
		scheduler = server.getScheduler();
		
		SQL = new MySQL();
		
		data = new SQLGetter();
		
		try {
			SQL.connect();
		} catch (ClassNotFoundException | SQLException e) {
			Utils.consonleMessage("Database not connected");
		}
		
		if (SQL.isConnected()) {
			Utils.consonleMessage("Database connected");
			data.createPlayerTable();
			data.createTarusPlayerTable();
			data.createHumanaPlayerTable();
		}
		
		// ** Registers commands
		this.getCommand("item").setExecutor(new ItemCommands());
		this.getCommand("spawn").setExecutor(new SpawnCommand());
		this.getCommand("areatp").setExecutor(new TeleportCommand());
		
		// ** Load Config
		Config.loadConfig();
		
		// ** Load Timers
		Timers.startTimers();
		
		// ** Register Listener
		pluginManager.registerEvents(new MainListener(), this);
		
		// ** Creating noCollide team
		noCollide();
		
		// ** Add recipes
		Bukkit.addRecipe(DivineRecipes.divineHelmetRecipes());
		Bukkit.addRecipe(DivineRecipes.divinePauldronRecipes());
		Bukkit.addRecipe(DivineRecipes.divinePadsRecipes());
		Bukkit.addRecipe(DivineRecipes.divineBootsRecipes());
	}
	
	// ** onDisable
	public void onDisable() {
		
		// ** Save Config
		Config.saveConfig();
		
		// ** Reset Tasks
		scheduler.cancelTasks(plugin);
		
		// ** Reset Plugin
		plugin = null;
		
		SQL.disconnect();
	}
	
	public static void noCollide() {
		
		// ** Scoreboard
		ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
		Scoreboard scoreboard = scoreboardManager.getMainScoreboard();
		
		// ** Creates noCollide Team
		if (scoreboard.getTeam("noCollide") == null) {
			Team team = scoreboard.registerNewTeam("noCollide");
			team.setOption(Team.Option.COLLISION_RULE, Team.OptionStatus.NEVER);
		}
	}

}
