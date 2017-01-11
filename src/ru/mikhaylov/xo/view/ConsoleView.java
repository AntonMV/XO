package ru.mikhaylov.xo.view;

import ru.mikhaylov.xo.model.Field;
import ru.mikhaylov.xo.model.Figure;
import ru.mikhaylov.xo.model.Game;
import ru.mikhaylov.xo.model.exceptions.InvalidPointException;

import java.awt.*;

public class ConsoleView {

    public void show(final Game game){
        System.out.format("Game name: %s\n", game.getName());
        final Field field = game.getField();
        for (int x = 0; x < field.getSize(); x++) {
            printLine(field, x);
        }
        printSeparator();
    }

    public void move(final Game game){

    }

    private void printLine(final Field field, final int x){
        printSeparator();
        System.out.println("|");
        for (int y = 0; y < field.getSize(); y++) {
            final Figure figure;
            try {
                figure = field.getFigure(new Point(x, y));
            } catch (InvalidPointException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
            System.out.println(figure != null ? figure : " ");
            System.out.println("|");
        }
    }

    private void  printSeparator(){
        System.out.println("-----------");
    }

}
