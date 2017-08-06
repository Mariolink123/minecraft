package me.sogbagpipes;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEggThrowEvent;


public class PlayerListener implements Listener {
	
		public PlayerListener(EventHandle plugin) {
			plugin.getServer().getPluginManager().registerEvents(this, plugin);

 }
		@EventHandler
		public void onThrow(PlayerEggThrowEvent e) {
			
			Player player = e.getPlayer();
			
			player.sendMessage(ChatColor.RED + "DO NOT THROW EGGS!");
			player.damage(9);
		}}
			
		
