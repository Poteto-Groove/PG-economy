package com.potetogroove.pgeconomy;

import org.bukkit.plugin.java.JavaPlugin;

public final class PGEconomy extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PG-economy has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("PG-economy has been disabled.");
    }
}
