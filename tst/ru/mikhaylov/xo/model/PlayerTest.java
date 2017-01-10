package ru.mikhaylov.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anton on 10.01.2017.
 */
public class PlayerTest {
    @Test
    public void getName() throws Exception {

        final String inputValue = "Anton";

        final String expectedValue = inputValue;

        final Player player = new Player(inputValue, null);

        final String actualValue = player.getName();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void getFigure() throws Exception {

        final Figure inputValue = Figure.X;

        final Figure expectedValue = inputValue;

        final Player player = new Player(null, Figure.X);

        final Figure actualValue = player.getFigure();

        assertEquals(expectedValue, actualValue);

    }

}