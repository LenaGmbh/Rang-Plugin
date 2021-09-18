package me.lenajenichen.Rang.commands;

import me.lenajenichen.Rang.Main.Main;
import me.lenajenichen.Rang.utils.Rang;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

import java.lang.reflect.Proxy;

public class CMD_Rang extends Command {

    public String prefix = "§b§lRang §7» ";
    private Main main;

    public CMD_Rang(String name) {
        super(name);
    }

    private void event(Main main) {
        this.main = main;
    }

    public void execute(CommandSender sender, String[] args) {
        ProxiedPlayer proxiedPlayer = (ProxiedPlayer) sender;
        TextComponent tc = new TextComponent();
        TextComponent tc1 = new TextComponent();
        TextComponent tc2 = new TextComponent();
        TextComponent tc3 = new TextComponent();
        TextComponent tc4 = new TextComponent();
        TextComponent tc5 = new TextComponent();
        TextComponent tc6 = new TextComponent();
        TextComponent tc7 = new TextComponent();
        TextComponent tc8 = new TextComponent();
        TextComponent tc9 = new TextComponent();
        TextComponent tc10 = new TextComponent();
        TextComponent tc11 = new TextComponent();
        TextComponent tc12 = new TextComponent();
        TextComponent tc13 = new TextComponent();
        TextComponent tc14 = new TextComponent();
        TextComponent tc15 = new TextComponent();
        TextComponent tc16 = new TextComponent();
        TextComponent tc17 = new TextComponent();

        if (proxiedPlayer.hasPermission("system.rangupdate")) {
            if (args.length == 2) {
                ProxiedPlayer target = BungeeCord.getInstance().getPlayer(args[0]);
                if (target != null && target.isConnected()) {
                    //proxiedPlayer.sendMessage(prefix + "Der angegebene Spieler ist nicht Online!");
                    if (args[1].equalsIgnoreCase("Spieler")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.spieler")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §7Spieler §agegeben");
                            Rang.kickMessage(target, "§7Spieler", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set default", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang Spieler gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("VIP")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.vip")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §6VIP §agegeben");
                            Rang.kickMessage(target, "§6VIP", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set VIP", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §6VIP gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Ultra")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.ultra")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §bUltra §agegeben");
                            Rang.kickMessage(target, "§bUltra", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Ultra", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §bUltra §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Prime")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.prime")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §aPrime §agegeben");
                            Rang.kickMessage(target, "§aPrime", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Prime", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §aPrime §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("PremiumPlus")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.premiumplus")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §5PremiumPlus §agegeben");
                            Rang.kickMessage(target, "§5PremiumPlus", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set PremiumPlus", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §5PremiumPlus §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("YouTuber")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.youtuber")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §5YouTuber §agegeben");
                            Rang.kickMessage(target, "§5YouTuber", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set YouTuber", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §5YouTuber §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Content")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.content")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §3Content §agegeben");
                            Rang.kickMessage(target, "§3Content", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Content", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §3Content §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if(args[1].equalsIgnoreCase("Partner")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.partner")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §bPartner §agegeben");
                            Rang.kickMessage(target, "§bPartner", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set TestBuilder", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §eTestBuilder §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("TBuilder")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.testbuilder")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §eTestBuilder §agegeben");
                            Rang.kickMessage(target, "§eTestBuilder", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set TestBuilder", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §eTestBuilder §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Builder")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.builder")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §eBuilder §agegeben");
                            Rang.kickMessage(target, "§eBuilder", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Builder", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §eBuilder §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("TSup")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.tsup")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §1Test-Supporter §agegeben");
                            Rang.kickMessage(target, "§1Test-Supporter", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set TestSupporter", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §1Test-Supporter §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Sup")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.sup")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §1Supporter §agegeben");
                            Rang.kickMessage(target, "§1Supporter", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Supporter", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §1Supporter §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Mod")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.mod")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §cModerator §agegeben");
                            Rang.kickMessage(target, "§cModerator", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Moderator", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §cModerator §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("SrMod")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.srmod")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §cSir-Moderator §agegeben");
                            Rang.kickMessage(target, "§cSir-Moderator", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set SeniorModerator", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §cSir-Moderator §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Dev")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.dev")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §bDeveloper §agegeben");
                            Rang.kickMessage(target, "§bDeveloper", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Developer", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §bDeveloper §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("SrDev")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.srdev")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §bSir-Developer §agegeben");
                            Rang.kickMessage(target, "§bSir-Developer", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set SeniorDeveloper", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §bSir-Developer gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Admin")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.admin")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §4Admininistrator/in §agegeben");
                            Rang.kickMessage(target, "§4Administrator/in", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Administrator", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            ProxyServer.getInstance().broadcast(prefix + "§c§lEs gibt einen neuen Admin, begrüßt §6" + target + " §c§lals neuen Administrator!");
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §4Administrator §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else if (args[1].equalsIgnoreCase("Owner")) {
                        if (proxiedPlayer.hasPermission("system.rangupdate.owner")) {
                            proxiedPlayer.sendMessage(prefix + "§aDu hast erfolgreich dem Spieler §6" + target + " §aden Rang §4Owner/in §agegeben");
                            Rang.kickMessage(target, "§4Owner/in", proxiedPlayer.getDisplayName());
                            CommandToServer.sendToBukkit("command", "pex user " + target + " group set Owner", BungeeCord.getInstance().getServerInfo("Lobby-1"));
                            ProxyServer.getInstance().broadcast(prefix + "§c§lEs gibt einen neuen Owner, begrüßt §6" + target + " §c§lals neuen Owner!");
                            for (ProxiedPlayer p : BungeeCord.getInstance().getPlayers()) {
                                if (p.hasPermission("system.rangupdate.getrangupdate")) {
                                    p.sendMessage(prefix + "§7Der Spieler §6" + proxiedPlayer + " §7hat dem Spieler §6" + target + " §7den Rang §4Owner §7gegeben!");
                                }
                            }
                        } else {
                            proxiedPlayer.sendMessage(prefix + "Für diesen Rang hast du keine Berechtigungen, frag bitte einen Admin oder einen Owner!");
                        }
                    } else {
                        proxiedPlayer.sendMessage(prefix + "Die momentan existierenden Gruppen sind: ");
                        tc.setText(prefix + "Spieler");
                        tc.setBold(true);
                        tc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Spieler"));
                        tc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Spieler").create()));
                        //proxiedPlayer.sendMessage(prefix + "§6VIP");
                        tc1.setText(prefix + "§6VIP");
                        tc1.setBold(true);
                        tc1.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " VIP"));
                        tc1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> VIP").create()));
                        //proxiedPlayer.sendMessage(prefix + "§bUltra");
                        tc2.setText(prefix + "§bUltra");
                        tc2.setBold(true);
                        tc2.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Ultra"));
                        tc2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Ultra").create()));
                        //proxiedPlayer.sendMessage(prefix + "§aPrime");
                        tc3.setText(prefix + "§aPrime");
                        tc3.setBold(true);
                        tc3.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Prime"));
                        tc3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Prime").create()));
                        //porxiedPlayer.sendMessage(prefix+ "§5PremiumPlus");
                        tc4.setText(prefix + "§5PremiumPlus");
                        tc4.setBold(true);
                        tc4.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " PremiumPlus"));
                        tc4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> PremiumPlus").create()));
                        //proxiedPlayer.sendMessage(prefix + "§bYouTuber");
                        tc5.setText(prefix + "§5YouTuber");
                        tc5.setBold(true);
                        tc5.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " YouTuber"));
                        tc5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> YouTuber").create()));
                        //proxiedPlayer.sendMessage(prefix + "§3Content");
                        tc6.setText(prefix + "§3Content");
                        tc6.setBold(true);
                        tc6.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Content"));
                        tc6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Content").create()));
                        //proxiedPlayer.sendMessage(prefix + "§bPartner");
                        tc7.setText(prefix + "§5Partner");
                        tc7.setBold(true);
                        tc7.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Partner"));
                        tc7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Partner").create()));
                        //proxiedPlayer.sendMessage(prefix + "§eTestBuilder");
                        tc8.setText(prefix + "§eTestBuilder");
                        tc8.setBold(true);
                        tc8.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " TBuilder"));
                        tc8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> TBuilder").create()));
                        //proxiedPlayer.sendMessage(prefix + "§eBuilder");
                        tc9.setText(prefix + "§eBuilder");
                        tc9.setBold(true);
                        tc9.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Builder"));
                        tc9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Builder").create()));
                        //proxiedPlayer.sendMessage(prefix + "§1TSup");
                        tc10.setText(prefix + "§1TestSupporter");
                        tc10.setBold(true);
                        tc10.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " TSup"));
                        tc10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> TSup").create()));
                        //proxiedPlayer.sendMessage(prefix + "§1Sup");
                        tc11.setText(prefix + "§1Supporter");
                        tc11.setBold(true);
                        tc11.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Sup"));
                        tc11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Sup").create()));
                        //proxiedPlayer.sendMessage(prefix + "§cMod");
                        tc12.setText(prefix + "§cModerator");
                        tc12.setBold(true);
                        tc12.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Mod"));
                        tc12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Mod").create()));
                        //proxiedPlayer.sendMessage(prefix + "§cSrMod");
                        tc13.setText(prefix + "§cSeniorModerator");
                        tc13.setBold(true);
                        tc13.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " SrMod"));
                        tc13.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> SrMod").create()));
                        //proxiedPlayer.sendMessage(prefix + "§bDev");
                        tc14.setText(prefix + "§bDeveloper");
                        tc14.setBold(true);
                        tc14.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Dev"));
                        tc14.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Dev").create()));
                        //proxiedPlayer.sendMessage(prefix + "§bSrDev");
                        tc15.setText(prefix + "§bSeniorDeveloper");
                        tc15.setBold(true);
                        tc15.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " SrDev"));
                        tc15.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> SrDev").create()));
                        //proxiedPlayer.sendMessage(prefix + "§4Admin");
                        tc16.setText(prefix + "§4Administrator");
                        tc16.setBold(true);
                        tc16.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Admin"));
                        tc16.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Admin").create()));
                        //proxiedPlayer.sendMessage(prefix + "§4Owner");
                        tc17.setText(prefix + "§4Owner");
                        tc17.setBold(true);
                        tc17.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Owner"));
                        tc17.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Owner").create()));

                        proxiedPlayer.sendMessage(tc);
                        proxiedPlayer.sendMessage(tc1);
                        proxiedPlayer.sendMessage(tc2);
                        proxiedPlayer.sendMessage(tc3);
                        proxiedPlayer.sendMessage(tc4);
                        proxiedPlayer.sendMessage(tc5);
                        proxiedPlayer.sendMessage(tc6);
                        proxiedPlayer.sendMessage(tc7);
                        proxiedPlayer.sendMessage(tc8);
                        proxiedPlayer.sendMessage(tc9);
                        proxiedPlayer.sendMessage(tc10);
                        proxiedPlayer.sendMessage(tc11);
                        proxiedPlayer.sendMessage(tc12);
                        proxiedPlayer.sendMessage(tc13);
                        proxiedPlayer.sendMessage(tc14);
                        proxiedPlayer.sendMessage(tc15);
                        proxiedPlayer.sendMessage(tc16);
                        proxiedPlayer.sendMessage(tc17);
                    }
                } else {
                    proxiedPlayer.sendMessage(prefix + "Der angegebene Spieler ist nicht Online!");
                }
            } else if(args.length ==1) {
                ProxiedPlayer target = BungeeCord.getInstance().getPlayer(args[0]);
                proxiedPlayer.sendMessage(prefix + "Die momentan existierenden Gruppen sind: ");
                tc.setText(prefix + "Spieler");
                tc.setBold(true);
                tc.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Spieler"));
                tc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Spieler").create()));
                //proxiedPlayer.sendMessage(prefix + "§6VIP");
                tc1.setText(prefix + "§6VIP");
                tc1.setBold(true);
                tc1.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " VIP"));
                tc1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> VIP").create()));
                //proxiedPlayer.sendMessage(prefix + "§bUltra");
                tc2.setText(prefix + "§bUltra");
                tc2.setBold(true);
                tc2.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Ultra"));
                tc2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Ultra").create()));
                //proxiedPlayer.sendMessage(prefix + "§aPrime");
                tc3.setText(prefix + "§aPrime");
                tc3.setBold(true);
                tc3.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Prime"));
                tc3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Prime").create()));
                //porxiedPlayer.sendMessage(prefix+ "§5PremiumPlus");
                tc4.setText(prefix + "§5PremiumPlus");
                tc4.setBold(true);
                tc4.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " PremiumPlus"));
                tc4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> PremiumPlus").create()));
                //proxiedPlayer.sendMessage(prefix + "§bYouTuber");
                tc5.setText(prefix + "§bYouTuber");
                tc5.setBold(true);
                tc5.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " YouTuber"));
                tc5.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> YouTuber").create()));
                //proxiedPlayer.sendMessage(prefix + "§3Content");
                tc6.setText(prefix + "§3Content");
                tc6.setBold(true);
                tc6.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Content"));
                tc6.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Content").create()));
                //proxiedPlayer.sendMessage(prefix + "§bPartner");
                tc7.setText(prefix + "§bPartner");
                tc7.setBold(true);
                tc7.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Partner"));
                tc7.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Partner").create()));
                //proxiedPlayer.sendMessage(prefix + "§eTestBuilder");
                tc8.setText(prefix + "§eTestBuilder");
                tc8.setBold(true);
                tc8.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " TBuilder"));
                tc8.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> TBuilder").create()));
                //proxiedPlayer.sendMessage(prefix + "§eBuilder");
                tc9.setText(prefix + "§eBuilder");
                tc9.setBold(true);
                tc9.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Builder"));
                tc9.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Builder").create()));
                //proxiedPlayer.sendMessage(prefix + "§1TSup");
                tc10.setText(prefix + "§1TestSupporter");
                tc10.setBold(true);
                tc10.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " TSup"));
                tc10.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> TSup").create()));
                //proxiedPlayer.sendMessage(prefix + "§1Sup");
                tc11.setText(prefix + "§1Supporter");
                tc11.setBold(true);
                tc11.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Sup"));
                tc11.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Sup").create()));
                //proxiedPlayer.sendMessage(prefix + "§cMod");
                tc12.setText(prefix + "§cModerator");
                tc12.setBold(true);
                tc12.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Mod"));
                tc12.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Mod").create()));
                //proxiedPlayer.sendMessage(prefix + "§cSrMod");
                tc13.setText(prefix + "§cSeniorModerator");
                tc13.setBold(true);
                tc13.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " SrMod"));
                tc13.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> SrMod").create()));
                //proxiedPlayer.sendMessage(prefix + "§bDev");
                tc14.setText(prefix + "§bDeveloper");
                tc14.setBold(true);
                tc14.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Dev"));
                tc14.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Dev").create()));
                //proxiedPlayer.sendMessage(prefix + "§bSrDev");
                tc15.setText(prefix + "§bSeniorDeveloper");
                tc15.setBold(true);
                tc15.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " SrDev"));
                tc15.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> SrDev").create()));
                //proxiedPlayer.sendMessage(prefix + "§4Admin");
                tc16.setText(prefix + "§4Administrator");
                tc16.setBold(true);
                tc16.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Admin"));
                tc16.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Admin").create()));
                //proxiedPlayer.sendMessage(prefix + "§4Owner");
                tc17.setText(prefix + "§4Owner");
                tc17.setBold(true);
                tc17.setClickEvent(new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, "/rang " + target + " Owner"));
                tc17.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("/rang <user> Owner").create()));

                proxiedPlayer.sendMessage(tc);
                proxiedPlayer.sendMessage(tc1);
                proxiedPlayer.sendMessage(tc2);
                proxiedPlayer.sendMessage(tc3);
                proxiedPlayer.sendMessage(tc4);
                proxiedPlayer.sendMessage(tc5);
                proxiedPlayer.sendMessage(tc6);
                proxiedPlayer.sendMessage(tc7);
                proxiedPlayer.sendMessage(tc8);
                proxiedPlayer.sendMessage(tc9);
                proxiedPlayer.sendMessage(tc10);
                proxiedPlayer.sendMessage(tc11);
                proxiedPlayer.sendMessage(tc12);
                proxiedPlayer.sendMessage(tc13);
                proxiedPlayer.sendMessage(tc14);
                proxiedPlayer.sendMessage(tc15);
                proxiedPlayer.sendMessage(tc16);
                proxiedPlayer.sendMessage(tc17);
            } else {
                proxiedPlayer.sendMessage(prefix + "§7Bitte benutze /rang <name> <rang>");
            }
            //} //else {
            ///proxiedPlayer.sendMessage(prefix + "Der angegebene Spieler ist nicht Online!");
            //}
        } else {
            proxiedPlayer.sendMessage(prefix + "§7Dazu hast du keine Rechte!");
        }
    }
}
