# **Register Commands**

> A [Spigot] plugin that provides the functionality to register custom commands to make them valid.

- [Discord]
- [Spigot Marketplace]

---

## **Compatibility**
This plugin was built with Maven against Spigot API 1.13.<br>
It has been tested on Spigot and Paper 1.15.2 but should also work with versions below and above.


## **Features**

- register your custom commands to make them valid
- enable tab completion and valid syntax for them
- add a description and a usage message to each command


## **How it works**
Since Minecraft 1.13+, the tab-completion was introduced. A nice feature to be able to enter commands faster and also to see which commands you are able to use.
The problem with that is that only registered commands are counted as valid and shown in the tab-completion.

There are a lot of plugins out there that offer making your own custom commands. But what they don't have is a method to register these custom commands. They are not counted as valid and therefor they won't be shown in tab-completion and also marked red in the chat as if they would not exist.

This plugin solves that. You can define as many custom commands as you want in the config and the plugin will register them for you. It won't modify any functionality of the commands. It just helps you to make them valid!

#### Without the plugin
![withoutPlugin]

#### With the plugin
![withPlugin1]<br>
![withPlugin2]


## **How to use**
- go to the [releases] and download the latest release
- stop your server
- drop the jar file into your server's plugins folder
- start your server and wait for the plugin's folder to be created and open it
- open the config.yml and add all commands you want to have registered
  - follow the format given in the config
  - make sure that you don't add a slash character ("`/`")
  - provide a description and a usage message for each of them
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
[Spigot Marketplace]: https://www.spigotmc.org/resources/registercommands.75791/
[releases]: https://github.com/RLNT/spigot-registercommands/releases
[Issues]: https://github.com/RLNT/spigot-registercommands/issues
[Contribution]: CONTRIBUTING.md
[License]: LICENSE.md
[Changelog]: CHANGELOG.md

<!-- Images -->
[withoutPlugin]: images/withoutPlugin.png
[withPlugin1]: images/withPlugin1.png
[withPlugin2]: images/withPlugin2.png
