package me.sogbagpipes;

import org.bukkit.plugin.java.JavaPlugin;

public class EventHandle extends JavaPlugin  {
	
	@Override
	public void onEnable() {
		getLogger().info("Hey! This is my test plugin op af :)");
		new PlayerListener(this); 
		new PlayerJoin(this);
		}
	@Override
	public void onDisable() {
    
	}

	
}
