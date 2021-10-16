package rpg.kimwig.legends.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
	
	// ** Connection variables
	private String host = "localhost";
	private String port = "3306";
	private String database = "norqu";
	private String username = "root";
	private String password = "";
	
	// ** Connection
	private Connection connection;
	
	// ** Checks if database is connected
	public boolean isConnected() {
		return (connection == null ? false : true);
	}
	
	// ** Connects to the database
	public void connect() throws ClassNotFoundException, SQLException {
		if (!isConnected()) {
			connection = DriverManager.getConnection("jdbc:mysql://" + 
					host + ":" + port + "/" + database + "?useSSL=false",
					username, password);
		}
	}
	
	// ** Disconnects from the database
	public void disconnect() {
		if (isConnected()) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// ** Gets the database connection
	public Connection getConnection() {
		return connection;
	}

}
