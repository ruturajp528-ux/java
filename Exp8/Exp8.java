import java.util.Scanner;

class Radius {

    double r;

    void getRadius() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        r = sc.nextDouble();
    }
}

class Circle extends Radius {

    double area;

    void findArea() {

        area = Math.PI * r * r;

        System.out.println("Area of circle = " + area);
    }
}

class Sphere extends Circle {

    double volume;

    void findVolume() {

        volume = (4.0 / 3.0) * Math.PI * r * r * r;

        System.out.println("Volume of sphere = " + volume);
    }
}

class Experiment8 {

    public static void main(String[] args) {

        Sphere s = new Sphere();

        s.getRadius();
        s.findArea();
        s.findVolume();
    }
}
