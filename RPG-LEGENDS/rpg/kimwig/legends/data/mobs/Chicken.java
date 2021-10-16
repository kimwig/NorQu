package rpg.kimwig.legends.data.mobs;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.craftbukkit.v1_17_R1.CraftWorld;

import net.minecraft.network.chat.ChatComponentText;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.animal.EntityChicken;

public class Chicken extends EntityChicken {
	
	// ** Random Object
	Random random = new Random();
	
	// ** Spawn Coordinates for Blood Chicken
	int bloodChickenRandomX = ((random.nextInt(14 - 4 + 1) + 4) - 18);
	int bloodChickenRandomZ = ((random.nextInt(26 - 18 + 1) + 18) - 44);
	
	// ** Chicken Constructor
	public Chicken(World world) {
		super(EntityTypes.l, (((CraftWorld) world).getHandle()));
		this.setPosition(bloodChickenRandomX, 15, bloodChickenRandomZ);
		
		this.setCustomNameVisible(true);
		this.setCustomName(new ChatComponentText("Blood Chicken"));
		Bukkit.broadcastMessage("X: " + bloodChickenRandomX + " Z: " + bloodChickenRandomZ);
	}
	
	public void initPathfinder() {
		this.setGoalTarget(getLastDamager(), null, true);
	}
	
	

}
