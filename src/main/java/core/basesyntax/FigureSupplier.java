package core.basesyntax;

import java.util.Random;

import static java.lang.Math.random;

public class FigureSupplier {
    private static final int MAX_VALUE = 7;
    private static final int FIGURE_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
       int number = random.nextInt(FIGURE_NUMBER);

        switch (number) {
            case 1: return getDefaultFigure();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getIsoscelesTrapezoid();
            default: return getRandomSquare();
        }
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
    }
    
    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}