package fr.gamer_m2082.ascariaadmin;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.Objects;

public class management {
    public static void load() {
        // Load text
        String startText = "Ascaria Admin plugin \n " +
            " By GAmer_m2082 \n" +
            " Start load \n" +
            " Load status successful \n "+
            " /Help inGame for more \n"+
            " On ready";
        Bukkit.getConsoleSender().sendMessage( ChatColor.GREEN + startText);

    }

    public static void unload() {
        // UnLoad text
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Disable resource: on disable");



    }
}
