package rlnt.registercommands.utils;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Config {

    private YamlConfiguration config;

    public Config(String name, JavaPlugin plugin) {

        PluginLogger logger = new PluginLogger(plugin);
        File folder = plugin.getDataFolder();
        File file = new File(folder, name);
        config = new YamlConfiguration();

        // check if the config folder already exists
        if (!folder.exists()) {
            logger.info("&cConfig folder wasn't created yet! Creating one...");

            // check if config folder creation is successful
            if (!file.getParentFile().mkdir()) {
                logger.severe("&4Config folder couldn't be created! Disabling the plugin...");
                plugin.getPluginLoader().disablePlugin(plugin);
            }
        }

        // check if the config file already exists
        if (!file.exists()) {
            logger.info("&cConfig wasn't found! Extracting from JAR...");
            plugin.saveResource(name, true);
        }

        // load the config
        try {
            config.load(file);
        } catch (InvalidConfigurationException ex) {
            logger.severe("&4Config couldn't be loaded! Disabling the plugin...");
            plugin.getPluginLoader().disablePlugin(plugin);
        } catch (IOException e) {
            logger.severe("&4Config couldn't be loaded! Disabling the plugin...");
            logger.severe(e.toString());
            plugin.getPluginLoader().disablePlugin(plugin);
        }
    }

    public YamlConfiguration getConfig() {
        return config;
    }
}
