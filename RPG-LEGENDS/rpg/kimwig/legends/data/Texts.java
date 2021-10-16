package rpg.kimwig.legends.data;

import rpg.kimwig.legends.functions.Tags;

public class Texts {
	
	public static String server_name = "&f&lNor";
	public static String server_subname = "&2&lQu";
	public static String server_url = "&b&nwww.norqu.se";
	public static String server_motd = server_name + "&r" + server_subname + "&r\n" + server_url + "&r";
	
	public static String tablist_header = server_name + "&r" + server_subname + "&r\n";
	public static String tablist_footer = "&r\n" + server_url + "&r";
	
	public static String player_join_message = Tags.grayDark + "&o%player% logged in.";
	public static String player_join_message_op = Tags.pink + "&o%player% logged in.";
	public static String player_quit_message = Tags.grayDark + "&o%player% logged out.";
	public static String player_quit_message_op = Tags.pink + "&o%player% logged out.";
	
	public static String player_death_message_arena = "&e- (Arena) %killer% has defeated %player% -";

}
