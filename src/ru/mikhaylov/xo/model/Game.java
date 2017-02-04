package ru.mikhaylov.xo.model;

import java.util.Iterator;

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
        return new PlayerIterator(players);
    }

    private static class PlayerIterator implements Iterator<Player>{

        private int index = 0;

        private final Player[] players;

        private PlayerIterator(final Player[] players) {
            this.players = players;
        }


        @Override
        public boolean hasNext() {
            return this.players.length > index;
        }

        @Override
        public Player next() {
            return this.players[index++];
        }
    }
}
