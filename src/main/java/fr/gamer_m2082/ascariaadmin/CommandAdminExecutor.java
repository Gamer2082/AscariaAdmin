package fr.gamer_m2082.ascariaadmin;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAdminExecutor implements CommandExecutor {

    private boolean onAdmin = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Viens jeux en pour cette command ?");
            return true;
        }

        Player player = (Player) sender;
        toggleAdminMode(player);

        return true;
    }

    private void toggleAdminMode(Player player) {

        // get
        GameMode Gamemode = player.getGameMode();

        if (!onAdmin) {
            // Activer le mode administrateur
            player.setAllowFlight(true);
            player.setDisplayName(" ");
            player.setFlySpeed(2f);
            player.setCustomName(" ");
            player.setPlayerListName(" ");
            player.setGameMode(GameMode.CREATIVE);
            player.setCollidable(false);
            onAdmin = true;
            player.sendMessage(ChatColor.GREEN+"Mode administrateur ON");
        } else {
            // Désactiver le mode administrateur
            player.setAllowFlight(false);
            player.setDisplayName(player.getName());
            player.setFlySpeed(1.5f);
            player.setCustomName(null);
            player.setPlayerListName(player.getName());
            player.setGameMode(Gamemode);
            player.setCollidable(true);
            onAdmin = false;
            player.sendMessage(ChatColor.RED+"Mode administrateur OFF");
        }
    }
}
