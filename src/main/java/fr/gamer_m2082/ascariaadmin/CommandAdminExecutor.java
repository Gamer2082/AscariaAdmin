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
            sender.sendMessage(ChatColor.RED + "Cette commande ne peut être exécutée que par un joueur.");
            return true;
        }

        Player player = (Player) sender;
        toggleAdminMode(player);

        return true;
    }

    private void toggleAdminMode(Player player) {
        if (!onAdmin) {
            // Activer le mode administrateur
            player.getInventory().clear();
            player.sendMessage("Mode administrateur activé");
            player.setAllowFlight(true);
            player.setDisplayName("ADMIN");
            player.setFlySpeed(0.2f);
            player.setCustomName("ADMIN");
            player.setPlayerListName("ADMIN");
            player.setGameMode(GameMode.CREATIVE);
            player.setCollidable(false);
            onAdmin = true;
        } else {
            // Désactiver le mode administrateur
            player.sendMessage("Mode administrateur désactivé");
            player.setAllowFlight(false);
            player.setDisplayName(player.getName());
            player.setFlySpeed(0.1f);
            player.setCustomName(null);
            player.setPlayerListName(null);
            player.setGameMode(GameMode.SURVIVAL);
            player.setCollidable(true);
            onAdmin = false;
        }
    }
}
