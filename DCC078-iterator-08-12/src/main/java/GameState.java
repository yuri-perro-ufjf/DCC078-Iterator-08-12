import java.util.Iterator;

public class GameState {
    public static Integer countOnlinePlayersGuild(Guild guild) {
        int quantity = 0;
        for (Player player : guild) {
            if (player.isOnline()) {
                quantity++;
            }
        }
        return quantity;
    }

    public static Integer countTotalPlayersGuild(Guild guild) {
        int quantity = 0;
        for (Iterator a = guild.iterator(); a.hasNext(); ) {
            quantity++;
            a.next();
        }
        return quantity;
    }
}
