package me.Zacx.PH.Main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PhListener implements Listener {
	
	static Core main;
	
	public PhListener(Core plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
		main = plugin;
	}
	
	@EventHandler
	public void onBreak(BlockPlaceEvent e) {}
	
}