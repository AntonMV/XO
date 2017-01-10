package ru.mikhaylov.xo.model;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Anton on 10.01.2017.
 */
public class FieldTest {
    @Test
    public void getSize() throws Exception {
        final Field field = new Field();

        assertEquals(3, field.getSize());
    }

    @Test
    public void setFigure() throws Exception {
        final Field field = new Field();
        final Point inputpoint = new Point(0,0);
        final Figure inputfigure = Figure.O;

        assertEquals(inputpoint, inputfigure);
        final Figure actualFigure = field.getFigure(inputpoint);
        assertEquals(inputfigure,actualFigure);
    }

}