package fr.gamer_m2082.ascariaadmin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTestExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        Player player = (Player) sender;

        if (!(sender instanceof Player) ){

            player.sendMessage("Already start");


            return true;
        }
        else {

            player.sendMessage(ChatColor.RED + "AscariaAdminTools strating = true : build-version:1.1.0");

            String startText = "Ascaria Admin plugin \n " +
                    " By Gamer_m2082 \n" +
                    " Start load \n" +
                    " Load status successful \n "+
                    " /Help inGame for more \n"+
                    " On ready";
            Bukkit.getConsoleSender().sendMessage( ChatColor.GREEN + startText);

            return true;
        }

    }
}
