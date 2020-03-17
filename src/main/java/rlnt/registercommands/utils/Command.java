package rlnt.registercommands.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.List;

public class Command extends BukkitCommand {
    public Command(String name, String description, String usageMessage, List<String> aliases) {
        super(name);
        this.description = description;
        this.usageMessage = usageMessage;
        this.setPermission(null);

        if (!aliases.isEmpty()) {
            this.setAliases(aliases);
        }
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        return true;
    }
}
