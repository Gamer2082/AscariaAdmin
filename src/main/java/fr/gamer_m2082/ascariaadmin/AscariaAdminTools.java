package fr.gamer_m2082.ascariaadmin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public final class AscariaAdminTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        management.load();

        getCommand("help").setExecutor(new CommandHelpExecutor());
        getCommand("admin").setExecutor(new CommandAdminExecutor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        management.unload();


    }
}
