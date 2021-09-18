package me.lenajenichen.Rang.Main;

import me.lenajenichen.Rang.commands.CMD_Rang;
import me.lenajenichen.Rang.commands.CommandClass;
import me.lenajenichen.Rang.commands.RangUpdate;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.plugin.PluginManager;

public class Main extends Plugin {

    @Override
    public void onEnable() {
        System.out.println("===========RangSystem===========");
        System.out.println("");
        System.out.println(" ____  _          _                     ");
        System.out.println("|  _ \\(_)_  _____| | ___ __ ___   _____ ");
        System.out.println("| |_) | \\ \\/ / _ \\ |/ __/ _` \\ \\ / / _ \\");
        System.out.println("|  __/| |>  <  __/ | (_| (_| |\\ V /  __/");
        System.out.println("|_|   |_/_/\\_\\___|_|\\___\\__,_| \\_/ \\___|");
        System.out.println(" ");
        System.out.println("Plugin: aktiviert");
        System.out.println("Version: 1.0");
        System.out.println("Comment: Danke für das Benutzen des Plugins");
        System.out.println("===========RangSystem===========");

        PluginManager pm = BungeeCord.getInstance().getPluginManager();
        pm.registerCommand(this, new CMD_Rang("Rang"));
        pm.registerCommand(this, new CommandClass());
        BungeeCord.getInstance().registerChannel("Return");
    }

    @Override
    public void onDisable() {

    }
}
