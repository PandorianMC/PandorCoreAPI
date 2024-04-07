package net.pandorianmc.velocity.api;

import lombok.SneakyThrows;
import net.pandorianmc.velocity.data.PandorianProxyPlayer;

import java.util.UUID;

/**
 * The PandorCoreAPI allows you to hook into PandorCore to either modify and grab data
 * or to add new features and events. Questions? https://discord.pandorianmc.net/
 */
public class PandorCoreAPI {

    public static net.pandorianmc.bungee.api.PandorCoreAPI INSTANCE;

    /**
     * @return Is the PandorCoreAPI enabled and registered?
     */
    @SneakyThrows
    public static boolean isRegistered() {
        throw new Exception("PandorCoreAPI is not registered!");
    }

    /**
     * The #getPlayerData method allows you to access player data
     *
     * @return player's profile.
     */
    @SneakyThrows
    public PandorianProxyPlayer getPlayerData(UUID player) {
        throw new Exception("PandorCoreAPI is not registered!");
    }
}