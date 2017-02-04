package ru.mikhaylov.xo.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Game<F> implements Iterable<Player>{

    private final Player[] players;

    private final Field<F>  field;

    private final String name;

    public Game(Player[] players,
                Field<F>  field,
                String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field<F>  getField() {
        return field;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<Player> iterator() {
        final List<Player> playerList = Arrays.asList(players);
        return playerList.iterator();
    }
}
