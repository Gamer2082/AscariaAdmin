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
            sender.sendMessage(ChatColor.RED + "Viens en pour cette command ?");
            return true;
        }

        Player player = (Player) sender;
        toggleAdminMode(player);

        return true;
    }

    private void toggleAdminMode(Player player) {

        // get
        boolean isFlight = player.getAllowFlight();
        String displaneName = player.getDisplayName();
        float flySpeed = player.getFlySpeed();
        String CustomName = player.getCustomName();
        String playerListName = player.getPlayerListName();
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
            player.sendMessage("Mode administrateur activé");
        } else {
            // Désactiver le mode administrateur
            player.setAllowFlight(isFlight);
            player.setDisplayName(player.getName());
            player.setFlySpeed(flySpeed);
            player.setCustomName(null);
            player.setPlayerListName(playerListName);
            player.setGameMode(Gamemode);
            player.setCollidable(true);
            onAdmin = false;
            player.sendMessage("Mode administrateur désactivé");
        }
    }
}
