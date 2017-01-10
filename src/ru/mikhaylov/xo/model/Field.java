package ru.mikhaylov.xo.model;

import java.awt.*;

/**
 * Created by Anton on 10.01.2017.
 */
public class Field {

    private final int FIELD_SIZE = 3;

    private final Figure[][] field = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize(){
        return  FIELD_SIZE;
    }

    public Figure getFigure(final Point point){
        return field[point.x][point.y];
    }

    public void setFigure(final Point point, final Figure figure){
        field[point.x][point.y] = figure;
    }


}