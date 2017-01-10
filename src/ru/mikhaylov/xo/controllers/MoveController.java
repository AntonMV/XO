package ru.mikhaylov.xo.controllers;

import ru.mikhaylov.xo.model.Field;
import ru.mikhaylov.xo.model.Figure;
import ru.mikhaylov.xo.model.exceptions.AlreadyOccupiedException;
import ru.mikhaylov.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class MoveController {

    public void applyFigure(final Field field,
                            final Point point,
                            final Figure figure) throws AlreadyOccupiedException, InvalidPointException {
        if (field.getFigure(point) != null){
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }

}
