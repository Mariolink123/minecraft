package me.sogbagpipes;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;


public class PlayerJoin implements Listener {
	
		public PlayerJoin(EventHandle plugin) {
			plugin.getServer().getPluginManager().registerEvents(this, plugin);

 }
		@EventHandler
		public void onJoin(PlayerJoinEvent e) {
			
			Player player = e.getPlayer();
			
			player.sendMessage(ChatColor.RED + "Hi you're cool");
			
	
}}
