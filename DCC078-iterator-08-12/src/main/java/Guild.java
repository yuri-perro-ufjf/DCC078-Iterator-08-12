import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Guild implements Iterable<Player>{
    private List<Player> players = new ArrayList<Player>();

    public Guild(Player... alunos) {
        this.players = Arrays.asList(alunos);
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
