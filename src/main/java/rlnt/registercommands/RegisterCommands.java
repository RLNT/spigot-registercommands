package rlnt.registercommands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import rlnt.registercommands.utils.Command;
import rlnt.registercommands.utils.Config;

import java.lang.reflect.Field;

public final class RegisterCommands extends JavaPlugin {

    private static RegisterCommands instance;
    private YamlConfiguration config;

    @Override
    public void onEnable() {
        instance = this;

        log("info", "&5Plugin is loading up...");
        log("info", "&6developed by RLNT");
        log("info", "&fLoading configs...");
        configs();
        log("info", "&aConfig loaded!");
        log("info", "&fRegistering commands...");
        commands();
        log("info", "&aCommands registered!");
        log("info", "&6DONE! :)");
    }

    @Override
    public void onDisable() {}

    public static RegisterCommands getInstance() {
        return instance;
    }
    private void configs() {
        config = new Config("config.yml",this).getConfig();
    }

    private void commands() {
        ConfigurationSection commands = config.getConfigurationSection("commands");

        if (commands == null) {
            log("warning", "&4The commands section couldn't be found in the config!");
            log("info", "&cNo commands were registered.");
        } else {
            try {
                final Field serverCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
                serverCommandMap.setAccessible(true);

                CommandMap commandMap = (CommandMap) serverCommandMap.get(Bukkit.getServer());

                for (String command : commands.getKeys(false)) {
                    ConfigurationSection commandInfo = commands.getConfigurationSection(command);

                    if (commandInfo == null) {
                        log("warning", "&4The command information of &6" + command + " &4is empty!");
                        log("info", "&cThe command was not registered. Make sure to provide a description and a usageMessage.");
                    } else {
                        String description = commandInfo.getString("description");
                        String usageMessage = commandInfo.getString("usageMessage");

                        commandMap.register(command, "rc", new Command(command, description, usageMessage));
                        log("info", "&aThe command &6" + command + " &awas registered!");
                    }
                }
            } catch (NoSuchFieldException e) {
                log("severe", "&4Couldn't find the command map of the server! Disabling the plugin...");
                log("severe", e.toString());
                this.getPluginLoader().disablePlugin(this);
            } catch (IllegalAccessException e) {
                log("severe", "&4Couldn't access the command map of the server! Disabling the plugin...");
                log("severe", e.toString());
                this.getPluginLoader().disablePlugin(this);
            }
        }
    }
}
