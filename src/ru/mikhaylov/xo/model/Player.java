package ru.mikhaylov.xo.model;

/**
 * Created by Anton on 10.01.2017.
 */
public class Player {

    private final String name;

    private final Figure figure;

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
}
