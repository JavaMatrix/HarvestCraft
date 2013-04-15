HarvestCraft
============

Harvest Moon mod for Minecraft.



How to setup your workspace
---------------------------

There's multiple different ways to do this, shown here is just one.

This is assuming you already cloned the repository locally.


### Set up MinecraftForge ###

- Install the [Java SDK Standard Edition][1] (JDK) if you haven't
  already.

- Make sure the JDK and SRE bin folders are in the
  [PATH environment variable][2].

- [Download MinecraftForge (src)][3], get at least recommended, if
  not lastest.

- Extract the forge folder from the zip file somewhere.

- Run install.cmd (Windows) or install.sh (Other). This will download
  MCP, Minecraft, etc., decompiling and deobfuscating everything.


### Set up Eclipse ###

- Download [Eclipse IDE for Java Developers][4] and install it.

- Start Eclipse, and open the workspace ".../forge/mcp/eclipse".

- Right click the project "Minecraft" on the left, go to
  "Java Build Path", tab "Source".

- Press "Lind Source", pick the ".../HarvestCraft/src" folder,
  enter "HarvestCraft_src" as the folder name (for example).

- Get to modding! Press the green arrow at the top to run the game.


[1]: http://www.oracle.com/technetwork/java/javase/downloads/
[2]: http://www.java.com/en/download/help/path.xml
[3]: http://files.minecraftforge.net/
[4]: http://www.eclipse.org/downloads/