import java.util.Scanner;

public class Main {
//    private static final Test test = new Test();
    private static void showConst (){
        System.out.println("(-2.0, 2.0) -> " + picture.getColor(-5.4, 0.7));
        System.out.println("(-2.0, -2.0) -> " + picture.getColor(4, 0));
        System.out.println("(2.0, -3.0) -> " + picture.getColor(9, -9));
        System.out.println("(3.0, 2.0) -> " + picture.getColor(-2, 1));
        System.out.println("(3.0, 2.0) -> " + picture.getColor(7, 7));}
    public static void main(String[] args) {
            showConst();
            if(test.tests()){


            System.out.print("Введите x: ");
            double x = readNum();

            System.out.print("Введите y: ");
            double y = readNum();
        printColorForPoint(x, y);
    } else{

        System.out.println("Ошибка, введите новые данные");
            }

    } public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s%n", x, y, picture.getColor(x, y));
    }
    private static double readNum() {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();
        if (Math.abs(value) > 10) {
            System.out.println("Ошибка, координаты не найдены ");
            System.exit(0);
        }
        return value;
    }
    private static final Picture picture = new Picture(new Parabola(-6, 4, 0.125),
            new Circle (-6, 0, 2),
            new Circle (-2, -2, 4),
            new Circle (4, 0, 4));

    public static Test getTest() {
        return test;
    }
    private static final Test test = new Test();
}