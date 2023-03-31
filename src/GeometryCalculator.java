public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double S = Math.PI * Math.pow(Math.abs(radius), 2);
        S = Math.round(S * 100.0) / 100.0;
        return S;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        double S = 4 * Math.PI * Math.pow(Math.abs(radius), 2);
        S = Math.round(S * 100.0) / 100.0;
        return S;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {

        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double getTriangleSquare(double a, double b, double c) {

        if (isTriangleRightAngled(a, b, c)) {
            double halfPerimeter = (a + b + c) / 2;
            double perimeter = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b)
                    * (halfPerimeter - c));
            return Math.round(perimeter * 100.0) / 100.0;
        }
        System.out.print("Треугольник невозможно построить, код ");
        return -1;
    }
}
