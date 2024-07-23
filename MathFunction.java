public class MathFunction {

    public static double pi = 3.14159265359;
    public static double e = 2.71828182846;


    public static double circleArea(double radius) {
        return pi * radius * radius;
    }


    public static double powerOfE(double a) {
        return Math.pow(e, a);
    }


    public static double triangleArea(double a, double b, double c) {

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }


    public MathFunction() {

    }

    public static void main(String[] args) {

        double radius = 5.0;
        double circleArea = MathFunction.circleArea(radius);
        System.out.println("Area of circle with radius " + radius + " is: " + circleArea);

        double exponent = 2.0;
        double power = MathFunction.powerOfE(exponent);
        System.out.println("e raised to the power of " + exponent + " is: " + power);

        double side1 = 3.0, side2 = 4.0, side3 = 5.0;
        double triangleArea = MathFunction.triangleArea(side1, side2, side3);
        System.out.println("Area of triangle with sides " + side1 + ", " + side2 + ", " + side3 + " is: " + triangleArea);
    }
}
