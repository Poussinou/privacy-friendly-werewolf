package org.secuso.privacyfriendlywerwolf.data;

import android.util.Log;

import org.secuso.privacyfriendlywerwolf.model.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * singleton, which holds the players of the game
 *
 * @author Tobias Kowalski <tobias.kowalski@stud.tu-darmstadt.de>
 */
public class PlayerHolder {
    private static final String TAG = "PlayerHolder";
    private static final PlayerHolder PLAYER_HOLDER = new PlayerHolder();

    private List<Player> players;

    private PlayerHolder() {
        Log.d(TAG, "PlayerHolder singleton created");
        players = new ArrayList<>();
    }

    public static PlayerHolder getInstance() {
        return PLAYER_HOLDER;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }


}