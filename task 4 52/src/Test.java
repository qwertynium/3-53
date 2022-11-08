public class Test {
    public boolean tests() {

        if ((picture.getColor(4, 8) == SimpleColor.GREEN)
                && (picture.getColor(4, 0) == SimpleColor.BLUE)
                && (picture.getColor(-3, 0) == SimpleColor.ORANGE)
                && (picture.getColor(-7, 1) == SimpleColor.GRAY)
        )
        {
            return true;
        } else return false;
    }

    private static final Picture picture = new Picture(new Parabola(-6, 4, 1/8),
            new Circle (-6, 0, 2),
            new Circle (-2, -2, 4),
            new Circle (4, 0, 4));
}
