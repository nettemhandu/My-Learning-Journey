public class AreaCalculator {

    /**
     * This is a area calculator that calculates the area of four different shapes
     * Square, Rectangle, Triangle, Circle
     */
    public static void main(String[] args) {
        System.out.println("Thank you for using the area calculator");
        System.out.println("This calculator let's you get the area of: ");
        System.out.println("1 - Square\n2 - Rectangle\n3 - Triangle\n4 - Circle\n");

        double square = areaSquare(2);
        double rectangle =  areaRectangle(1, 2);
        double triangle = areaTriangle(1, 2);
        double circle = areaCircle(2);

        printAreas(square, rectangle, triangle, circle);

    }

    /**
     * Function name: areaSquare - returns the area of a square.
     * @param side (double)
     * @return the area (double)
     */

    public static double areaSquare(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Error: impossible");
        } else {
            return Math.pow(side, 2);
        }
    }

    /**
     * Function name: areaRectangle – returns the area of a rectangle.
     * @param length (double).
     * @param width  (double).
     * @return the area (double)
     */
    public static double areaRectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Error: impossible");
        } else {
            return length * width;
        }
    }


    /**
     * Function name: areaTriangle – it returns the area of a triangle.
     * @param base: (double).
     * @param height: (double).
     * @return the area (double)
     */
    public static double areaTriangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Error: impossible");
        } else {
            return (base * height) / 2;
        }
    }


    /**
     * Function name: areaCircle – it returns the area of a circle.
     * @param radius (double).
     * @return area (double)
     */
    public static double areaCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Error: impossible");
        } else {
            return Math.PI*Math.pow(radius, 2);
        }
    }


    /**
     * Function name: printAreas – it prints four areas
     * @param square – square area (double)
     * @param rectangle – rectangle area (double)
     * @param triangle – triangle area (double)
     * @param circle – circle area (double)
     */

    public static void printAreas(double square, double rectangle, double triangle, double circle) {
        System.out.println("\"Square area : " + square);
        System.out.println("\"Rectangle area : " + rectangle);
        System.out.println("\"Triangle area : " + triangle);
        System.out.println("\"Circle circle : " + circle);
    }
}
