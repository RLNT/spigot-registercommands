package rlnt.registercommands.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

public class Command extends BukkitCommand {
    public Command(String name, String description, String usageMessage) {
        super(name);
        this.description = description;
        this.usageMessage = usageMessage;
        this.setPermission(null);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        return true;
    }
}
