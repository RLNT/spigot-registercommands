package rlnt.registercommands.utils;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import rlnt.registercommands.RegisterCommands;

import java.io.File;
import java.io.IOException;

public class Config {

    private YamlConfiguration config;

    public Config(String name, JavaPlugin plugin) {

        File folder = plugin.getDataFolder();
        File file = new File(folder, name);
        config = new YamlConfiguration();

        // check if the config folder already exists
        if (!folder.exists()) {
            RegisterCommands.getInstance().log("info", "&cConfig folder wasn't created yet! Creating one...");

            // check if config folder creation is successful
            if (!file.getParentFile().mkdir()) {
                RegisterCommands.getInstance().log("severe", "&4Config folder couldn't be created! Disabling the plugin...");
                plugin.getPluginLoader().disablePlugin(plugin);
            }
        }

        // check if the config file already exists
        if (!file.exists()) {
            RegisterCommands.getInstance().log("info", "&cConfig wasn't found! Extracting from JAR...");
            plugin.saveResource(name, true);
        }

        // load the config
        try {
            config.load(file);
        } catch (InvalidConfigurationException ex) {
            RegisterCommands.getInstance().log("severe", "&4Config couldn't be loaded! Disabling the plugin...");
            plugin.getPluginLoader().disablePlugin(plugin);
        } catch (IOException e) {
            RegisterCommands.getInstance().log("severe", "&4Config couldn't be loaded! Disabling the plugin...");
            RegisterCommands.getInstance().log("severe", e.toString());
            plugin.getPluginLoader().disablePlugin(plugin);
        }
    }

    public YamlConfiguration getConfig() {
        return config;
    }
}
