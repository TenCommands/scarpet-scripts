Advanced and Highly Customizable PVP Bot
---
The bot works with a config file which can be found in `scripts/bots-data/`. This config file has an editor which can be accessed in game via the `/bot` command.

To access the **bot hub** do `/warp bothub` or click on the NPC named "Bot Hub" in the main lobby.

`/bot` command and how to use it.
---
The `/bot` command has several different uses for configuring and using the bot.
- `/bot create <name>`
    - This command creates a new bot using the name and skin of the input.
- `/bot edit <name>`
    - This command gives access to a simple and easy to use GUI for configuring the chosen bot.
    - This command is also run when `right clicking` the bot in the bot hub.
- `/bot duplicate <name> <new name>`
    - Duplicates the chosen bot under the new given name.
    - This command can also be run within the configuration GUI.
- `/bot fight <name>`
    - Opens a GUI where you can select a map to fight the bot on.
    - Can also be run within the configuration GUI.
    - You can select a map for it to skip the GUI in the configuration GUI.
- `/bot download [<uuid>]`
    - Allows you to download other players bots from the internet using either the download GUI or from a specific UUID which you can send to your friends.
    - Download GUI only opens if no UUID is provided.
    - Download GUI has search options and filters available so you can find yourself a bot.
    - Downloaded bots can be edited using the `/bot edit` command.
- `/bot upload <name>`
    - Opens a GUI for you to set the upload options for your bot.
    - Upload options include:
        - Default name
        - Author Alias
        - Description
        - Tags
- `/bot delete <name>`
    - Deletes the config file and the bot from you world.
- `/bot display <hide|show> <name>`
    - Removes (Hides) the bot without deleting it so you can clear up lag and the amount of bots in the world.
    - Shows the bot in the world.
    - Other `/bot` commands still work even when hidden.

Bot Examples and Showcase
---
- **Axe PVP Example**
- **Crystal PVP Example**
- **OP PVP Example**
- **Neth Pot Example**
- **Minecart Example**
- **CTS Example**