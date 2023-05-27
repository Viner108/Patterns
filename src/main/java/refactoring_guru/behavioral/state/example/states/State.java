package refactoring_guru.behavioral.state.example.states;
import refactoring_guru.behavioral.state.example.ui.Player;

public abstract class State {
    Player player;
    State(Player player){
        this.player=player;
    }
    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
