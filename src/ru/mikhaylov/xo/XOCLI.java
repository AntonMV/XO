package ru.mikhaylov.xo;

import ru.mikhaylov.xo.model.Field;
import ru.mikhaylov.xo.model.Figure;
import ru.mikhaylov.xo.model.Game;
import ru.mikhaylov.xo.model.Player;
import ru.mikhaylov.xo.view.ConsoleView;

public class XOCLI {
    public static void main(String[] args) {
        final String name1 = "Anton";
        final String name2 = "Gleb";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while (consoleView.move(gameXO)){
            consoleView.show(gameXO);
        }
    }
}
