package rpg.kimwig.legends.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import rpg.kimwig.legends.Main;

public class SQLGetter {
	
	// ** Create Tables
	
	// ** Creates a table for players if it does not exist
	public void createPlayerTable() {
		PreparedStatement ps;
		
		try {
			ps = Main.SQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS players "
					+ "(NAME VARCHAR(100),UUID VARCHAR(100),PRIMARY KEY (NAME))");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
	
	// ** Creates a table for tarus players if it does not exist
	public void createTarusPlayerTable() {
		PreparedStatement ps;
		
		try {
			ps = Main.SQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS tarusplayers "
					+ "(NAME VARCHAR(100),UUID VARCHAR(100),CLASS VARCHAR(100),PRIMARY KEY (NAME))");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Creates a table for humana players if it does not exist
	public void createHumanaPlayerTable() {
		PreparedStatement ps;
		
		try {
			ps = Main.SQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS humanaplayers "
					+ "(NAME VARCHAR(100),UUID VARCHAR(100),CLASS VARCHAR(100),PRIMARY KEY (NAME))");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// ** Player exist checks
	
	// ** Checks to see if a player exists
	public boolean playerExists(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT * FROM players WHERE UUID=?");
			ps.setString(1, uuid.toString());
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	// ** Checks to see if a player exists in tarus player table
	public boolean tarusPlayerExists(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT * FROM tarusplayers WHERE UUID=?");
			ps.setString(1, uuid.toString());
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	// ** Checks to see if a player exists in humana player table
	public boolean humanaPlayerExists(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT * FROM humanaplayers WHERE UUID=?");
			ps.setString(1, uuid.toString());
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
	// ** Add player to table
	
	// ** Add player to table
	public void addPlayer(UUID uuid, String player) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("INSERT INTO players (NAME, UUID) "
					+ "VALUES (?,?)");
			ps.setString(1, player);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Add player to tarus table
	public void addTarusPlayer(UUID uuid, String player) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("INSERT INTO tarusplayers (NAME, UUID) "
					+ "VALUES (?,?)");
			ps.setString(1, player);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Add player to humana table
	public void addHumanaPlayer(UUID uuid, String player) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("INSERT INTO humanaplayers (NAME, UUID) "
					+ "VALUES (?,?)");
			ps.setString(1, player);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Adds Tarus player to a class
	public void addTarusPlayerClass(UUID uuid, String tarusPlayerClass) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("UPDATE tarusplayers SET CLASS = ? WHERE UUID = ?");
			ps.setString(1, tarusPlayerClass);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Adds Humana player to a class
	public void addHumanaPlayerClass(UUID uuid, String humanaPlayerClass) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("UPDATE humanaplayers SET CLASS = ? WHERE UUID = ?");
			ps.setString(1, humanaPlayerClass);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// ** Player Getters
	
	// ** Get player
	public String getPlayer(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT * FROM players WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			String player = "";
			if (rs.next()) {
				player = rs.getString("players");
				return player;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ** Get tarus player
	public String getTarusPlayer(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT * FROM tarusplayers WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			String player = "";
			if (rs.next()) {
				player = rs.getString("players");
				return player;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ** Get humana player
	public String getHumanaPlayer(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT * FROM humanaplayers WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			String player = "";
			if (rs.next()) {
				player = rs.getString("players");
				return player;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ** Get tarus player class
	public String getTarusPlayerClass(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT `CLASS` FROM `tarusplayers` WHERE `UUID` = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			String playerClass = "";
			if (rs.next()) {
				playerClass = rs.getString("CLASS");
				return playerClass;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// ** Get tarus player class
	public String getHumanaPlayerClass(UUID uuid) {
		
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("SELECT `CLASS` FROM `humanaplayers` WHERE `UUID` = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			String playerClass = "";
			if (rs.next()) {
				playerClass = rs.getString("CLASS");
				return playerClass;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	// ** Table empties
	
	// ** Empty table
	public void emtyPlayerTable() {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("TRUNCATE players");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Empty tarus table
	public void emtyTarusPlayerTable() {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("TRUNCATE tarusplayers");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Empty humana table
	public void emtyHumanaPlayerTable() {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("TRUNCATE humanaplayers");
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// ** Player Remove
	
	// ** Remove player
	public void removePlayer(UUID uuid) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("DELETE FROM players WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Remove tarus player
	public void removeTarusPlayer(UUID uuid) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("DELETE FROM tarusplayers WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Remove humana player
	public void removeHumanaPlayer(UUID uuid) {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("DELETE FROM humanaplayers WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// ** Table droppers
	
	// ** Delete table
	public void deleteAllPlayers() {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("DROP TABLE players");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Delete tarus table
	public void deleteAllTarusPlayers() {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("DROP TABLE tarusplayers");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// ** Delete humana table
	public void deleteAllHumanaPlayers() {
		try {
			PreparedStatement ps = Main.SQL.getConnection().prepareStatement("DROP TABLE humanaplayers");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
