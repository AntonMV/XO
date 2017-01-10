package ru.mikhaylov.xo.controllers;

import ru.mikhaylov.xo.model.Field;
import ru.mikhaylov.xo.model.Figure;
import ru.mikhaylov.xo.model.exceptions.InvalidPointException;

import java.awt.*;

/**
 * Created by Anton on 10.01.2017.
 */
public class WinnerController {

    public Figure getWinner(final Field field){
        try {
            for (int i = 0; i < 3 ; i++) {
                if (check(field, new Point(i,0), p -> new Point(p.x, p.y + 1)))
                    return field.getFigure(new Point(i,0));
            }
            for (int i = 0; i < 3 ; i++) {
                if (check(field, new Point(0, i), p -> new Point(p.x + 1, p.y)))
                    return field.getFigure(new Point(0, i));
            }
            if (check(field, new Point(0, 0), p -> new Point(p.x + 1, p.y + 1)))
                return field.getFigure(new Point(0, 0));

            if (check(field, new Point(0, 2), p -> new Point(p.x + 1, p.y - 1)))
                return field.getFigure(new Point(0, 2));

        } catch (InvalidPointException e) {
            e.printStackTrace();
        }
        return null;
    }

    private boolean check(final Field field, final Point currentPoint, final IPointGenerator pointGenerator){
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPoint = pointGenerator.next(currentPoint);
        try {
            currentFigure = field.getFigure(currentPoint);
            nextFigure = field.getFigure(currentPoint);
        } catch (InvalidPointException e) {
            return true;
        }

        if (currentFigure == null) return false;

        if (currentFigure != nextFigure) return false;

        return check(field, nextPoint, pointGenerator);
    }

    private interface IPointGenerator {

        Point next(final Point point);

    }

}
