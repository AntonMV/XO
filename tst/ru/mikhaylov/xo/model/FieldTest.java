package ru.mikhaylov.xo.model;

import org.junit.Test;
import ru.mikhaylov.xo.model.exceptions.InvalidPointException;

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
        final Point inputPoint = new Point(0,0);
        final Figure inputFigure = Figure.O;

        assertEquals(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);
        assertEquals(inputFigure,actualFigure);
    }

    @Test
    public void setFigureWhenFigureIsNotSet() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0,0);

        final Figure actualFigure = field.getFigure(inputPoint);
        assertNull(actualFigure);
    }

    @Test
    public void setFigureWhenXIsLessThenZero() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(-1,0);

        try {
            field.getFigure(inputPoint);
            fail();
        }catch (final InvalidPointException e){}

    }

}