import java.util.Scanner;

class Rectangle {

    double length, breadth, side;

    void getRectangle() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle: ");
        length = sc.nextDouble();

        System.out.print("Enter Breadth of Rectangle: ");
        breadth = sc.nextDouble();
    }

    void getSquare() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side of Square: ");
        side = sc.nextDouble();
    }

    double areaRectangle() {
        return length * breadth;
    }

    double areaSquare() {
        return side * side;
    }

    double perimeterRectangle() {
        return 2 * (length + breadth);
    }

    double perimeterSquare() {
        return 4 * side;
    }
}

class Experiment3 {

    public static void main(String[] args) {

        Rectangle obj = new Rectangle();

        System.out.println("\n----- RECTANGLE -----\n");

        obj.getRectangle();

        double rectArea = obj.areaRectangle();
        double rectPerimeter = obj.perimeterRectangle();

        System.out.println("Area of Rectangle = " + rectArea);
        System.out.println("Rubber Material Required (Edges) = " + rectPerimeter);
        System.out.println("Paper Material Required (Front & Back) = " + (2 * rectArea));

        System.out.println("\n----- SQUARE -----\n");

        obj.getSquare();

        double squareArea = obj.areaSquare();
        double squarePerimeter = obj.perimeterSquare();

        System.out.println("Area of Square = " + squareArea);
        System.out.println("Rubber Material Required (Edges) = " + squarePerimeter);
        System.out.println("Paper Material Required (Front & Back) = " + (2 * squareArea));
    }
}
