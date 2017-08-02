package me.Zacx.PH.Main;

import java.util.HashMap;
import java.util.HashSet;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin {	
	
	@Override
	public void onEnable() {
		new PhListener(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = null;
		
		if (sender instanceof Player)
		{
			p = (Player) sender;
		}
			
		if (cmd.getName().equalsIgnoreCase("gmc") && p.hasPermission(Access.PERM_MODERATOR)) {
			
			p.setGameMode(GameMode.CREATIVE);
			p.sendMessage("§aToggled gamemode to: §bCreative§a.");
			
		} else if (cmd.getName().equalsIgnoreCase("gms") && p.hasPermission(Access.PERM_MODERATOR)) {
			
			p.setGameMode(GameMode.CREATIVE);
			p.sendMessage("§aToggled gamemode to: §bSurvival§a.");
			
		} else if (cmd.getName().equalsIgnoreCase("gma") && p.hasPermission(Access.PERM_MODERATOR)) {
				
				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage("§aToggled gamemode to: §bAdventure§a.");
				
			} else if (cmd.getName().equalsIgnoreCase("tp") && p.hasPermission(Access.PERM_HELPER)) {
				
				if (args.length < 1)
				{
					p.sendMessage("§c/tp [Player]");
					return true;
				}
				
				Player tar = Bukkit.getPlayer(args[0]);
				
				if (tar == null)
				{
					p.sendMessage("§cPlayer not found!");
					return true;
				}
				
				p.teleport(tar.getLocation().getBlock().getLocation());
				p.sendMessage("§aTeleporting");
				
			}
		
		return true;	
		
	}
	
}