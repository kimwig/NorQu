package rpg.kimwig.legends.functions;

import java.util.HashMap;

import rpg.kimwig.legends.utils.Utils;

public class Economy {
	
	// ** Hash Map
	public static final HashMap<String, Double> coins = new HashMap<String, Double>();
	
	// ** Set Coins
	public static void setCoins(String uuid, double amount) {
		coins.put(uuid, amount);
	}
	
	// ** Add Coins
	public static void addCoins(String uuid, double amount) {
		coins.replace(uuid, getCoins(uuid), getCoins(uuid) + amount);
	}
	
	// ** Subtract Coins
	public static void subtractCoins(String uuid, double amount) {
		coins.replace(uuid, getCoins(uuid), getCoins(uuid) - amount);
	}
	
	// ** Get Coins
	public static Double getCoins(String uuid) {
		return coins.get(uuid);
	}
	
	// ** Get Coins String
	public static String getCoinsString(String uuid) {
		return Utils.format(getCoins(uuid));
	}

}
