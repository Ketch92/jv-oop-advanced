package core.basesyntax.figure.producers;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.figures.Circle;
import core.basesyntax.figure.figures.IsoscelesTrapezoid;
import core.basesyntax.figure.figures.Rectangle;
import core.basesyntax.figure.figures.RightTriangle;
import core.basesyntax.figure.figures.Square;
import java.util.Random;

public class FigureProducer {

    public Figure getRandomFigure() {
        Random randomizer = new Random();
        int bound = 1000;

        switch (new Random().nextInt(5)) {
            case 0:
                return new Circle(ColorProducer.getRandomColor(),
                        randomizer.nextInt(bound));
            case 1:
                return new Square(ColorProducer.getRandomColor(),
                        randomizer.nextInt(bound));
            case 2:
                return new Rectangle(ColorProducer.getRandomColor(),
                        randomizer.nextInt(bound),
                        randomizer.nextInt(bound));
            case 3:
                return new RightTriangle(ColorProducer.getRandomColor(),
                        randomizer.nextInt(bound),
                        randomizer.nextInt(bound));
            case 4:
            default:
                return new IsoscelesTrapezoid(ColorProducer.getRandomColor(),
                        randomizer.nextInt(bound),
                        randomizer.nextInt(bound),
                        randomizer.nextInt(bound));
        }
    }

    public Figure[] getRandomFigures() {
        return getRandomFigures(Integer.MAX_VALUE - 8);
    }

    public Figure[] getRandomFigures(int amount) {
        Figure[] figures = new Figure[new Random().nextInt(amount + 1)];

        int index = 0;

        while (index < figures.length) {
            figures[index++] = getRandomFigure();
        }

        return figures;
    }
}
