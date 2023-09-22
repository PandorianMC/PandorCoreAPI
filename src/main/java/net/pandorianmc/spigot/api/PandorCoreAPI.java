package net.pandorianmc.spigot.api;

import net.pandorianmc.spigot.data.PandorianPlayer;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * The PandorCoreAPI allows you to hook into PandorCore to either modify and grab data
 * or to add new features and events. Questions? https://discord.pandorianmc.net/
 */
public class PandorCoreAPI {

    public static PandorCoreAPI INSTANCE;

    /**
     * @return Is the PandorCoreAPI enabled and registered?
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("PandorCoreAPI is not registered!");
    }

    /**
     * The #getPlayerData method allows you to access player data
     *
     * @return player's profile.
     */
    public PandorianPlayer getPlayerData(UUID player) {
        throw new IllegalPluginAccessException("PandorCoreAPI is not registered!");
    }
}