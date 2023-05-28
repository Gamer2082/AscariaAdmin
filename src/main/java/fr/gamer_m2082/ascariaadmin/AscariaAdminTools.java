package fr.gamer_m2082.ascariaadmin;

import fr.gamer_m2082.ascariaadmin.command.CommandAdminExecutor;
import fr.gamer_m2082.ascariaadmin.command.CommandHelpExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class AscariaAdminTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Objects.requireNonNull(getCommand("help")).setExecutor(new CommandHelpExecutor());
        Objects.requireNonNull(getCommand("admin")).setExecutor(new CommandAdminExecutor());




        String startText = "Ascaria Admin plugin \n " +
                " By GAmer_m2082 \n" +
                " Start load \n" +
                " Load status successful \n "+
                " /Help inGame for more \n"+
                " On ready";

        System.out.println(startText);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Disable resource: on disable");
    }
}
