package me.lenajenichen.Rang.utils;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Rang {
    public static void kickMessage(ProxiedPlayer player, String rang, String Kicker) {
        player.disconnect((BaseComponent) new TextComponent("§8§l»§m------------------§8(  §5§lPixelCave.eu §8)§8§l§m------------------§8§l«\n\n\n     §7Du wurdes vom Netzwerk §cgekickt§7. \n\n\n§7Von: §6" + Kicker + "\n" + "\n" + "§b§lRangupdate §7» Neuer Rang " + rang + "\n" + "\n" + "\n" + "§8§l»§m------------------§8(  §5§lPixelCave.eu §8)§8§l§m------------------§8§l«"));

    }

}
