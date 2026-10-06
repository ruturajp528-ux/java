import java.util.Scanner;

class AreaCalculator {

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double side) {
        return side * side;
    }

    public double area(double radius, boolean isCircle) {
        return 3.14159 * radius * radius;
    }

    public double area(double base, double height, char triangle) {
        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        System.out.println("Area Calculation for Different Shapes");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.print("Choose shape (1-4): ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter width: ");
                double width = sc.nextDouble();

                System.out.println("Area of Rectangle: " +
                        ac.area(length, width));
                break;

            case 2:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();

                System.out.println("Area of Square: " +
                        ac.area(side));
                break;

            case 3:
                System.out.print("Enter radius of circle: ");
                double radius = sc.nextDouble();

                System.out.println("Area of Circle: " +
                        ac.area(radius, true));
                break;

            case 4:
                System.out.print("Enter base of triangle: ");
                double base = sc.nextDouble();

                System.out.print("Enter height of triangle: ");
                double height = sc.nextDouble();

                System.out.println("Area of Triangle: " +
                        ac.area(base, height, 'T'));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
