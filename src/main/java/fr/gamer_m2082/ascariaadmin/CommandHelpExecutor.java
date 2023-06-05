package fr.gamer_m2082.ascariaadmin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHelpExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if(sender instanceof Player) {

            player.sendMessage("----ASCARIA HELP----");
            player.sendMessage(ChatColor.GREEN + "/admin : set your admin mode to on");
            player.sendMessage("--------------------");

        }else {
            Bukkit.getConsoleSender().sendMessage("Admin - test -help");
        }




        return true;
    }


}
