package refactoring_guru.behavioral.state.example;

import refactoring_guru.behavioral.state.example.ui.Player;
import refactoring_guru.behavioral.state.example.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player=new Player();
        UI ui=new UI(player);
        ui.init();
    }
}
