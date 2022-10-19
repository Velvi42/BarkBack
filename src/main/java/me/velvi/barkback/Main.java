package me.velvi.barkback;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("BarkBack is starting...");
        Bukkit.getPluginManager().registerEvents(new EventListener(), this);

        getLogger().info("BarkBack has loaded!");
    }

    @Override
    public void onDisable() {
        getLogger().info("BarkBack is unloaded...");
        // Plugin shutdown logic
    }
}
