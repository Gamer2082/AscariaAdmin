package fr.gamer_m2082.ascariaadmin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHelpExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (args.length == 0){



            player.sendMessage("----PLUGIN HELP----");
            player.sendMessage("§6/admin : set your admin mode to on");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage("");
            player.sendMessage("-------------------");





        } else if (args.length == 1) {



        }


        return false;
    }


}
