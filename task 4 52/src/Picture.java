public class Picture {
    private final Parabola PARABOLA;
    Circle CIRCLE1 = new Circle(-6, 0, 2);
    Circle CIRCLE2 = new Circle(-2, -2, 4);
    Circle CIRCLE3 = new Circle(4, 0, 4);

    public Picture(Parabola PARABOLA, Circle CIRCLE1, Circle CIRCLE2, Circle CIRCLE3) {
        this.PARABOLA = PARABOLA;
        this.CIRCLE1 = CIRCLE1;
        this.CIRCLE2 = CIRCLE2;
        this.CIRCLE3 = CIRCLE3;
    }

    public SimpleColor getColor(double x , double y) {
        if (CIRCLE1.isPointRightOfCircle(x, y)
                && !PARABOLA.isPointRightOfParabola(x, y)
            && !CIRCLE2.isPointRightOfCircle(x, y) || CIRCLE1.isPointRightOfCircle(x, y)
                && PARABOLA.isPointRightOfParabola(x, y) && CIRCLE2.isPointRightOfCircle(x, y)) {
            return SimpleColor.GRAY;

        } else if (CIRCLE2.isPointRightOfCircle(x, y)
                && PARABOLA.isPointRightOfParabola(x, y)
                    && !CIRCLE3.isPointRightOfCircle(x, y) && !CIRCLE1.isPointRightOfCircle(x, y)) {
                return SimpleColor.ORANGE;

        } else if (CIRCLE3.isPointRightOfCircle(x, y)  ) {
                    return SimpleColor.BLUE;

        } else if (CIRCLE1.isPointRightOfCircle(x, y) && PARABOLA.isPointRightOfParabola(x, y)
                    && !CIRCLE2.isPointRightOfCircle(x, y)) {
                    return SimpleColor.YELLOW;
        } else if (PARABOLA.isPointRightOfParabola(x, y) && !CIRCLE3.isPointRightOfCircle(x, y)
                    && !CIRCLE1.isPointRightOfCircle(x, y) && !CIRCLE2.isPointRightOfCircle(x, y)) {
                    return SimpleColor.GREEN;
        }
        return SimpleColor.BLUE;
    }
}



