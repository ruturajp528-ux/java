import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    int academicMarks;

    Student(int rollNo, String name, int academicMarks) {

        this.rollNo = rollNo;
        this.name = name;
        this.academicMarks = academicMarks;
    }

    void displayStudent() {

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Academic Marks: " + academicMarks);
    }
}

interface Sports {

    int sportsGraceMarks = 10;

    void displaySportsMarks();
}

class Result extends Student implements Sports {

    int totalMarks;

    Result(int rollNo, String name, int academicMarks) {

        super(rollNo, name, academicMarks);

        totalMarks = academicMarks + sportsGraceMarks;
    }

    public void displaySportsMarks() {

        System.out.println("Sports Grace Marks: " + sportsGraceMarks);
    }

    void displayResult() {

        System.out.println("Total Marks: " + totalMarks);
    }
}

public class Experiment9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT RESULT =====");

        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Academic Marks: ");
        int academicMarks = sc.nextInt();

        Result r = new Result(rollNo, name, academicMarks);

        System.out.println("\n===== RESULT =====");

        Student s = r;
        s.displayStudent();

        Sports sp = r;
        sp.displaySportsMarks();

        r.displayResult();

        sc.close();
    }
}
