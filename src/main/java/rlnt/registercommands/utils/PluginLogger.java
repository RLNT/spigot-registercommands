package rlnt.registercommands.utils;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class PluginLogger extends Logger {

    public PluginLogger(Plugin plugin) {
        super(plugin.getDescription().getName(), null);
        setParent(plugin.getServer().getLogger());
    }

    @Override
    public void log(LogRecord record) {
        record.setMessage(ChatColor.translateAlternateColorCodes('&', record.getMessage()));
        super.log(record);
    }

    @Override
    public void info(String msg) {
        log(Level.INFO, msg + ChatColor.RESET);
    }

    @Override
    public void warning(String msg) {
        log(Level.WARNING, msg + ChatColor.RESET);
    }

    @Override
    public void severe(String msg) {
        log(Level.SEVERE, msg + ChatColor.RESET);
    }
}
