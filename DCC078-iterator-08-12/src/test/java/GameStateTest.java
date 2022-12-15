import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameStateTest {

    @Test
    void shouldBeCountOnlinePlayersGuild() {
        Guild guild = new Guild(
                new Player("Player One", true),
                new Player("Player Two", false),
                new Player("Player Three", false),
                new Player("Player Four", true)
        );
        assertEquals(2, GameState.countOnlinePlayersGuild(guild));
    }

    @Test
    void shouldBeCountTotalPlayersGuild() {
        Guild guild = new Guild(
                new Player("Player One", true),
                new Player("Player Two", false),
                new Player("Player Three", false),
                new Player("Player Four", true)
        );
        assertEquals(4, GameState.countTotalPlayersGuild(guild));
    }
}