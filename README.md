# **Register Commands**

> A [Spigot] plugin that provides the functionality to register custom commands to make them valid.

- [Discord]
- [Spigot Marketplace]

---

## **Compatibility**
This plugin was built with Maven against Spigot API 1.13.<br>
It has been tested on Spigot and Paper 1.15.2 but should also work with versions below and above.


## **Features**

- register your custom commands
- enable tab completion and valid syntax for your commands


## **How it works**
Since Minecraft version 1.13, the tab-completion feature was implemented.

Players were now able to see which options they have when entering a command. The problem is that only valid and registered commands will popup in this list.
Many plugins don't add an own functionality for registering custom made commands yet.

Even if you set up your commands right, Minecraft 1.13+ won't recognize them as valid. Even more annoying is version 1.15+ where a live parser was implemented into Minecraft.
Now it even shows that commands are not registered and therefor not useable.

This plugin goes through the config with your custom commands and registers them. It won't do anything else. The addon doesn't add any other functionality and won't modify your commands!

#### Without the plugin
![withoutPlugin]

#### With the plugin
![withPlugin]


## **How to use**
- go to the [releases] and download the latest release
- stop your server
- drop the jar file into your server's plugins folder
- start your server and wait for the plugin's folder to be created, then open it
- open the config.yml and add all commands you want to have registered
  - follow the format which is shown in there
  - make sure that you don't add a slash character ("`/`")
  - provide a description and a usageMessage for each of them
- restart your server
  - make sure to restart, not reload
  - only restarting will register new commands


## **Known Issues**

##### NOTHING KNOWN
- make sure to report issues in the [GitHub issues][Issues]
- you can also join our [Discord]


## **Contribution**

All you need to know is written down in our [contribution guidelines][Contribution].


## **License**

This project is licensed under the [MIT License][License].


## **Release Notes**

Everything related to versions and their release notes can be found in the [changelog][Changelog].

---

<!-- Links -->
[Spigot]: https://www.spigotmc.org/
[Discord]: https://discordapp.com/invite/Q3qxws6
[Spigot Marketplace]: https://www.spigotmc.org/
[releases]: https://github.com/RLNT/spigot-registercommands/releases
[WinRar]: https://www.win-rar.com/
[Issues]: https://github.com/RLNT/spigot-registercommands/issues
[Contribution]: CONTRIBUTING.md
[License]: LICENSE.md
[Changelog]: CHANGELOG.md

<!-- Images -->
[withoutPlugin]: https://raw.githubusercontent.com/RLNT/spigot-registercommands/master/images/withoutPlugin.gif
[withPlugin]: https://raw.githubusercontent.com/RLNT/spigot-registercommands/master/images/withPlugin.gif
